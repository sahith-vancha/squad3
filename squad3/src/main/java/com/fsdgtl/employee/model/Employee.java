package com.fsdgtl.employee.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(name="Emp_Id")
	private Integer empId;
	@Column(name="First_Name")
	private String firstname;
	@Column(name="Last_Name")
	private String lastname;
	private LocalDate DOB;
	private String city;
	private Integer salary;
	@Column(name="Contact_Number")
	private Long contactnumber;
	
	
	
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



	public Employee(Integer empId, String firstname, String lastname, LocalDate dOB, String city, Integer salary,
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



	public Employee() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstname=" + firstname + ", lastname=" + lastname + ", DOB=" + DOB
				+ ", city=" + city + ", salary=" + salary + ", contactnumber=" + contactnumber + "]";
	}



	public static EmployeeDTO prepareEmployeeDTO(Employee employee)
	{
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpId(employee.getEmpId());
		employeeDTO.setFirstname(employee.getFirstname());
		employeeDTO.setLastname(employee.getLastname());
		employeeDTO.setDOB(employee.getDOB());
		employeeDTO.setSalary(employee.getSalary());
		employeeDTO.setCity(employee.getCity());
		employeeDTO.setContactnumber(employee.getContactnumber());
		return employeeDTO;
		
	}




}
