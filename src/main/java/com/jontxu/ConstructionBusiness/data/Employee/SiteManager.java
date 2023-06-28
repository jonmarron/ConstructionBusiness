package com.jontxu.ConstructionBusiness.data.Employee;

import com.jontxu.ConstructionBusiness.data.Employee.Salary.NormalSalaryCalc;

public class SiteManager extends Employee {
    public SiteManager(String name, int id, double basePay, double hourlyPay, double hoursWorked, EmployeeType employeeType) {
        super(name, id, basePay, hourlyPay, hoursWorked, employeeType);
        salaryCalc = new NormalSalaryCalc();
    }
}
