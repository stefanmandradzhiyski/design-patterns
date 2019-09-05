package com.snmi.structuralPatterns.adapter.employees;

import java.util.StringTokenizer;

/**
 * Employee from CSV directory
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class EmployeeCSV {

    /**
     * Variables
     */
    private int id;
    private String firstname;
    private String lastname;
    private String emailAddress;

    /**
     * Custom constructor
     * @param values take the whole employee information from a csv row
     */
    public EmployeeCSV(String values) {
        StringTokenizer stringTokenizer = new StringTokenizer(values, ",");

        if (stringTokenizer.hasMoreElements()) {
            id = Integer.parseInt(stringTokenizer.nextToken());
        }
        if (stringTokenizer.hasMoreElements()) {
            firstname = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            lastname = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            emailAddress = stringTokenizer.nextToken();
        }
    }

    /**
     * Getters
     */
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
