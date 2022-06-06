package io.nirahtech.space.simulator.core.commanding;

import java.io.File;

import io.nirahtech.space.simulator.core.models.definitions.CommandResult;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;

public class DownloadPitureCommand extends AbstractCommand {

    private final File picture;

    public DownloadPitureCommand(final ObservationSpacecraft spacecraft, final String fromMCC,
            final String toSpacecraft, final File picture) {
        super(spacecraft, fromMCC, toSpacecraft);
        this.picture = picture;
    }

    @Override
    public CommandResult execute() {
        File downloadedPicture = this.spacecraft.downloadPicture(this.picture);
        return null;
    }

}
