package com.spie.spacesimulator.interfaces.dto;

import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;
import com.spie.spacesimulator.infrastructure.enumerations.SatelliteType;

public class SatelliteDto implements SpaceVehicule {
    private String name;
    private SatelliteType type;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SatelliteType getType() {
        return type;
    }

    public void setType(SatelliteType type) {
        this.type = type;
    }

}
