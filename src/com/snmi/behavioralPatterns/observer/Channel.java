package com.snmi.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject channel
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class Channel {

    /**
     * List of observers
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * Setters and getters
     */
    public abstract void setChannelName(String channelName);
    public abstract String getChannelName();
    public abstract void setState(String state);
    public abstract String getState();

    /**
     * Attach to the observer
     * @param observer take the observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Detach from the observer
     * @param observer take the observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notify the observers
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
