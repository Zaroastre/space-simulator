package io.nirahtech.space.simulator.core.site.api;

public interface MccConnector {

    /**
     * Establish a connection with a remote MCC.
     * 
     * @param remoteMCC The remote MCC with which the connection must be
     *                  established.
     */
    RemoteMcc connect(String hostname, int port);

    /**
     * Check if the component is connected.
     * 
     * @return {@code true} if the component is connected with a remote MCC, else
     *         {@code false}.
     */
    boolean isConnected();

    /**
     * Check is the component is connected to the remote MCC.
     * 
     * @param remoteMCC The remote MCC with which the connection can be
     *                  established.
     * @return {@code true} if the component is connected with the remote MCC,
     *         else {@code false}.
     */
    boolean isConnectedWith(RemoteMcc remoteMCC);

    /**
     * Disconnect the component from all remotes MCCs.
     */
    void disconnect();

    /**
     * Disconnect the component from the remote MCC.
     * 
     * @param remoteMCC The remote MCC with which the connection must be
     *                  closed.
     */
    void disconnect(RemoteMcc remoteMCC);
}
