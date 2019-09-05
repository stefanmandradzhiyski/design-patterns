package com.snmi.behavioralPatterns.chainOfResponsibility;

import com.snmi.behavioralPatterns.chainOfResponsibility.concreteHandlers.CEO;
import com.snmi.behavioralPatterns.chainOfResponsibility.concreteHandlers.Director;
import com.snmi.behavioralPatterns.chainOfResponsibility.concreteHandlers.VP;
import com.snmi.behavioralPatterns.chainOfResponsibility.request.Request;
import com.snmi.behavioralPatterns.chainOfResponsibility.request.RequestType;

/**
 * The program implement the Chain of responsibility design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramChainOfResponsibility {

    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        handleRequest(director, RequestType.CONFERENCE, 500);
        handleRequest(director, RequestType.PURCHASE, 900);
        handleRequest(director, RequestType.PURCHASE, 1800);
    }

    /**
     * Create specific request to the specific object
     * @param handler take the handler object
     * @param requestType take the request's type
     * @param requestAmount take the request's amount
     */
    private static void handleRequest(Handler handler, RequestType requestType, double requestAmount) {
        Request request = new Request(requestType, requestAmount);
        handler.handleRequest(request);
    }

}
