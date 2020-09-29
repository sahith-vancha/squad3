package com.fsdgtl.employee.service;

import com.fsdgtl.employee.model.EmployeeDTO;

public interface EmployeeService {
	public String insertEmployee(EmployeeDTO employee) ;
	public String removeEmployee(Integer empId);
	public EmployeeDTO getEmployee(Integer empId);
	public String updateEmployee(Integer empId,Integer salary);
}
