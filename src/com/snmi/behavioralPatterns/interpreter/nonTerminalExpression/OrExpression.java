package com.snmi.behavioralPatterns.interpreter.nonTerminalExpression;

import com.snmi.behavioralPatterns.interpreter.Expression;

/**
 * Non terminal expression
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class OrExpression implements Expression {

    /**
     * Variables
     */
    private Expression firstExpression = null;
    private Expression secondExpression = null;

    /**
     * Custom constructor
     * @param firstExpression take the first expression
     * @param secondExpression take the second expression
     */
    public OrExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    /**
     * Implementation of interpret method
     * @param context take the context
     * @return boolean result
     */
    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) || secondExpression.interpret(context);
    }
}
