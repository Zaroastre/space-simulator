package io.nirahtech.space.simulator.interfaces.http.site.api;

import java.util.List;

import io.nirahtech.space.simulator.core.models.definitions.Command;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;
import io.nirahtech.space.simulator.core.site.MissionControlCenter;
import io.nirahtech.space.simulator.core.site.api.RemoteMcc;

public interface MissionControlCenterRemoteApi {

    ObservationSpacecraft createSpacecraft();

    List<RemoteMcc> findAll();

    MissionControlCenter getLocalMissionControlCenter();

    RemoteMcc findById(final String mccIdentifier);

    List<ObservationSpacecraft> listAllSatellitesPerMCC(final String mccIdentifier);

    ObservationSpacecraft getSatelliteById(final String missionControlCenterIdentifier,
            final String satelliteIdentifier);

    void sendCommandToSatellite(String missionControlCenterIdentifier, String satelliteIdentifier, Command command);

}
