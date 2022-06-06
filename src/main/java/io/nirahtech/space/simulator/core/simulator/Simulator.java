package io.nirahtech.space.simulator.core.simulator;

import org.springframework.stereotype.Component;

@Component
public interface Simulator {
    void beginSimulation();

    void terminateSimulation();

}
