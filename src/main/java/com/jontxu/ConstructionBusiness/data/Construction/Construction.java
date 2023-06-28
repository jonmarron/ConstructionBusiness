package com.jontxu.ConstructionBusiness.data.Construction;

import com.jontxu.ConstructionBusiness.data.Employee.Employee;
import com.jontxu.ConstructionBusiness.data.Employee.EmployeeType;

import java.util.List;

public class Construction {
    private final ConstructionType constructionType;
    private final List<Employee> employees;
    private boolean isReady;

    public Construction(ConstructionType constructionType, List<Employee> employees) {
        this.constructionType = constructionType;
        this.employees = employees;
        isReady = setIsReady();
    }

    private boolean setIsReady(){
        return employees.stream()
                .anyMatch(employee -> employee.getEmployeeType().equals(EmployeeType.SITE_MANAGER));
    }

    public ConstructionType getConstructionType() {
        return constructionType;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public boolean isReady() {
        return isReady;
    }

}
