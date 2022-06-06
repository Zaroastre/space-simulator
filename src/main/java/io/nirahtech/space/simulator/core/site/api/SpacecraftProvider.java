package io.nirahtech.space.simulator.core.site.api;

import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

public interface SpacecraftProvider {
    ObservationSpacecraft createSpacecraft();
}
