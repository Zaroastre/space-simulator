package com.spie.spacesimulator.business.factories;

import com.spie.spacesimulator.business.data.ObservationSatellite;
import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;

public class ObservationSatelliteFactory implements SatelliteFactory {

    private static SatelliteFactory singleton = null;

    public static SatelliteFactory getInstance() {
        if (singleton == null) {
            singleton = new ObservationSatelliteFactory();
        }
        return singleton;
    }

    private ObservationSatelliteFactory() {

    }
    
    @Override
    public SpaceVehicule create(String name) {
        return new ObservationSatellite(name);
    }

}
