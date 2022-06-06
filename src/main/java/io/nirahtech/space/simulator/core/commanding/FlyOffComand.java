package io.nirahtech.space.simulator.core.commanding;

import io.nirahtech.space.simulator.core.models.definitions.CommandResult;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

public class FlyOffComand extends AbstractCommand {

    public FlyOffComand(ObservationSpacecraft spacecraft, String fromMCC, String toSpacecraft) {
        super(spacecraft, fromMCC, toSpacecraft);
    }

    @Override
    public CommandResult execute() {
        this.spacecraft.flyOff();
        return null;
    }

}
