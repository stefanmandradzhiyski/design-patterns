package com.snmi.behavioralPatterns.interpreter;

import com.snmi.behavioralPatterns.interpreter.nonTerminalExpression.AndExpression;
import com.snmi.behavioralPatterns.interpreter.nonTerminalExpression.OrExpression;
import com.snmi.behavioralPatterns.interpreter.terminalExpression.TerminalExpression;

/**
 * The program which implement the Interpret design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramInterpreter {

    /**
     * Building the interpret tree
     * @return the result of tree's expressions
     */
    private static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        //Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        //Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        return new AndExpression(terminal3, alternation2);
    }

    public static void main(String[] args) {
        //String context = "Lions";
        //String context = "Tigers";
        //String context = "Lions Tigers";
        String context = "Lions Bears";
        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }

}
