package Bank_Account_Inheritance;


public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 BankAccount nina = new BankAccount("Nina Masters", 0001 ,1000);
		 System.out.println(nina);
		 CheckingAccount john = new CheckingAccount("John Smith", 0002, 500,500);
		 System.out.println(john);
		 SavingAccount amy = new SavingAccount("Amy Smith", 0003,15000,3.5);
		 System.out.println(amy);
		 
		 
        john.setDeposit(10000);
        john.MonthEnd(500);
        System.out.println(john);
 
        amy.withdraw(5000);
        amy.MonthEnd(5000);
         // calls pete's toString() implicitly
        System.out.println(amy);

         
        
       
		
		
	}

}
