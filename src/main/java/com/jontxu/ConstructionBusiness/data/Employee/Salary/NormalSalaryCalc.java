package com.jontxu.ConstructionBusiness.data.Employee.Salary;

public class NormalSalaryCalc implements ISalaryCalc {
    @Override
    public double calculateSalary(double hoursWorked, double hourlyPay, double basePay, double... additionalParams) {
        return hoursWorked * hourlyPay + basePay;
    }
}
