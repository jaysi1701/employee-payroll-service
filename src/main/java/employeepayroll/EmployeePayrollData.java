package com.bridgelabz.employeepayroll;

public class EmployeePayrollData {

    public int id;
    public String name;
    public double salary;

    // Constructor
    public EmployeePayrollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // toString Method
    @Override
    public String toString() {
        return "Employee ID = " + id +
                ", Name = " + name +
                ", Salary = " + salary;
    }
}