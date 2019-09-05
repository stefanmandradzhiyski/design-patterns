package com.snmi.structuralPatterns.adapter.adapters;

import com.snmi.structuralPatterns.adapter.employees.Employee;
import com.snmi.structuralPatterns.adapter.employees.EmployeeLDAP;

/**
 * Employee adapter for the LDAP one
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class EmployeeAdapterLDAP implements Employee {

    /**
     * Constants
     */
    private static final String PRESENT_EMPLOYEE = "%s %s with id %s and email %s";

    /**
     * Employee LDAP variable
     */
    private EmployeeLDAP employeeLDAP;

    /**
     * Custom constructor
     * @param employeeLDAP take the csv employee
     */
    public EmployeeAdapterLDAP(EmployeeLDAP employeeLDAP) {
        this.employeeLDAP = employeeLDAP;
    }

    /**
     * Employee LDAP implementation of getters
     */
    @Override
    public String getId() {
        return employeeLDAP.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.getSurname();
    }

    @Override
    public String getLastName() {
        return employeeLDAP.getGivenName();
    }

    @Override
    public String getEmail() {
        return employeeLDAP.getMail();
    }

    /**
     * Implementation of to string method
     * @return the ldap employee presentation
     */
    @Override
    public String toString() {
        return String.format(PRESENT_EMPLOYEE, getFirstName(), getLastName(), getId(), getEmail());
    }
}
