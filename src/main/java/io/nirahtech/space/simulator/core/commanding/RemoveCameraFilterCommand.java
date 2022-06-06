package io.nirahtech.space.simulator.core.commanding;

import io.nirahtech.space.simulator.core.models.definitions.CameraFilter;
import io.nirahtech.space.simulator.core.models.definitions.CommandResult;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

public class RemoveCameraFilterCommand extends AbstractCommand {
    private final CameraFilter filter;

    public RemoveCameraFilterCommand(ObservationSpacecraft spacecraft, String fromMCC, String toSpacecraft,
            final CameraFilter filter) {
        super(spacecraft, fromMCC, toSpacecraft);
        this.filter = filter;
    }

    @Override
    public CommandResult execute() {
        this.spacecraft.removeCameraFilter(this.filter);
        return null;
    }

}
