package com.snmi.behavioralPatterns.chainOfResponsibility.request;

/**
 * The request
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Request {

    /**
     * Variables
     */
    private RequestType requestType;
    private double amount;

    /**
     * Default constructor
     */
    public Request() {}

    /**
     * Custom constructor
     * @param requestType take the request's type
     * @param amount take the request's amount
     */
    public Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    /**
     * Getters
     */
    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}
