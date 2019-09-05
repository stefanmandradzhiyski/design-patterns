package com.snmi.behavioralPatterns.observer;

/**
 * Observer object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class Observer {

    protected Channel channel;
    public abstract void update(Channel channel);

}
