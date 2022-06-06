package io.nirahtech.space.simulator.core.satellite;

import java.io.File;
import java.util.UUID;

import io.nirahtech.space.simulator.core.commons.SpatialCoordinates;
import io.nirahtech.space.simulator.core.models.definitions.CameraFilter;
import io.nirahtech.space.simulator.core.models.definitions.Command;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

public final class Satellite implements ObservationSpacecraft {

    private final String name = UUID.randomUUID().toString();
    private CameraFilter filter = null;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void executeCommand(Command command) {
        if (command != null) {
            command.execute();
        }
    }

    @Override
    public File downloadPicture(File picture) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public File takePicture() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void useCameraFilter(CameraFilter filter) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeCameraFilter(CameraFilter filter) {
        // TODO Auto-generated method stub

    }

    @Override
    public void flyOff() {
        // TODO Auto-generated method stub

    }

    @Override
    public void toutchDown() {
        // TODO Auto-generated method stub

    }

    @Override
    public void move(final SpatialCoordinates coordinates) {
        // TODO Auto-generated method stub

    }

    @Override
    public void powerOff() {
        // TODO Auto-generated method stub

    }

    @Override
    public void powerOn() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isStarted() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public File[] listPictures() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removePicture(File picture) {
        // TODO Auto-generated method stub

    }

}
