package com.spie.spacesimulator.business.data;

import com.spie.spacesimulator.business.models.SatelliteModel;
import com.spie.spacesimulator.infrastructure.enumerations.SatelliteType;

public class TelecomSatellite extends SatelliteModel {

    public TelecomSatellite(String name) {
        super(name, SatelliteType.TELECOMUNICATION);
    }

}
