package io.nirahtech.space.simulator.core.models.definitions;

import io.nirahtech.space.simulator.core.commons.SpatialCoordinates;

public interface Spacecraft {
    String getName();

    void flyOff();

    void toutchDown();

    void move(final SpatialCoordinates coordinates);

    void powerOff();

    void powerOn();

    boolean isStarted();

}
