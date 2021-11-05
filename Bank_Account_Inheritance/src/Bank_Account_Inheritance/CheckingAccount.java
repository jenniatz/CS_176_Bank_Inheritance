package Bank_Account_Inheritance;


public class CheckingAccount extends BankAccount {

	private double averageDailyBalance;
	
CheckingAccount() {
		super();
		this.averageDailyBalance = 0;
	
 }
		
			CheckingAccount (String name, int accountNumber, double balance, double averageDailyBalance) {
			
			super(name, accountNumber, balance);
				
			
			this.averageDailyBalance = averageDailyBalance;
			

	}	
	
	
	public void MonthEnd(double averageDailyBalance) {
		//super();
		//if balance is less than 1500 charge a 20.00 fee else keep the same 
		
			if (averageDailyBalance < 1500){
				this.setBalance(getBalance() - 20);
		        this.averageDailyBalance = getBalance();
		    
			}
			else {
				
			}
		}
	

	public double getAverageDailyBalance() {
		return averageDailyBalance;
	}

	public void setAverageDailyBalance(double averageDailyBalance) {
		this.averageDailyBalance = averageDailyBalance;
	}
	
	
	//tostring method
	public String toString() {
		String s = super.toString();
		return s + "\nDaily Balance:  " 
				+ this.averageDailyBalance;
	}
	
	}
	
	
	
	

