package com.bridgelabz.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    // List to store employee data
    private List<EmployeePayrollData> employeePayrollList;

    // Constructor
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    // Main Method
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();

        // Creating Service Object
        EmployeePayrollService employeePayrollService =
                new EmployeePayrollService(employeePayrollList);

        // Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Reading Employee Data
        employeePayrollService.readEmployeePayrollData(scanner);

        // Writing Employee Data
        employeePayrollService.writeEmployeePayrollData();
    }

    // Method to Read Employee Data
    private void readEmployeePayrollData(Scanner consoleInputReader) {

        System.out.println("Enter Employee ID:");
        int id = consoleInputReader.nextInt();

        System.out.println("Enter Employee Name:");
        String name = consoleInputReader.next();

        System.out.println("Enter Employee Salary:");
        double salary = consoleInputReader.nextDouble();

        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    // Method to Write Employee Data
    private void writeEmployeePayrollData() {

        System.out.println("Writing Employee Payroll to Console");

        System.out.println(employeePayrollList);
    }
}