package com.snmi.behavioralPatterns.chainOfResponsibility.concreteHandlers;

import com.snmi.behavioralPatterns.chainOfResponsibility.Handler;
import com.snmi.behavioralPatterns.chainOfResponsibility.request.Request;

/**
 * CEO concrete handler
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class CEO extends Handler {

    /**
     * CEO constants
     */
    private static final String CEO_RESTRICTION = "Can approve everything";

    /**
     * CEO implementation of handle request
     * @param request take the request
     */
    @Override
    public void handleRequest(Request request) {
        System.out.println(CEO_RESTRICTION);
    }

}
