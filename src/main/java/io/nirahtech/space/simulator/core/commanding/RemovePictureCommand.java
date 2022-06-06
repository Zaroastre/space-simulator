package io.nirahtech.space.simulator.core.commanding;

import java.io.File;

import io.nirahtech.space.simulator.core.models.definitions.CommandResult;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

public class RemovePictureCommand extends AbstractCommand {
    private final File picture;

    public RemovePictureCommand(ObservationSpacecraft spacecraft, String fromMCC, String toSpacecraft,
            final File picture) {
        super(spacecraft, fromMCC, toSpacecraft);
        this.picture = picture;
    }

    @Override
    public CommandResult execute() {
        this.spacecraft.removePicture(this.picture);
        return null;
    }

}
