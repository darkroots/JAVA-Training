package oop;

public class CD_Account extends BankAccount implements IRate {

	String interestRate;
	
	void compound(){
		System.out.println("Compounding interest");
	}
	
}
