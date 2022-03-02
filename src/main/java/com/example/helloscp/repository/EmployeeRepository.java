package com.example.helloscp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.example.helloscp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
