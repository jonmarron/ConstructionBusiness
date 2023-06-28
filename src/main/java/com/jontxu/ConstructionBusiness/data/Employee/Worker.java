package com.jontxu.ConstructionBusiness.data.Employee;

import com.jontxu.ConstructionBusiness.data.Employee.Salary.NormalSalaryCalc;

public class Worker extends Employee {

    public Worker(String name, int id, double basePay, double hourlyPay, double hoursWorked, EmployeeType employeeType) {
        super(name, id, basePay, hourlyPay, hoursWorked, employeeType);
        salaryCalc = new NormalSalaryCalc();
    }

}
