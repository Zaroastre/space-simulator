package io.nirahtech.space.simulator.core.site.api;

import io.nirahtech.space.simulator.core.models.definitions.Command;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

public interface SpacecraftController {
    void sendCommand(Command command, ObservationSpacecraft to);
}
