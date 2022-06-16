package com.spie.spacesimulator.interfaces.api;

import com.spie.spacesimulator.infrastructure.features.MissionControlCenterHandler;
import com.spie.spacesimulator.infrastructure.features.SatelliteHandler;

public interface UserInterface
		extends MissionControlCenterProvider, MissionControlCenterHandler, SatelliteProvider, SatelliteHandler {

	void start();
}
