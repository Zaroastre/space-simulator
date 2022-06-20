package com.spie.spacesimulator.business.factories;

import com.spie.spacesimulator.business.data.TelecomSatellite;
import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;

/**
 * TelecomSatelliteFactory
 */
public class TelecomSatelliteFactory implements SatelliteFactory {

    private static SatelliteFactory singleton = null;

    public static SatelliteFactory getInstance() {
        if (singleton == null) {
            singleton = new TelecomSatelliteFactory();
        }
        return singleton;
    }

    private TelecomSatelliteFactory() {

    }

    @Override
    public SpaceVehicule create(String name) {
        return new TelecomSatellite(name);
    }

}