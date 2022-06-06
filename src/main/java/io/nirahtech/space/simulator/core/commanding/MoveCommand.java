package io.nirahtech.space.simulator.core.commanding;

import io.nirahtech.space.simulator.core.commons.SpatialCoordinates;
import io.nirahtech.space.simulator.core.models.definitions.CommandResult;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

public class MoveCommand extends AbstractCommand {

    private final SpatialCoordinates coordinates;

    public MoveCommand(ObservationSpacecraft spacecraft, String fromMCC, String toSpacecraft,
            final SpatialCoordinates coordinates) {
        super(spacecraft, fromMCC, toSpacecraft);
        this.coordinates = coordinates;
    }

    @Override
    public CommandResult execute() {
        this.spacecraft.move(this.coordinates);
        return null;
    }
}
