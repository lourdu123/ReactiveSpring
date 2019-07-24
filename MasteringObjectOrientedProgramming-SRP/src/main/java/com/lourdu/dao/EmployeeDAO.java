package com.lourdu.dao;

import com.lourdu.domain.Employee;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        System.out.println("Saving employee :" + employee.toString());
    }

    public void terminateEmployee(Employee employee) {
        System.out.println("Terminating employee :" + employee.toString());
    }

}
