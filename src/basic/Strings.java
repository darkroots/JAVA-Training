package basic;

public class Strings {
	
	static void search(String str, String search){
		if(str.contains(search)){
			System.out.println("The string contains the word: " + str);
		}
	}
	
	static void console(String str){
		System.out.println(str);
	}
	
	static void caseSearch(String str){
		if(str.equalsIgnoreCase(str)){
			console("This is your word: " + str);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The lord of the Rings";
		
		search(bookTitle, wordChoice);
		
		String browser = "Chrome";
		caseSearch(browser);
		
		String firstName = "Elliot";
		String lastName = "Brady";
		String SSN = "534-92-8098";
		
		console(firstName.substring(0, 6));
	}

}
