package com.snmi.behavioralPatterns.observer;

/**
 * User object which extends the observer
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class User extends Observer {

    private static final String USER_NOTIFICATION = "%s have a new notification - %s";

    /**
     * Variables
     */
    private String username;
    private Channel channel;

    /**
     * Default constructor
     * @param username take the username of user
     */
    public User (String username) {
        this.username = username;
    }

    /**
     * Attach to specific channel
     * @param channel take the wanted channel
     */
    public void attach(Channel channel) {
        this.channel = channel;
        channel.attach(this);
    }

    /**
     * Unsubscribe/detach from the channel
     * @param channel take the channel
     */
    public void detach(Channel channel) {
        this.channel = null;
        channel.detach(this);
    }

    /**
     * Getters
     */
    public String getUsername() {
        return username;
    }

    /**
     * Implementation of the observer update method
     */
    @Override
    public void update(Channel channel) {
        System.out.printf(USER_NOTIFICATION, getUsername(), channel.getState());
        System.out.println();
    }
}
