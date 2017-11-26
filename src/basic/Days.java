package basic;

public class Days {
	
	public static void console(String str){
		System.out.println(str);
	}
	
	public static void main(String[] args){
		// Execute different block of code based on the value of a condition
		String dayOfWeek = "Tuesday";
		
		switch(dayOfWeek){
			case "Monday" : 
				console("The day of the week is Monday.");
				break;
			case "Tuesday" : 
				console("The day of the week is Tuesday.");
				break;
			case "Wednesday" : 
				console("The day of the week is Wednesday.");
				break;
			case "Thursday" : 
				console("The day of the week is Thursday.");
				break;
			case "Friday" : 
				console("The day of the week is Friday.");
				break;
			case "Saturday" : 
				console("The day of the week is Saturday.");
				break;
			case "Sunday" : 
				console("The day of the week is Sunday.");
				break;
		}
	}
}
