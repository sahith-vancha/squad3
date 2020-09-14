package com.fsdgtl.employee.model;

import java.time.LocalDate;



public class EmployeeDTO {
	private Integer empId;
	private String firstname;
	private String lastname;
	private LocalDate DOB;
	private String city;
	private Integer salary;
	private Long contactnumber;
	
	public EmployeeDTO() {
		
	}
	
	
	public EmployeeDTO(Integer empId, String firstname, String lastname, LocalDate dOB, String city, Integer salary,
			Long contactnumber) {
		super();
		this.empId = empId;
		this.firstname = firstname;
		this.lastname = lastname;
		DOB = dOB;
		this.city = city;
		this.salary = salary;
		this.contactnumber = contactnumber;
	}
	


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public LocalDate getDOB() {
		return DOB;
	}


	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public long getContactnumber() {
		return contactnumber;
	}


	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstname=" + firstname + ", lastname=" + lastname + ", DOB=" + DOB
				+ ", city=" + city + ", salary=" + salary + ", contactnumber=" + contactnumber + "]";
	}


	public static Employee prepareEmployeeEntity(EmployeeDTO employeeDTO)
	{
		Employee employeeEntity = new Employee();
		employeeEntity.setEmpId(employeeDTO.getEmpId());
		employeeEntity.setFirstname(employeeDTO.getFirstname());
		employeeEntity.setLastname(employeeDTO.getLastname());
		employeeEntity.setDOB(employeeDTO.getDOB());
		employeeEntity.setSalary(employeeDTO.getSalary());
		employeeEntity.setCity(employeeDTO.getCity());
		employeeEntity.setContactnumber(employeeDTO.getContactnumber());
		return employeeEntity;
		
	}
	
	
}

