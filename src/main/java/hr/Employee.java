package hr;

import java.io.Serializable;

public class Employee implements Serializable{
	
	protected int id;
	protected String firstName;
	protected String lastName;
	protected int salary;
	
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int calculateBonus() {
		return (int)(0.01 * this.salary);
	}
	
	
	public int getID() {
		return id;
	}


	public void setID(int id) {
		this.id = id;
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee #" + id + ": " + firstName + " " + lastName + ", Salary: "
				+ salary + ", Bonus: " + this.calculateBonus();
	}
	
	
	
	
}