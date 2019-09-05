package com.snmi.behavioralPatterns.chainOfResponsibility.concreteHandlers;

import com.snmi.behavioralPatterns.chainOfResponsibility.Handler;
import com.snmi.behavioralPatterns.chainOfResponsibility.request.Request;
import com.snmi.behavioralPatterns.chainOfResponsibility.request.RequestType;

/**
 * Concrete Handler
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Director extends Handler {

    /**
     * Director constants
     */
    private static final String DIRECTOR_RESTRICTION = "Director can approve conferences";

    /**
     * Director implementation of handle request
     * @param request take the request
     */
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println(DIRECTOR_RESTRICTION);
        } else {
            successor.handleRequest(request);
        }
    }

}
