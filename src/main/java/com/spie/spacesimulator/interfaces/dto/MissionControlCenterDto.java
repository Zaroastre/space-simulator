package com.spie.spacesimulator.interfaces.dto;

import java.util.HashSet;
import java.util.Set;

import com.spie.spacesimulator.Location;
import com.spie.spacesimulator.infrastructure.entities.OperationalBuilding;
import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;

public class MissionControlCenterDto implements OperationalBuilding {

    private String name;
    private Location location;
    private Set<SpaceVehicule> spaceVehicules = new HashSet<>();

    @Override
    public SpaceVehicule[] listAllLocalSatellites() {
        SpaceVehicule[] result = new SpaceVehicule[this.spaceVehicules.size()];
        result = this.spaceVehicules.toArray(result);
        return result;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<SpaceVehicule> getSpaceVehicules() {
        return this.spaceVehicules;
    }

}
