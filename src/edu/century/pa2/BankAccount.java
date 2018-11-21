package edu.century.pa2;

import java.util.Date;
import java.util.Random;

public class BankAccount{
	private double balance;
	private Date date;
	private long accountNumber;
	private double annualInterestRate;
	private double monthlyInterest;
	private Object Customer;
	private double interestRate;
	
	//=======================================================
	//constructor to generate specified customer, balance, interest 
	//	rate also generate account number and current date
	public BankAccount(double balance, Date date, long accountNumber, double annualInterestRate) {
		this.balance = balance;
		this.date = date;
		this.accountNumber = accountNumber;
		this.annualInterestRate = annualInterestRate;
	}
	
	//========================================================
	public BankAccount(Object Customer, double balance, double interestRate) {
		this.Customer = Customer;
		this.balance = balance;
		this.interestRate = interestRate;
		
	}
	
	//method that will generate a random 9 digit number for accountNumber
	public long generateAccountNumber() {
		Random rand = new Random();
		accountNumber = rand.nextInt(9000000)+1000000;
		return accountNumber;
	}
	
	public double interestRate() {
		return interestRate;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Date getDate() {
		return date;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = (annualInterestRate / 12);
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest() {
		return monthlyInterest;
	}

	//getCustomer
	public Object getCustomer() {
		return Customer;
	}
	
	//========================================================
	//setters
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setData(Date newDate) {
		date = newDate;
	}
	
	public void setAccountNumber(long newAccountNumber) {
		accountNumber = newAccountNumber;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	//deposit(int)
	//if statement must be added so it can't accept negative values
	public double deposit(double num) {
		if (num < 0 ) {
			System.out.println("Can't Accept Negative Values");
			System.exit(0);
		}
		double sum;
		sum = num + balance;
		return sum;
	}
	
	//withdraw(int)
	//if statement so it can't accept negative values and any values < the balance
	public double withdraw(double num) {
		double difference;
		if(num <= 0 && num > balance) {
			System.out.println("Invalid Balance");
			System.exit(0);
		}
		difference = num - balance;
		return difference;
	}
	
	//toString method
	public String toString() {
		String Info = "Balance: " + balance + "Date: " + date + "Account Number: " + 
				accountNumber + "Annual Interest Rate: " + annualInterestRate + 
				"Monthly Interest: " + monthlyInterest;
		return Info;
	}
		
	}