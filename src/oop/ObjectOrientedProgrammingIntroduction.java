package oop;

public class ObjectOrientedProgrammingIntroduction {
	
	public static void main(String[] args){
		String[] abstraction= new String[5];
		abstraction[0] = "Abstraction - the ability for the client to access only the specific, desired properties";
		abstraction[1] = "\t\t Comes from Latin abs, meaning away from and trahere, meaning to draw.";
		abstraction[2] = "The process of taking away or removing characteristics from something in order to reduce it";
		abstraction[3] = "to a set of essential characteristics. In order to reduce complexity and increase efficiency.";
		abstraction[4] = "The object that remains is a representation of the original, with unwanted detail omitted.";
		consoleL(abstraction);
		
		String encapsulation = "Encapsulation - binding methods and properties together while hiding complex, inner-workings.";
		console(encapsulation);
		
		String inheritance = "Inheritance - classes are organized in a hierarchy that passes properties down to child classes.";
		console(inheritance);
		
		String polymorphism = "Polymorphism - ability for methods and objects to take on various forms fro sake or reusability and convenience.";
		console(polymorphism);
		
	}
	
	public static void console(String str){
		System.out.println(str);
	}
	
	public static void consoleN(int n){
		System.out.println(n);
	}
	
	public static void consoleL(String [] arr){
		for(int i = 0; i < arr.length; i++){
			console(arr[i]);
		}
	}
}
