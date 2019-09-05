package com.snmi.behavioralPatterns.interpreter.terminalExpression;

import com.snmi.behavioralPatterns.interpreter.Expression;

import java.util.StringTokenizer;

/**
 * Terminal expression
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class TerminalExpression implements Expression {

    /**
     * Variables
     */
    private String data;

    /**
     * Custom constructor
     * @param data take the data
     */
    public TerminalExpression(String data) {
        this.data = data;
    }

    /**
     * Implementation of interpret method
     * @param context take the context
     * @return boolean result
     */
    @Override
    public boolean interpret(String context) {
        StringTokenizer stringTokenizer = new StringTokenizer(context);

        while (stringTokenizer.hasMoreTokens()) {
            String test = stringTokenizer.nextToken();
            if (test.equals(data)) {
                return true;
            }
        }

        return false;
    }

}
