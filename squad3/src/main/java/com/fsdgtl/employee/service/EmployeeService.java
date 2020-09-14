package com.fsdgtl.employee.service;

import org.springframework.stereotype.Service;

import com.fsdgtl.employee.model.EmployeeDTO;

public interface EmployeeService {
	public void insertEmployee(EmployeeDTO employee) ;
	public void removeEmployee(Integer empId);
	public EmployeeDTO getEmployee(Integer empId);
	public String updateEmployee(Integer empId,Integer salary);
}
