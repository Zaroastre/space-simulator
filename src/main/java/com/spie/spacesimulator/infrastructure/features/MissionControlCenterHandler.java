package com.spie.spacesimulator.infrastructure.features;

import com.spie.spacesimulator.infrastructure.entities.OperationalBuilding;
import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;

public interface MissionControlCenterHandler {

        SpaceVehicule[] listAllLocalSatellites();

        SpaceVehicule[] findLocalSatellitesBy(Object filter);

        void connectToRemoteMissionControlCenter();

        void disconnectFromRemoteMissionControlCenter();

        SpaceVehicule[] listAllRemoteSatellitesByMissionControlCenter(OperationalBuilding missionControlCenter);

        SpaceVehicule[] findRemoteSatellitesByMissionControlCenterBy(OperationalBuilding missionControlCenter,
                        Object filter);

        void sendCommandToLocalSatellite(SpaceVehicule satellite, Object command);

        void sendCommandToRemoteMissionControlCenterToSatellite(OperationalBuilding missionControlCenter,
                        SpaceVehicule satellite,
                        Object command);
}
