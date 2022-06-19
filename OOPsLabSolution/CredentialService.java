package com.OOPsLabSolution;

import java.util.Scanner;


 class Employee {
	
	String employeeFirstName;
	String employeeLastName;
	
	
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	
	public Employee(String firstName, String lastName){
	this.employeeFirstName = firstName;
	this.employeeLastName = lastName;
	}
	
	String giveName() {
		String name = employeeFirstName + employeeLastName;
		return name;
	}
	
}

public class CredentialService {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			
			System.out.println("Please enter your first name");
			String firstName = sc.nextLine();
			
			System.out.println("Please enter your last name");
			String lastName = sc.nextLine();

			Employee obj = new Employee(firstName, lastName);
			obj.giveName();
			
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			int dept = sc.nextInt();
					
			Password newPassword = new Password();
			
			if (dept == 1) {
				System.out.println("Dear " + firstName + ", your generated credentials are as follows:");
				System.out.println("EmailID --> " + obj.giveName()+"@tech.abc.com");
				System.out.println("Password --> " + newPassword.generatePassword());
				
			}
			
			else if (dept == 2) {
				System.out.println("Dear " + firstName + ", your generated credentials are as follows:");
				System.out.println(obj.giveName()+"@admin.abc.com");
				System.out.println("Password --> " + newPassword.generatePassword());
			}
			
			else if (dept == 3) {
				System.out.println("Dear " + firstName + ", your generated credentials are as follows:");
				System.out.println(obj.giveName()+"@HR.abc.com");
				System.out.println("Password --> " + newPassword.generatePassword());
			}
			
			else if (dept == 4) {
				System.out.println("Dear " + firstName + ", your generated credentials are as follows:");
				System.out.println(obj.giveName()+"@legal.abc.com");
				System.out.println("Password --> " + newPassword.generatePassword());
			}
			
			else {
				System.out.println("Pls make a valid entry!");
			}
		}
	}

}

