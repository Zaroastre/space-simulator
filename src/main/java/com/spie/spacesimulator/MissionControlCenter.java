package com.spie.spacesimulator;

/**
 * Class that represents a Mission Control Center.
 * It can pilot space vehicles to carry out space missions
 * 
 * @author Nicolas METIVIER <nicolas.metivier@spie.com>
 * @category Entities
 * @since 1.0-SNAPSHOT
 * @serial 20220607133715
 * @version 1.0.0
 */
public class MissionControlCenter {

    private final String identifier;
    private final Location location;

    /**
     * Constructor of the Mission Control Center.
     * 
     * @param identifier Identifier of the mission control center.
     * @param location   Location where the mission control center is establised.
     */
    public MissionControlCenter(String identifier, Location location) {
        this.identifier = identifier;
        this.location = location;
    }

    /**
     * Get the mission control center identifier.
     * 
     * @return The identifier.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Get the mission control center location.
     * 
     * @return The location.
     */
    public Location getLocation() {
        return this.location;
    }

}