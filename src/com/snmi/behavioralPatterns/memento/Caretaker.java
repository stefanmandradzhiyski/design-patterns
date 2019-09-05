package com.snmi.behavioralPatterns.memento;

import java.util.Stack;

/**
 * Caretaker
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Caretaker {

    /**
     * Stack variable
     */
    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    /**
     * Save the object
     * @param employee take the object
     */
    public void save(Employee employee) {
        employeeHistory.push(employee.save());
    }

    /**
     * Revert the object
     * @param employee take the object
     */
    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }

}
