package com.employee.employees.Controller;

import com.employee.employees.Dao.EmployeeDao;
import com.employee.employees.Entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/employee")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @PostMapping("/add-employee")
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employee){
        return this.employeeDao.addEmployee(employee);
    }
}
