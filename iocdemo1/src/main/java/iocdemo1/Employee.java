package iocdemo1;

import java.util.*;

public class Employee {
	private String firstName, lastName;
	private double Salary;
	private String designation;
	private Address address;
	
	private List<String> contacts;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, double salary, String designation, Address address,
			List<String> contacts) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Salary = salary;
		this.designation = designation;
		this.address = address;
		this.contacts = contacts;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	
	

}
