package oop;

public class bankApp {
	
	public static void main(String[] args){
		// object name come before new instantiate variable name you gave it.
		BankAccount account = new BankAccount();
		
		account.deposit(1500);
		account.deposit(1500);
		account.deposit(1500);
		account.deposit(1500);
		account.withdraw(2000);
		System.out.println(account.toString());
		//account.setRate();
		//account.increaseRate();
		
		//LoanAccount loanAcct = new LoanAccount();
		//loanAcct.setRate();
		//loanAcct.increaseRate();
		
		// Polymorphism through overloading
		// Polymorphism is the code changes itself each time it runs, 
		// but the function of the code(it semantics) will not change at all.
		BankAccount acct1 = new BankAccount("Saving Account", 5000);
		System.out.println(acct1.getAccountNumber());
		
		BankAccount acct2 = new BankAccount("Checking Account", 1000);
		System.out.println(acct2.getAccountNumber());
		/*CD_Account cd = new CD_Account();
		cd.accountNumber = 900153;
		cd.balance = 5000;
		cd.name = "Jose";
		cd.accountType = "Certificate Deposit Account";
		//System.out.println(cd.toString());
		cd.compound();*/
	}
}
