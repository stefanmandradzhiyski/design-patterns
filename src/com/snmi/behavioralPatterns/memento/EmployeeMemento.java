package com.snmi.behavioralPatterns.memento;

/**
 * Memento
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class EmployeeMemento {

    /**
     * Variables that will be saved/reverted
     */
    private String name;
    private String phone;

    /**
     * Default constructor
     */
    public EmployeeMemento() {}

    /**
     * Custom constructor
     * @param name take the employee name
     * @param phone take the employee phone
     */
    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    /**
     * Getters
     */
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }


}
