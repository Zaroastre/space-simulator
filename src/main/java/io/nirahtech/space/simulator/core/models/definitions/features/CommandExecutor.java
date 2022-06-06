package io.nirahtech.space.simulator.core.models.definitions.features;

import io.nirahtech.space.simulator.core.models.definitions.Command;

public interface CommandExecutor {

    void executeCommand(final Command command);
}
