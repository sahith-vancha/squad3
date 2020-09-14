package com.fsdgtl.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdgtl.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
