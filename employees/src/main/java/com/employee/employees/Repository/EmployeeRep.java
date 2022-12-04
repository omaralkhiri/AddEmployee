package com.employee.employees.Repository;

import com.employee.employees.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRep extends JpaRepository<EmployeeEntity,Integer> {
}
