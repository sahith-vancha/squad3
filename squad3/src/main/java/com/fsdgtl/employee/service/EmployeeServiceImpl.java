package com.fsdgtl.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdgtl.employee.model.Employee;
import com.fsdgtl.employee.model.EmployeeDTO;
import com.fsdgtl.employee.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	@Override
	public String insertEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(EmployeeDTO.prepareEmployeeEntity(employee));
		return "Employee with id "+employee.getEmpId()+" removed succesfully";
		

	}

	@Override
	public String removeEmployee(Integer empId) {
		// TODO Auto-generated method stub
		repository.deleteById(empId);
		
		return "Employee with id "+empId+" removed succesfully";

	}

	@Override
	public EmployeeDTO getEmployee(Integer empId) {
		// TODO Auto-generated method stub
		Optional<Employee> optionalEmployee=repository.findById(empId);
		Employee employeeEntity=optionalEmployee.get();
		EmployeeDTO employeeDTO=Employee.prepareEmployeeDTO(employeeEntity);
		return employeeDTO;
	}

	@Override
	public String updateEmployee(Integer empId, Integer salary) {
		// TODO Auto-generated method stub
		Optional<Employee> optionalEmployee=repository.findById(empId);
		Employee employeeEntity=optionalEmployee.get();
		employeeEntity.setSalary(salary);
		repository.save(employeeEntity);
		return "Employee with id "+empId+" updated salary succesfully";
	}
}
