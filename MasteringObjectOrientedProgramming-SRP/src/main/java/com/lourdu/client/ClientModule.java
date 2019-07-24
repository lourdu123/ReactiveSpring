package com.lourdu.client;

import com.lourdu.dao.EmployeeDAO;
import com.lourdu.domain.Employee;
import com.lourdu.report.EmployeeReportFormatter;
import com.lourdu.report.ReportType;

public class ClientModule {

    public static void main(String[] args) {

        Employee employee = new Employee();

        saveEmployee(employee);

        terminateEmployee(employee);

        printReport(employee);

    }

    private static void printReport(Employee employee) {
        EmployeeReportFormatter eRFormatter = new EmployeeReportFormatter(employee, ReportType.CSV);
    }

    private static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);

    }

    private static void saveEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.terminateEmployee(employee);
    }

}
