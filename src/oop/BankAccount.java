package oop;

public class BankAccount implements IRate{
	
		//Defining Bank Account components
		// set to private to restrict access to parent class
			private String ssn;
			private String accountType;
			private String name;
			private double balance;
			private int accountNumber;
			private int routingNumber;
			private String accountHolder;
			
			// Setters
			protected void setAccountNumber(){
				this.accountNumber = getAccountNumber();
			}
			
			protected int getAccountNumber(){
				
				int acctNum = 900000000 + ((int)(Math.random() * 100) * 10000) 
						+ ((int)(Math.random() * 100) * 1000000) 
						+ ((int)(Math.random() * 100) * 10) ;
				return acctNum;
			}
			
			private void setSsn(String ssn){
				this.ssn = getSsn();
			}
			
			private void setAccountHolder(){
				this.accountHolder = getAccountHolder();
			}
			
			private void setRoutingNumber(){
				this.routingNumber = getRoutingNumber();
			}
			
			private void setAccountType(String type){
				this.accountType = type;
				getAccountType();
			}
			
			public void setName(String name){
				this.name = name;
			}
			
			// basic form of encapsulation, methods are accessible outside of the class
			// class properties are unavailable.
			public void setBalance(double balance){
				this.balance = balance;
			}
			
			// Getter
			protected String getSsn(){
				return this.ssn;
			}
			
			protected int getRoutingNumber(){
				return 125000357;
			}
			
			public String getAccountHolder(){
				return this.accountHolder;
			}
			public String getAccountType(){
				return this.accountType;
			}
			
			public String getName(){
				return name;
			}
			
			public double getBalance(){
				return balance;
			}
			
			// Interface methods
			public void setRate(){
				System.out.println("Setting rate");
			}
			
			public void increaseRate(){
				System.out.println("increasing rate");
			}
			
			// Constructor definitions: unique methods
				//1. They are used to define / setup / initialize properties of an object
				//2. constructors are implicitly called upon instantiation
				//3. The same name as the class itself
				//4. Constructors have NO return type
			
			// You can declare as many constructors as you choose.
			BankAccount(){
				System.out.println("NEW ACCOUNT CREATED");
				setName("Elliot Brady");
				setSsn("534-92-8098");
				setAccountHolder();
				setAccountType("Checking");
				setRoutingNumber();
				setAccountNumber();
			}
			
			BankAccount(String accountType, double initDeposit){
				String msg;
				System.out.println("NEW ACCOUNT: " + accountType);
				System.out.println("Inital Deposit of: " + "$" + initDeposit);
				if(initDeposit < 1000){
					msg = "Error: Minimum deposit must be at least $1,000";
				} else {
					msg = "Thanks for your initial deposit of: $" + initDeposit;
				}
				System.out.println(msg);
				setBalance(initDeposit);
			}
			
			// Overloading: call same method name with different arguments
			BankAccount(String accountType){
				System.out.println("NEW ACCOUNT: " + accountType);
			}
			
			// Define methods
			// public access modifier means that it visible throughout the package or program.
			public void deposit(double amount){
				balance = balance + amount;
				showActivity("Deposit");
			}
			
			void withdraw(double amount){
				balance = balance - amount;
				showActivity("withdraw");
			}
			
			// private is only available within the class.
			private void showActivity(String activity){
				System.out.println("Your recent transaction: "  + activity);
				System.out.println("your new balance is: $" + balance);
			}
			
			void checkBalance(){
				System.out.println("Balance: " + balance);
			}
			
			void status(){
				
			}
			
			// overrides already existing method of an inherited class.
			@Override
			public String toString(){
				return 
						"[ NAME: " + name +
						"SSN# " + ssn +
						". ACCOUNT#" + accountNumber 
						+ ". ROUTING#" + routingNumber 
						+ ". BALANCE: $" + balance +
						" ]";
			}
		
	}
