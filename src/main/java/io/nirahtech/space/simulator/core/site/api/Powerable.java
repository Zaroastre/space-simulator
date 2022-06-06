package io.nirahtech.space.simulator.core.site.api;

import io.nirahtech.space.simulator.infrastructure.exceptions.ShutdownException;
import io.nirahtech.space.simulator.infrastructure.exceptions.StartupException;

/**
 * Interface that represents a component able to be started or stoped.
 */
public interface Powerable {

    /**
     * Start the component.
     * 
     * @throws StartupException Error if starting process failed.
     */
    void start() throws StartupException;

    /**
     * Stop the component.
     * 
     * @throws ShutdownException Error if stopping process failed.
     */
    void stop() throws ShutdownException;
}
