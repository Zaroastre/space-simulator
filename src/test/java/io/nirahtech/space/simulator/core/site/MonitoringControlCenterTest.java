package io.nirahtech.space.simulator.core.site;

import org.junit.jupiter.api.Test;

import io.nirahtech.space.simulator.core.site.api.RemoteMcc;
import io.nirahtech.space.simulator.infrastructure.exceptions.StartupException;

public class MonitoringControlCenterTest {

    @Test
    public void testRemoteMCC() {
        MissionControlCenter mcc = new MissionControlCenter();
        mcc.setPort(9642);
        try {
            mcc.start();
        } catch (StartupException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        RemoteMcc remote = mcc.connect("127.0.0.1", 9666);
        System.out.println(remote.isConnected());
        remote.getSiteIdentifier();
        mcc.disconnect();
    }
}
