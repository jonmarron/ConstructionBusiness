package com.jontxu.ConstructionBusiness.data.Employee;

import com.jontxu.ConstructionBusiness.data.Employee.Salary.SupervisorSalaryCalc;

public class Supervisor extends Employee {
    public Supervisor(String name, int id, double basePay, double hourlyPay, double hoursWorked, EmployeeType employeeType) {
        super(name, id, basePay, hourlyPay, hoursWorked, employeeType);
        salaryCalc = new SupervisorSalaryCalc();
    }
}
