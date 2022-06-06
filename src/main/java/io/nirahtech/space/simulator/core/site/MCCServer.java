package io.nirahtech.space.simulator.core.site;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.nirahtech.space.simulator.core.site.api.RemoteMcc;

class MCCServer extends Thread {

    private final int port;
    private boolean isRunning = false;
    private ServerSocket socket = null;
    private final Set<RemoteMcc> remotesMCCs = new HashSet<>();

    MCCServer(final int port) {
        super("MCCServer");
        this.port = port;
    }

    void powerOn() {
        this.start();
    }

    private void initialize() throws IOException {
        this.socket = new ServerSocket(port);
    }

    private void clearZombiesConnections() {
        synchronized (this.remotesMCCs) {
            List<RemoteMcc> zombies = new ArrayList<>();
            this.remotesMCCs.forEach((remoteMCC) -> {
                if (!remoteMCC.isConnected()) {
                    zombies.add(remoteMCC);
                }
            });
            this.remotesMCCs.removeAll(zombies);
        }

    }

    @Override
    public void run() {
        try {
            this.initialize();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        this.isRunning = this.socket != null;
        while (this.isRunning) {
            try (Socket client = this.socket.accept()) {
                this.clearZombiesConnections();
                RemoteMcc remoteMCC = new RemoteMccClient(client);
                this.remotesMCCs.add(remoteMCC);
            } catch (IOException e) {
                e.printStackTrace();
                this.powerOff();
            }
        }
    }

    void powerOff() {
        this.isRunning = false;

    }

    /**
     * @return the remotesMCCs
     */
    public RemoteMcc[] getRemotesMCCs() {
        RemoteMcc[] result = new RemoteMcc[this.remotesMCCs.size()];
        result = this.remotesMCCs.toArray(result);
        return result;
    }
}
