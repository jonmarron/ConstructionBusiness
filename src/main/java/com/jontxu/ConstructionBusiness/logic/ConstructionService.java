package com.jontxu.ConstructionBusiness.logic;

import com.jontxu.ConstructionBusiness.data.Construction.Construction;
import com.jontxu.ConstructionBusiness.data.Employee.EmployeeType;

public class ConstructionService {
    private final Construction construction;

    public ConstructionService(Construction construction) {
        this.construction = construction;
    }

    public int numberOfWorkers(){
        return (int) construction.getEmployees().stream()
                .filter(employee -> employee.getEmployeeType().equals(EmployeeType.WORKER))
                .count();
    }
}
