package Bank_Account_Inheritance;


//import java.time.LocalDate;

public class SavingAccount extends BankAccount {

	private double interestRate;
	
	
 SavingAccount() {
		super();
		this.interestRate = 0;
		
 }
		SavingAccount (String name, int accountNumber, double balance, 
				double interestRate) {
		
		super(name, accountNumber, balance);
			//or
			//setFirstName(firstName);
			
		
		this.interestRate = interestRate;
		
	}
	
		
	public void MonthEnd(double averageDailyBalance) {
		//super();
	//double interest;	
		
		averageDailyBalance += (this.getBalance() *interestRate) / 12;
    }	     

	
	
	
	 

	
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
      
	
//tostring method 
	
	public String toString() {
		String s = super.toString();
		return s + "\nInterest Rate: " + this.interestRate;
	}
	
	
	
}
