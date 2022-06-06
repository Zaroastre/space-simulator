package io.nirahtech.space.simulator.core.site;

import java.io.IOException;
import java.net.Socket;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import io.nirahtech.space.simulator.core.models.definitions.Command;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;
import io.nirahtech.space.simulator.core.satellite.Satellite;
import io.nirahtech.space.simulator.core.site.api.MccConnector;
import io.nirahtech.space.simulator.core.site.api.Powerable;
import io.nirahtech.space.simulator.core.site.api.RemoteMcc;
import io.nirahtech.space.simulator.core.site.api.SpacecraftConnector;
import io.nirahtech.space.simulator.core.site.api.SpacecraftController;
import io.nirahtech.space.simulator.core.site.api.SpacecraftProvider;
import io.nirahtech.space.simulator.infrastructure.exceptions.ShutdownException;
import io.nirahtech.space.simulator.infrastructure.exceptions.StartupException;

/**
 * MissionControlCenter
 */
@Component
public final class MissionControlCenter
        implements Powerable, MccConnector, SpacecraftProvider, SpacecraftConnector, SpacecraftController, RemoteMcc {

    private final Set<ObservationSpacecraft> spacecrafts = new HashSet<>();
    private String identifier = UUID.randomUUID().toString();
    private MCCServer mccServer;
    private Set<RemoteMcc> remoteMCCs = new HashSet<>();

    public MissionControlCenter() {

    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    public void setPort(final int port) {
        this.mccServer = new MCCServer(port);
    }

    @Override
    public RemoteMcc connect(String hostname, int port) {
        Socket client = null;
        RemoteMcc remoteMccServer = null;
        try {
            client = new Socket(hostname, port);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (client != null) {
            remoteMccServer = new RemoteMccClient(client);
            this.remoteMCCs.add(remoteMccServer);
        }
        return remoteMccServer;

    }

    @Override
    public boolean isConnected() {
        return this.mccServer != null && this.mccServer.getRemotesMCCs().length > 0;
    }

    @Override
    public boolean isConnectedWith(RemoteMcc remoteMCC) {
        return false;
    }

    @Override
    public void disconnect() {
        // TODO Auto-generated method stub

    }

    @Override
    public void disconnect(RemoteMcc remoteMCC) {
        // TODO Auto-generated method stub

    }

    @Override
    public void start() throws StartupException {
        this.mccServer.powerOn();
    }

    @Override
    public void stop() throws ShutdownException {
        this.mccServer.powerOff();
    }

    @Override
    public ObservationSpacecraft createSpacecraft() {
        ObservationSpacecraft newSatellite = null;
        if (this.spacecrafts.size() < 5) {
            newSatellite = new Satellite();
            this.spacecrafts.add(newSatellite);
        }
        return newSatellite;
    }

    @Override
    public void sendCommand(Command command, ObservationSpacecraft to) {
        // TODO Auto-generated method stub

    }

    @Override
    public void connect(ObservationSpacecraft spacecraft) {
        // TODO Auto-generated method stub

    }

    @Override
    public ObservationSpacecraft[] listAllSpacecraft() {
        ObservationSpacecraft[] result = new ObservationSpacecraft[this.spacecrafts.size()];
        result = this.spacecrafts.toArray(result);
        return result;
    }

    @Override
    public Optional<ObservationSpacecraft> getSpacecraftByIdentifier(String identifier) {
        return this.spacecrafts
                .stream()
                .filter((spacecraft) -> spacecraft.getName().equalsIgnoreCase(identifier)).findFirst();
    }

    @Override
    public String getSiteIdentifier() {
        return this.identifier;
    }

    public RemoteMcc[] getRemotesMCCs() {
        RemoteMcc[] result = new RemoteMcc[this.remoteMCCs.size()];
        result = this.remoteMCCs.toArray(result);
        return result;
    }

    public Optional<RemoteMcc> getRemoteMCCByIdentifier(final String name) {
        return Stream.of(this.getRemotesMCCs())
                .filter((remoteMCC) -> remoteMCC.getSiteIdentifier().equalsIgnoreCase(name))
                .findFirst();
    }

}