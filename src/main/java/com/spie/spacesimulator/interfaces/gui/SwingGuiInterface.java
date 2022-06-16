package com.spie.spacesimulator.interfaces.gui;

import com.spie.spacesimulator.infrastructure.entities.OperationalBuilding;
import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;
import com.spie.spacesimulator.interfaces.api.UserInterface;

public class SwingGuiInterface implements UserInterface {

    @Override
    public void start() {
        System.out.println("Hello from SWUIG!");
    }

    @Override
    public OperationalBuilding createMissionControlCenter() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void destroyMissionControlCenter(OperationalBuilding operationalBuilding) {
        // TODO Auto-generated method stub

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

    @Override
    public SpaceVehicule createSatellite() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void destroySatellite(SpaceVehicule spaceVehicule) {
        // TODO Auto-generated method stub

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
    public void landSatellite() {
        // TODO Auto-generated method stub

    }

    @Override
    public void stopSatellite() {
        // TODO Auto-generated method stub

    }

    @Override
    public void commandSatellite() {
        // TODO Auto-generated method stub

    }

}
