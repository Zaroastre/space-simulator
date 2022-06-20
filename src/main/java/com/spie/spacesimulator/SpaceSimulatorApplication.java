package com.spie.spacesimulator;

import java.util.Locale;
import java.util.UUID;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.spie.spacesimulator.business.factories.MissionControlCenterFactory;
import com.spie.spacesimulator.business.factories.ObservationSatelliteFactory;
import com.spie.spacesimulator.business.factories.SatelliteFactory;
import com.spie.spacesimulator.business.factories.TelecomSatelliteFactory;
import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;
import com.spie.spacesimulator.interfaces.api.UserInterface;
import com.spie.spacesimulator.interfaces.cli.CommandLineInterface;
import com.spie.spacesimulator.interfaces.gui.SwingGuiInterface;

/**
 * Class that's the entry point of the application.
 * 
 * @author Nicolas METIVIER <nicolas.metivier@spie.com>
 * @category Runtime
 * @since 1.0-SNAPSHOT
 * @serial 20220607133715
 * @version 1.0.0
 */
public class SpaceSimulatorApplication {

    Runtime runtime =Runtime.getRuntime();

    /**
     * The entry point of the application.
     * 
     * @param commandLineArguments List of passed arguments in the command line when
     *                             application was called.
     */
    public static void main(String[] commandLineArguments) {

        UserInterface[] userInterfaces = new UserInterface[2];
        userInterfaces[0] = new CommandLineInterface();
        userInterfaces[1] = new SwingGuiInterface();

        for (UserInterface userInterface : userInterfaces) {
            // userInterface.start();
        }

        final Location toulouse = new Location(Locale.FRANCE, "Toulouse");
        final String siteIdentifier = UUID.randomUUID().toString().split("-")[0];
        final MissionControlCenter missionControlCenter = new MissionControlCenter(siteIdentifier, toulouse);
        System.out.println(missionControlCenter.getIdentifier());

        MissionControlCenterFactory factory1 = MissionControlCenterFactory.getInstance();
        System.out.println(factory1);
        MissionControlCenterFactory factory2 = MissionControlCenterFactory.getInstance();
        System.out.println(factory2);

        SatelliteFactory observationSatelliteFactory = ObservationSatelliteFactory.getInstance();
        SatelliteFactory telecomSatelliteFactory = TelecomSatelliteFactory.getInstance();

        SpaceVehicule sateliteObsersavation = observationSatelliteFactory.create("OBS1");
        SpaceVehicule sateliteTelecom = telecomSatelliteFactory.create("TELCOM1");

    }
}
