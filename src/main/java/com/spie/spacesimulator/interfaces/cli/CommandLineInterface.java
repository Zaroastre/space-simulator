package com.spie.spacesimulator.interfaces.cli;

import java.util.Scanner;

import com.spie.spacesimulator.infrastructure.entities.OperationalBuilding;
import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;
import com.spie.spacesimulator.interfaces.api.UserInterface;

public class CommandLineInterface implements UserInterface {

    private void displayRemoteMissionControlCenterMenu() {
        System.out.println("List satellites");
        System.out.println("Connect to satellite");
        System.out.println("Leave remote Mission Control Center");
    }

    private void displayMissionControlCenterMenu() {
        System.out.println("Create a new satellite");
        System.out.println("List local satellites");
        System.out.println("List remotes Mission Control Centers");
        System.out.println("Connect to local satellite");
        System.out.println("Add remote Mission Control Center");
        System.out.println("Connect to remote Mission Control Center");
    }

    private void displayMainMenu() {
        System.out.println("Welcome on Space Simulator.");
        System.out.println("1. Create a new Mission Control Center");
        System.out.println("1. Connect to local Mission Control Center");
        System.out.println("0. Quit the simulation.");

        Scanner keyboard = new Scanner(System.in);
        boolean isApplicationRunning = true;
        do {
            String userChoice = keyboard.nextLine();
            switch (userChoice) {
                case "0":
                    isApplicationRunning = false;
                    break;
                case "1":
                    System.out.println("Must call MCC Factory...");
                    break;
                case "2":
                    System.out.println("Must call Satellite Factory...");
                    break;
                default:
                    System.out.println("Invalid user choice.");
                    break;
            }

        } while (isApplicationRunning);
        keyboard.close();

    }

    @Override
    public void start() {
        this.displayMainMenu();
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
