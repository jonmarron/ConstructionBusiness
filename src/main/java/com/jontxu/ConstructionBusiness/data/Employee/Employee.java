package com.jontxu.ConstructionBusiness.data.Employee;

import com.jontxu.ConstructionBusiness.data.Employee.Salary.ISalaryCalc;

public abstract class Employee {
    private final String name;
    private final int id;
    private final double basePay;
    private final double hourlyPay;
    private final double hoursWorked;
    ISalaryCalc salaryCalc;
    private final EmployeeType employeeType;

    public Employee(String name, int id, double basePay, double hourlyPay, double hoursWorked, EmployeeType employeeType) {
        this.name = name;
        this.id = id;
        this.basePay = basePay;
        this.hourlyPay = hourlyPay;
        this.hoursWorked = hoursWorked;
        this.employeeType = employeeType;
    }

    public void setSalaryCalc(ISalaryCalc salaryCalc) {
        this.salaryCalc = salaryCalc;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public double calculateSalary(){
        return salaryCalc.calculateSalary(hoursWorked, hourlyPay, basePay);
    };

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBasePay() {
        return basePay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }
}

