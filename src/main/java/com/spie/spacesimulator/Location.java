package com.spie.spacesimulator;

import java.util.Locale;

/**
 * Class that represents a Location.
 * 
 * @author Nicolas METIVIER <nicolas.metivier@spie.com>
 * @category Entities
 * @since 1.0-SNAPSHOT
 * @serial 20220607133954
 * @version 1.0.0
 */
public class Location {
    private final Locale country;
    private final String city;

    /**
     * Constructor of the Location.
     * 
     * @param country Country of the location.
     * @param city    City of the location.
     */
    public Location(final Locale country, final String city) {
        this.country = country;
        this.city = city;
    }

    /**
     * Get location city.
     * 
     * @return The city.
     */
    public final String getCity() {
        return this.city;
    }

    /**
     * Get location country.
     * 
     * @return The country.
     */
    public final Locale getCountry() {
        return country;
    }

}
