package io.nirahtech.space.simulator.core.commons;

/**
 * SpatialCoordinates
 */
public class SpatialCoordinates {

    private final float latitude, longitude, altitude;

    public SpatialCoordinates(final float latitude, final float longitude, final float altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;

    }

    /**
     * @return the latitude
     */
    public float getLatitude() {
        return this.latitude;
    }

    /**
     * @return the longitude
     */
    public float getLongitude() {
        return this.longitude;
    }

    /**
     * @return the altitude
     */
    public float getAltitude() {
        return this.altitude;
    }

}