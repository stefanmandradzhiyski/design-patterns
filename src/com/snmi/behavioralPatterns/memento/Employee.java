package com.snmi.behavioralPatterns.memento;

/**
 * Originator
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Employee {

    /**
     * Variables
     */
    private String name;
    private String address;
    private String phone;

    /**
     * Default constructor
     */
    public Employee() {}

    /**
     * Custom constructor
     * @param name take the employee's name
     * @param address take the employee's address
     * @param phone take the employee's phone
     */
    public Employee(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Setters and getters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Save employee memento
     * @return the new instance of employee memento with name and phone
     */
    public EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    /**
     * Revert employee memento
     * @param employeeMemento take the employee memento
     */
    public void revert(EmployeeMemento employeeMemento) {
        this.name = employeeMemento.getName();
        this.phone = employeeMemento.getPhone();
    }

    /**
     * Implementation of toString method
     * @return the presentation of Employee object
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
