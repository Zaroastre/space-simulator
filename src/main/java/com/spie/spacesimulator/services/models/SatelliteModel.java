package com.spie.spacesimulator.services.models;

import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;
import com.spie.spacesimulator.infrastructure.enumerations.SatelliteType;

public class SatelliteModel implements SpaceVehicule {

    private final String name;
    private final SatelliteType type;

    public SatelliteModel(final String name, final SatelliteType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public SatelliteType getType() {
        return type;
    }

    @Override
    public void startSatellite() {
        // TODO Auto-generated method stub

    }

    @Override
    public void launchSatellite() {
        // TODO Auto-generated method stub

    }

    @Override
    public void commandSatellite() {
        // TODO Auto-generated method stub

    }

    @Override
    public void landSatellite() {
        // TODO Auto-generated method stub

    }

    @Override
    public void stopSatellite() {
        // TODO Auto-generated method stub

    }

}
