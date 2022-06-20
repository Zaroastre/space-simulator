package com.spie.spacesimulator.business.data;

import com.spie.spacesimulator.business.models.SatelliteModel;
import com.spie.spacesimulator.infrastructure.enumerations.SatelliteType;

public class ObservationSatellite extends SatelliteModel {

    public ObservationSatellite(String name) {
        super(name, SatelliteType.OBSERVATION);
    }

}
