package basic;

import java.util.Scanner;

public class FibonnaciApp {
	public static void main(String[] args){
		// Fibonnaic number is defined by the sum of 2 previous fibonnaci numbers
		pickANumber();
	}
	
	public static void pickANumber(){
		Scanner input = new Scanner(System.in);
		consoleS("Pick a number: ");
		int num = input.nextInt();
		int result = fib(num);
		System.out.println("Your fibonnaci number is " + result + ", Your origin number is " + num );
	}
	
	public static void consoleN(int x){
		System.out.println(x);
	}
	public static void consoleS(String x){
		System.out.println(x);
	}
	
	
	public static int fib(int n){
		if(n == 0){
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		return ((fib(n-1)) + (fib(n-2)));
	}
}
