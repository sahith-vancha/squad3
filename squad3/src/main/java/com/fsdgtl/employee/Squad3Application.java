package com.fsdgtl.employee;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fsdgtl.employee.model.EmployeeDTO;
import com.fsdgtl.employee.service.EmployeeService;

@SpringBootApplication
public class Squad3Application implements CommandLineRunner {
	@Autowired
	ApplicationContext context;
	@Autowired
	EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(Squad3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeDTO employee1=new EmployeeDTO(Integer.valueOf(111), "Shah", "Rukh", LocalDate.of(1992, 06, 03), "Vizag", Integer.valueOf(40000),Long.valueOf(871231230));
		EmployeeDTO employee2=new EmployeeDTO(Integer.valueOf(222), "Salman", "Khan", LocalDate.of(1990, 07, 21), "Pune", Integer.valueOf(45000),Long.valueOf(771123123));
		EmployeeDTO employee3=new EmployeeDTO(Integer.valueOf(333), "Shahid", "Kapoor", LocalDate.of(1992, 10, 19), "Banglore", Integer.valueOf(50000),Long.valueOf(970230231));
		EmployeeDTO employee4=new EmployeeDTO(Integer.valueOf(444), "Akshay", "Kumar", LocalDate.of(1995, 01, 31), "Hyderabad", Integer.valueOf(30000),Long.valueOf(888231230));
		service.insertEmployee(employee1);
		service.insertEmployee(employee2);
		service.insertEmployee(employee3);
		service.insertEmployee(employee4);
		
		
		System.out.println("Records are successfully added..");
		
		System.out.println("Enter the employee id of the Employee which has to be deleted.");
		
		Scanner scanner = new Scanner(System.in);
		Integer id = Integer.valueOf(scanner.nextInt());
		// Invoking Service layer method to remove Customer details from
		// Customer table
		service.removeEmployee(id);
		System.out.println("Record Deleted");
		
		System.out.println("Let's print the details of a Employee");
		System.out.println("Enter the id of the Employee whose details have to be printed.");
		Integer id1 = Integer.valueOf(scanner.nextInt());
		EmployeeDTO employeeDTO=service.getEmployee(id1);
		System.out.println("************************************************************************");
		System.out.println("Employee details");
		System.out.println("First name"+"--------"+employeeDTO.getFirstname());
		System.out.println("Last name"+"---------"+employeeDTO.getLastname());
		System.out.println("DOB"+"---------------"+employeeDTO.getDOB().toString());
		System.out.println("City"+"--------------"+employeeDTO.getCity());
		System.out.println("salary"+"------------"+employeeDTO.getSalary());
		System.out.println("contact number"+"----"+employeeDTO.getContactnumber());
		System.out.println("Let's update the current salary of a Employee");
		System.out.println("Enter the id of the Employee whose current salary has to be updated.");
		Integer id2 = Integer.valueOf(scanner.nextInt());
		System.out.println("Enter the new salary for the Employee");
		Integer newSalary = scanner.nextInt();
		String msg = service.updateEmployee(id2, newSalary);
		System.out.println(msg);
		scanner.close();
		
	}

}
