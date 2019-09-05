package com.snmi.behavioralPatterns.observer;

/**
 * Video object which extends the Observer
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Video extends Observer {

    /**
     * Custom constructor
     * @param channel take the channel
     */
    public Video(Channel channel) {
        this.channel = channel;
        channel.attach(this);
    }

    /**
     * Create video in the channel
     * @param videoName take the chanel message
     */
    public void createVideo(String videoName) {
        channel.setState(videoName);
    }

    /**
     * No implementation of the observer update method
     */
    @Override
    public void update(Channel channel) {}
}
