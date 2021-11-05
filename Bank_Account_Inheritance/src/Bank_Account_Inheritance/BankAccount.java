package Bank_Account_Inheritance;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import java.time.LocalDate;




public class BankAccount {
	private String name;
	private int accountNumber;
	private double balance;
	
	
	
	
	
	BankAccount(){
	this.name = " ";
		this.accountNumber = 0;
		this.balance = 0.0;
		
	}
	
	BankAccount(String name, int accountNumber, double balance){
		
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
					
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setDeposit(double depositAmount) {
		this.balance += depositAmount;
		
	    

	}
	
	
	public void withdraw(double withdrawAmount) {
		this.balance -= withdrawAmount;
	}
	

	
	
	
	
	
	
	
	//tostring method
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0000");
		
		return "\nAccount Holder: " + this.name + "\nAccount Number: " + 
					df.format(accountNumber) + "\nBalance: " + this.balance;
	}
	
}
