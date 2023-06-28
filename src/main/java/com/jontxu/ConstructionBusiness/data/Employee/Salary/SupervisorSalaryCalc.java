package com.jontxu.ConstructionBusiness.data.Employee.Salary;

public class SupervisorSalaryCalc implements ISalaryCalc {
    @Override
    public double calculateSalary(double hoursWorked,
                                  double hourlyPay,
                                  double basePay,
                                  double... additionalParams) {
        double numberOfWorkers = additionalParams[0];
        double plusMultiplier = additionalParams[1];
        return (hoursWorked * hourlyPay) + (numberOfWorkers * plusMultiplier) + basePay;
    }
}
