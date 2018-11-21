package edu.century.pa2;

public class Customer{
	private String firstName;
	private String lastName;
	private String address;
	private int age;
	private static int id = 32000;
	
	//===========================================================
	//constructor that will create a customer with a name, last name, address, age
	public Customer(String firstName, String lastName, String address, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		//id = id+10;
	}
	//===========================================================
	//getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getId() {
		id = id+10;
		return id;
	}
	//===========================================================
	//setters
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	//==========================================================
	
	//toString method to return firstName, lastName, address, id, age
	public String toString() {
		String Info = "First Name: " + firstName + "Last Name: " + lastName + 
				"Address: " + address + "ID: " + id + "Age: " + age;
		return Info;
	}
}