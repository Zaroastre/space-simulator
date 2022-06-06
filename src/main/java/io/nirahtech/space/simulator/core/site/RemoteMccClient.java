package io.nirahtech.space.simulator.core.site;

import java.net.Socket;
import java.util.Optional;

import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;
import io.nirahtech.space.simulator.core.site.api.RemoteMcc;

class RemoteMccClient extends Thread implements RemoteMcc {

    private final Socket socket;
    private String identifier = null;
    private boolean isInitialized = false;

    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    RemoteMccClient(final Socket client) {
        this.socket = client;
    }

    @Override
    public ObservationSpacecraft[] listAllSpacecraft() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<ObservationSpacecraft> getSpacecraftByIdentifier(String identifier) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getSiteIdentifier() {
        return this.identifier;
    }

    @Override
    public boolean isConnected() {
        return (this.socket.isConnected() && !this.socket.isClosed());
    }

    @Override
    public void run() {
        if (this.isConnected()) {

        }
        this.isInitialized = true;
        while (this.isConnected()) {

        }
    }

}
