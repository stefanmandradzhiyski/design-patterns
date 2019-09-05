package com.snmi.structuralPatterns.adapter;

import com.snmi.structuralPatterns.adapter.employees.Employee;

import java.util.List;

/**
 * The program implement the Adapter design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramAdapter {

    public static void main(String[] args) {
        EmployeeClient employeeClient = new EmployeeClient();

        List<Employee> employees = employeeClient.getEmployeeList();

        System.out.println(employees);
    }

}
