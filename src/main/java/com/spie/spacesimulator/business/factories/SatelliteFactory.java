package com.spie.spacesimulator.business.factories;

import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;
import com.spie.spacesimulator.infrastructure.enumerations.SatelliteType;

public interface SatelliteFactory {
    SpaceVehicule create(String name);
}
