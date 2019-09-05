package com.snmi.structuralPatterns.adapter;

import com.snmi.structuralPatterns.adapter.adapters.EmployeeAdapterCSV;
import com.snmi.structuralPatterns.adapter.adapters.EmployeeAdapterLDAP;
import com.snmi.structuralPatterns.adapter.employees.Employee;
import com.snmi.structuralPatterns.adapter.employees.EmployeeCSV;
import com.snmi.structuralPatterns.adapter.employees.EmployeeDB;
import com.snmi.structuralPatterns.adapter.employees.EmployeeLDAP;

import java.util.ArrayList;
import java.util.List;

/**
 * Employee client
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class EmployeeClient {

    /**
     * Create and fill a list with different employee object using two adapters
     * @return the filled list
     */
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1", "Stefan", "Mandradzhiyski", "stefanmandradzhiyski@gmail.com");

        employees.add(employeeFromDB);

        EmployeeLDAP employeeLDAP = new EmployeeLDAP("2", "Stefan", "Stefanov", "stefanmandradzhiyski@gmail.com");

        employees.add(new EmployeeAdapterLDAP(employeeLDAP));

        EmployeeCSV employeeCSV = new EmployeeCSV("3,Chefo,Mandradzhiyski,stefanmandradzhiyski@gmail.com");

        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }

}
