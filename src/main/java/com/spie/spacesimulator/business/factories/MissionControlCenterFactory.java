package com.spie.spacesimulator.business.factories;

public class MissionControlCenterFactory {

    private static MissionControlCenterFactory singleton = null;

    private MissionControlCenterFactory() {

    }

    public static final MissionControlCenterFactory getInstance() {
        if (singleton == null) {
            singleton = new MissionControlCenterFactory();
        }
        return singleton;
    }

}
