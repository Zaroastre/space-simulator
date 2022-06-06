package io.nirahtech.space.simulator.interfaces.http.site.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nirahtech.space.simulator.core.models.definitions.Command;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;
import io.nirahtech.space.simulator.core.site.MissionControlCenter;
import io.nirahtech.space.simulator.core.site.api.RemoteMcc;
import io.nirahtech.space.simulator.interfaces.http.site.api.MissionControlCenterRemoteApi;

@RestController
@RequestMapping("/missions-contol-centers")
public class MissionControlCenterRestApi implements MissionControlCenterRemoteApi {

    @Autowired
    private MissionControlCenter missionControlCenter;

    @PostMapping("satellite")
    @Override
    public ObservationSpacecraft createSpacecraft() {
        return this.missionControlCenter.createSpacecraft();
    }

    @GetMapping("local")
    @Override
    public MissionControlCenter getLocalMissionControlCenter() {
        return missionControlCenter;
    }

    @GetMapping("")
    @Override
    public List<RemoteMcc> findAll() {
        return Arrays.asList(missionControlCenter.getRemotesMCCs());
    }

    @GetMapping("{missionControlCenterIdentifier}")
    @Override
    public RemoteMcc findById(String missionControlCenterIdentifier) {
        RemoteMcc result = null;
        if (this.missionControlCenter.getIdentifier().equalsIgnoreCase(missionControlCenterIdentifier)) {
            result = this.missionControlCenter;
        } else {
            Optional<RemoteMcc> potentialMCC = Stream.of(this.missionControlCenter.getRemotesMCCs())
                    .filter((mcc) -> mcc.getIdentifier().equalsIgnoreCase(missionControlCenterIdentifier))
                    .findFirst();
            if (potentialMCC.isPresent()) {
                result = potentialMCC.get();
            }
        }
        return result;
    }

    @GetMapping("{missionControlCenterIdentifier}/stallites")
    @Override
    public List<ObservationSpacecraft> listAllSatellitesPerMCC(String missionControlCenterIdentifier) {
        List<ObservationSpacecraft> result = null;
        RemoteMcc mcc = this.findById(missionControlCenterIdentifier);
        if (mcc != null) {
            result = Arrays.asList(mcc.listAllSpacecraft());
        }
        return result;
    }

    @GetMapping("{missionControlCenterIdentifier}/stallites/{satelliteIdentifier}")
    @Override
    public ObservationSpacecraft getSatelliteById(String missionControlCenterIdentifier, String satelliteIdentifier) {
        ObservationSpacecraft result = null;
        RemoteMcc mcc = this.findById(missionControlCenterIdentifier);
        if (mcc != null) {
            Optional<ObservationSpacecraft> potentialSatellite = mcc.getSpacecraftByIdentifier(satelliteIdentifier);
            if (potentialSatellite.isPresent()) {
                result = potentialSatellite.get();
            }
        }
        return result;
    }

    @PostMapping("{missionControlCenterIdentifier}/stallites/{satelliteIdentifier}/commands")
    @Override
    public void sendCommandToSatellite(String missionControlCenterIdentifier, String satelliteIdentifier,
            Command command) {
        ObservationSpacecraft target = null;
        RemoteMcc mcc = this.findById(missionControlCenterIdentifier);
        if (mcc != null) {
            Optional<ObservationSpacecraft> potentialSatellite = mcc.getSpacecraftByIdentifier(satelliteIdentifier);
            if (potentialSatellite.isPresent()) {
                target = potentialSatellite.get();
            }
        }
        if (target != null) {
            target.executeCommand(command);
        }
    }

}
