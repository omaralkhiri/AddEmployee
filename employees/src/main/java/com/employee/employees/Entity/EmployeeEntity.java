package com.employee.employees.Entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "employee")
@Data
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "Full_name")
    private String Full_Name;

    @Column(name = "Setion_Number")
    private Integer Section_Number;

    @Column(name = "Birthday")
    private String Birthday;

    @Column(name = "Salary")
    private Double Salary;

    @Column(name = "date_employment")
    private String Date_Employment;


}
