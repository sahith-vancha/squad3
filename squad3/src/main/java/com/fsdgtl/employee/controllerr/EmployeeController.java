package com.fsdgtl.employee.controllerr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsdgtl.employee.model.EmployeeDTO;
import com.fsdgtl.employee.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin
@RestController
@Api(value = "EmployeeController, REST APIs that deal with Employee DTO")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping(value="/get/{empId}")
	@ApiOperation(value = "Fetch  the employees of specific id", response = EmployeeDTO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Fetched the employee successfully"),
			@ApiResponse(code = 404, message = "Employee details not found") })
	
	public EmployeeDTO getEmployee(@PathVariable Integer empId) {
		return service.getEmployee(empId);
	}
	
	@PostMapping(value="/insert")
	public ResponseEntity<String> insertEmployee(@RequestBody EmployeeDTO employee) {
		
		String response=service.insertEmployee(employee);
		return ResponseEntity.ok(response);
		
	}
	
	@DeleteMapping(value="/delete/{empId}")
	public String removeEmployee(@PathVariable Integer empId) {
		return service.removeEmployee(empId);
		
	}
	
	@PutMapping(value="update/{empId}")
	public String updateEmployee(Integer empId,Integer salary) {
		return service.updateEmployee(empId, salary);
		
	}
	

}
