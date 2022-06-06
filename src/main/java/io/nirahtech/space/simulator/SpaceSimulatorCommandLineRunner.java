package io.nirahtech.space.simulator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.nirahtech.space.simulator.core.simulator.Simulator;

@Component
public class SpaceSimulatorCommandLineRunner implements CommandLineRunner {

    @Autowired
    private Simulator simulator;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("yes");
        simulator.beginSimulation();
    }
}
