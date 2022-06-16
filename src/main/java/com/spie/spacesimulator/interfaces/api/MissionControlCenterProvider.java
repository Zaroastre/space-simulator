package com.spie.spacesimulator.interfaces.api;

import com.spie.spacesimulator.infrastructure.entities.OperationalBuilding;

public interface MissionControlCenterProvider {
    OperationalBuilding createMissionControlCenter();

    void destroyMissionControlCenter(OperationalBuilding operationalBuilding);

}
