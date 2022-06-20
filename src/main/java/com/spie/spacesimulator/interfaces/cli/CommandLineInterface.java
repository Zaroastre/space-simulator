package com.spie.spacesimulator.interfaces.cli;

import java.util.Locale;
import java.util.Scanner;

import com.spie.spacesimulator.Location;
import com.spie.spacesimulator.business.services.MccProviderService;
import com.spie.spacesimulator.infrastructure.entities.OperationalBuilding;
import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;
import com.spie.spacesimulator.interfaces.api.UserInterface;

public class CommandLineInterface implements UserInterface {

    private void displaySatelliteMenu(final Scanner keyboard) {
        System.out.println("1. Turn ON");
        System.out.println("2. Launch");
        System.out.println("3. Move");
        System.out.println("4. Take picture");
        System.out.println("5. List pictures");
        System.out.println("6. Delete picture");
        System.out.println("7. Download picture");
        System.out.println("8. Apply filter");
        System.out.println("9. Get active filter");
        System.out.println("10. Remove filter");
        System.out.println("11. Land");
        System.out.println("12. Turn OFF");
    }

    private void displayRemoteMissionControlCenterMenu(final Scanner keyboard) {
        System.out.println("1. List satellites");
        System.out.println("2. Connect to satellite");
        System.out.println("0. Leave remote Mission Control Center");
    }

    private void displayMissionControlCenterMenu(final Scanner keyboard) {
        System.out.println("1. Create a new satellite");
        System.out.println("2. List local satellites");
        System.out.println("3. List remotes Mission Control Centers");
        System.out.println("4. Connect to local satellite");
        System.out.println("5. Add remote Mission Control Center");
        System.out.println("6. Connect to remote Mission Control Center");
        System.out.println("7. Leave Mission Control Center");
    }

    private void displayMainMenu(final Scanner keyboard) {
        System.out.println("Welcome on Space Simulator.");
        System.out.println("1. Create a new Mission Control Center");
        System.out.println("2. Connect to local Mission Control Center");
        System.out.println("0. Quit the simulation.");
        boolean isApplicationRunning = true;
        do {
            String userChoice = keyboard.nextLine();
            switch (userChoice) {
                case "0":
                    isApplicationRunning = false;
                    break;
                case "1":
                    System.out.println("Must call MCC Factory...");
                    MccProviderService service = new MccProviderService();
                    service.create("MCC1", new Location(Locale.FRANCE, "Toulouse"));
                    break;
                case "2":
                    this.displayMissionControlCenterMenu(keyboard);

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
        Scanner keyboard = new Scanner(System.in);
        this.displayMainMenu(keyboard);
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
