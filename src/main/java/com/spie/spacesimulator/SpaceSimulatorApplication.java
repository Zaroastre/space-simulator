package com.spie.spacesimulator;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

import com.spie.spacesimulator.infrastructure.features.MissionControlCenterHandler;
import com.spie.spacesimulator.infrastructure.features.SatelliteHandler;
import com.spie.spacesimulator.interfaces.api.SatelliteProvider;
import com.spie.spacesimulator.interfaces.api.UserInterface;
import com.spie.spacesimulator.interfaces.cli.CommandLineInterface;
import com.spie.spacesimulator.interfaces.gui.SwingGuiInterface;
import com.spie.spacesimulator.interfaces.mappers.MissionControlCenterMapper;

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
            userInterface.start();
        }

        final Location toulouse = new Location(Locale.FRANCE, "Toulouse");
        final String siteIdentifier = UUID.randomUUID().toString().split("-")[0];
        final MissionControlCenter missionControlCenter = new MissionControlCenter(siteIdentifier, toulouse);
        System.out.println(missionControlCenter.getIdentifier());

        

    }
}
