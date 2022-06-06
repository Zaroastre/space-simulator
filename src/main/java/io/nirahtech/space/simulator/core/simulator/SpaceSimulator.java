package io.nirahtech.space.simulator.core.simulator;

import org.springframework.stereotype.Component;

import io.nirahtech.space.simulator.core.site.MissionControlCenter;
import io.nirahtech.space.simulator.infrastructure.exceptions.StartupException;

@Component
public class SpaceSimulator implements Simulator {

    @Override
    public void beginSimulation() {

        MissionControlCenter mcc = new MissionControlCenter();
        mcc.setPort(9642);
        try {
            mcc.start();
        } catch (StartupException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void terminateSimulation() {
        // TODO Auto-generated method stub

    }

}
