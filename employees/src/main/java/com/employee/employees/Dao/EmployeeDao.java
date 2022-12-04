package com.employee.employees.Dao;

import com.employee.employees.Entity.EmployeeEntity;
import com.employee.employees.Repository.EmployeeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDao {
    @Autowired
    private EmployeeRep employeeRep;


    public EmployeeEntity addEmployee(EmployeeEntity employee){
       return this.employeeRep.save(employee);
    }
}
