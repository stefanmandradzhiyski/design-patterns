package com.snmi.structuralPatterns.adapter.adapters;

import com.snmi.structuralPatterns.adapter.employees.Employee;
import com.snmi.structuralPatterns.adapter.employees.EmployeeCSV;

/**
 * Employee adapter for the csv one
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class EmployeeAdapterCSV implements Employee {

    /**
     * Constants
     */
    private static final String PRESENT_EMPLOYEE = "%s %s with id %s and email %s";

    /**
     * Employee CSV variable
     */
    private EmployeeCSV employeeCSV;

    /**
     * Custom constructor
     * @param employeeCSV take the csv employee
     */
    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    /**
     * Employee CSV implementation of getters
     */
    @Override
    public String getId() {
        return String.valueOf(employeeCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }

    /**
     * Implementation of to string method
     * @return the csv employee presentation
     */
    @Override
    public String toString() {
        return String.format(PRESENT_EMPLOYEE, getFirstName(), getLastName(), getId(), getEmail());
    }
}
