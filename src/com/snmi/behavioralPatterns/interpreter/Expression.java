package com.snmi.behavioralPatterns.interpreter;

/**
 * Expression interface
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public interface Expression {

    boolean interpret(String context);

}
