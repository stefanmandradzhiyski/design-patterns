package com.snmi.behavioralPatterns.chainOfResponsibility;

import com.snmi.behavioralPatterns.chainOfResponsibility.request.Request;

/**
 * Handler
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class Handler {

    protected Handler successor;
    public void setSuccessor(Handler successor) { this.successor = successor; }
    public abstract void handleRequest(Request request);
}
