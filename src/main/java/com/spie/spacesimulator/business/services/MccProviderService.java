package com.spie.spacesimulator.business.services;

import com.spie.spacesimulator.Location;
import com.spie.spacesimulator.business.models.MissionControlCenterModel;
import com.spie.spacesimulator.infrastructure.entities.OperationalBuilding;

public class MccProviderService {
    public final OperationalBuilding create(final String name, final Location location) {
        return new MissionControlCenterModel(name, location);
    }
}
