package basic;

import java.io.Console;
import java.util.Scanner;

public class NumberCalc {
	
	public static void main(String[] args){
		printName();
		int x = 10;
		int y = 20;
		addNumbers(x, y);
		int product = multiplyNumbers(x, y);
		auth();
	}
	
	static void auth(){
		System.out.println("Enter your username: ");
		Scanner input = new Scanner(System.in);
		String username = input.nextLine();
		System.out.println("Your username is " + username);
	}
	
	static void console(String str){
		System.out.println(str);
	}
	
		static void printName(){
			System.out.println("My name is Elliot");
		}
		
		static void addNumbers(int num1, int num2){
			int sum = num1 + num2;
			System.out.println(sum);
		}
		
		static int multiplyNumbers(int valueA, int valueB){
			int product = valueA * valueB;
			addNumbers(product + 50, product);
			return product;
		}
}
