package com.spie.spacesimulator.interfaces.api;

import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;

/**
 * SatelliteProvider
 */
public interface SatelliteProvider {
    SpaceVehicule createSatellite();

    void destroySatellite(SpaceVehicule spaceVehicule);
}