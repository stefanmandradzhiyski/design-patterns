package com.snmi.structuralPatterns.adapter.employees;

/**
 * Employee from Database directory
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class EmployeeDB implements Employee {

    /**
     * Variables
     */
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    /**
     * Custom constructor
     * @param id take the id
     * @param firstName take the first name
     * @param lastName take the last name
     * @param email take the email
     */
    public EmployeeDB(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * Getters
     */
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
