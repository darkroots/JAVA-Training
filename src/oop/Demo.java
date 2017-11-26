package oop;

class Person{
	// defining Person properties.
	String name;
	String email;
	String phone;
	
	// defining Person methods
	void walking(){
		System.out.println(name + " is walking");
	}
	
	void eating(){
		System.out.println(name + " is eating");
	}
	
	void sleeping(){
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Create an instantiation of the Person Object
		Person personOne = new Person();
		personOne.name = "Elliot";
		personOne.email = "ellbrady@yahoo.com";
		personOne.phone = "206-476-9170";
		
		//Invoking the Person methods
		personOne.walking();
		personOne.eating();
		personOne.sleeping();
	}

}
