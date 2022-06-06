package io.nirahtech.space.simulator.core.site.api;

import java.util.Optional;

import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

public interface RemoteMcc {
    String getIdentifier();

    ObservationSpacecraft[] listAllSpacecraft();

    Optional<ObservationSpacecraft> getSpacecraftByIdentifier(final String identifier);

    String getSiteIdentifier();

    boolean isConnected();
}
