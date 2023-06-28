package com.jontxu.ConstructionBusiness.data.Employee.Salary;

public interface ISalaryCalc {
    double calculateSalary(double hoursWorked,
                           double hourlyPay,
                           double basePay,
                           double... additionalParams);
}
