//This program will create a BankAccount object
//This will include two classes, BankAccount & Customer
//PA2
//By: Luke Moua
//Instructor Zak
//Due: October 8, 2018

package edu.century.pa2;

import java.util.Date;
import java.util.Random;

public class Info {

	/*

	 	CLASS 1
	 	
	1. 4 variables (balance, date, accountNumber, annualInterestRate)
	2. accessor and mutator method for balance, annualInterestRate, date
	3. accesor method for accountNumber
	4. constructor that creates account with specific customer, balance,
		and interest rate, also generate account number and current date
	5. method called getMonthlyInterestRate that returns monthly interest rate
		(annualInterestRate / 12)
	6. method called getMonthlyInterestRate returns monthly
	7. method called generateAccountNumber returns 9 digit #
	8. method called getMonthlyInterest, returns monthly interest
		(balance * monthlyInterestRate)
	9. method called Deposit that takes parameter of double, this method will
		add the value of parameter of the balance (no neg. values)
	10. method called withdraw takes parameter of a double type, method will
		subtract value of the parameter from the balance
		(no neg. and values greater than existing balance)
	11. override to toString method to print info about account
	 
	 	CLASS 2
	 
	 1. 5 variables (firstName, lastName, address, age, id)
	 2. accessor & mutator method for all variables except id
	 3. constructor that creates a customer with specified first name, last name,
	 	address, and age (generate customer id)
	 4. make toString method, return all info about the account info
	 5. override equal method, method should return true if the calling object
	 	is equal to the other object
	 
	 */
	
	//driver(main)
	public static void main(String[] args) {
		double balance = 1330;
		double interestRate = 4.5;
		
		Customer customer1 = new Customer("Sarah", "Smith", "319 grand ave", 24);
		System.out.println("customer-1 toString: \n" + customer1.toString());
		
		Customer customer2 = new Customer("John", "Smith", "12 nicollect", 34);
		System.out.println("customer-2 toString: \n" + customer2.toString());
		
		BankAccount account = new BankAccount(customer1, balance, interestRate);
		
		System.out.println("Current Balance: " + account.getBalance());
		account.deposit(200);
		System.out.println("Current Balance: " + account.getBalance());
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Created date: " + account.getDate());
		System.out.println("Customer ID: " + ((Customer) account.getCustomer()).getId());
		System.out.println("Monthly Inerest Rate: " + account.getMonthlyInterestRate());
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
		System.out.println("Current Balance: " + account.getBalance());
		account.withdraw(300);
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
		System.out.println("Account-1 toString output: \n" + account.toString());
		}
	
	
	
	
}


