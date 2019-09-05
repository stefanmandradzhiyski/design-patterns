package com.snmi.behavioralPatterns.chainOfResponsibility.concreteHandlers;

import com.snmi.behavioralPatterns.chainOfResponsibility.Handler;
import com.snmi.behavioralPatterns.chainOfResponsibility.request.Request;
import com.snmi.behavioralPatterns.chainOfResponsibility.request.RequestType;

/**
 * VP concrete handler
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class VP extends Handler {

    /**
     * VP constants
     */
    private static final String VP_RESTRICTION = "VP can approve purchase below or equal to 1500";

    /**
     * VP implementation of handle request
     * @param request take the request
     */
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() <= 1500) {
                System.out.println(VP_RESTRICTION);
            } else {
                successor.handleRequest(request);
            }
        }
    }

}
