package com.snmi.behavioralPatterns.observer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Concrete subject channel stream
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ChannelStream extends Channel {

    /**
     * Constants
     */
    private static final String STATE = "%s upload a video: '%s'";

    /**
     * Deque of channel history
     */
    private Deque<String> channelHistory = new ArrayDeque<>();

    /**
     * Channel name
     */
    private String channelName;

    /**
     * Setters and getters
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * Implementation of channel set state method
     * @param state take the state
     */
    @Override
    public void setState(String state) {
        channelHistory.add(state);
        this.notifyObservers();
    }

    /**
     * Implementation of channel get state method
     * @return
     */
    @Override
    public String getState() {
        return String.format(STATE, getChannelName(), channelHistory.getLast());
    }
}
