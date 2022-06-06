package io.nirahtech.space.simulator.core.commanding;

import java.io.File;

import io.nirahtech.space.simulator.core.models.definitions.CommandResult;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

public class TakePictureCommand extends AbstractCommand {
    public TakePictureCommand(ObservationSpacecraft spacecraft, String fromMCC, String toSpacecraft) {
        super(spacecraft, fromMCC, toSpacecraft);
    }

    @Override
    public CommandResult execute() {
        File picture = this.spacecraft.takePicture();
        return null;
    }

}
