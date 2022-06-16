package com.spie.spacesimulator.services.models;

import java.util.HashSet;
import java.util.Set;

import com.spie.spacesimulator.Location;
import com.spie.spacesimulator.infrastructure.entities.OperationalBuilding;
import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;

public class MissionControlCenterModel implements OperationalBuilding {

    private final String name;
    private final Location location;
    private Set<SpaceVehicule> spaceVehicules = new HashSet<>();

    public MissionControlCenterModel(final String name, final Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public Set<SpaceVehicule> getSpaceVehicules() {
        return this.spaceVehicules;
    }

    public void setSpaceVehicules(Set<SpaceVehicule> spaceVehicules) {
        this.spaceVehicules = spaceVehicules;
    }

    @Override
    public SpaceVehicule[] listAllLocalSatellites() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SpaceVehicule[] findLocalSatellitesBy(Object filter) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void connectToRemoteMissionControlCenter() {
        // TODO Auto-generated method stub

    }

    @Override
    public void disconnectFromRemoteMissionControlCenter() {
        // TODO Auto-generated method stub

    }

    @Override
    public SpaceVehicule[] listAllRemoteSatellitesByMissionControlCenter(OperationalBuilding missionControlCenter) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SpaceVehicule[] findRemoteSatellitesByMissionControlCenterBy(OperationalBuilding missionControlCenter,
            Object filter) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void sendCommandToLocalSatellite(SpaceVehicule satellite, Object command) {
        // TODO Auto-generated method stub

    }

    @Override
    public void sendCommandToRemoteMissionControlCenterToSatellite(OperationalBuilding missionControlCenter,
            SpaceVehicule satellite, Object command) {
        // TODO Auto-generated method stub

    }

}
