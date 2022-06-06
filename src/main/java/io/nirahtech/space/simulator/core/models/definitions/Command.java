package io.nirahtech.space.simulator.core.models.definitions;

public interface Command {
    String fromMCC();

    String toSpacecraft();

    boolean canBeExecuted();

    CommandResult execute();
}
