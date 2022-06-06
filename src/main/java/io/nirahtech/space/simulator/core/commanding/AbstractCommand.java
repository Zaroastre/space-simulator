package io.nirahtech.space.simulator.core.commanding;

import io.nirahtech.space.simulator.core.models.definitions.Command;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

abstract class AbstractCommand implements Command {
    protected final ObservationSpacecraft spacecraft;
    protected final String fromMCC;
    protected final String toSpacecraft;

    protected AbstractCommand(final ObservationSpacecraft spacecraft, final String fromMCC, final String toSpacecraft) {
        this.spacecraft = spacecraft;
        this.fromMCC = fromMCC;
        this.toSpacecraft = toSpacecraft;
    }

    @Override
    public String fromMCC() {
        return this.fromMCC;
    }

    @Override
    public String toSpacecraft() {
        return this.toSpacecraft;
    }

    @Override
    public boolean canBeExecuted() {
        return this.spacecraft.getName().equalsIgnoreCase(toSpacecraft);
    }
}
