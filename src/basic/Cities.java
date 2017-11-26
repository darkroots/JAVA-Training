package basic;

public class Cities {
	
	public static void console(String str){
		System.out.println(str);
	}
	
	public static void loop(String[] array){
		for(int i = 0; i < array.length; i++){
			console(array[i]);
		}
	}
	
	public static void main(String[] args){
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		loop(cities);
		System.out.println("********************");
		// Declare array of states
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		loop(states);
		System.out.println("********************");
	}
}
