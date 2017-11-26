// A package is a namespace that organizes a set of 
// related classes and interfaces. Conceptually like folder
// on your computer.
package basic;

public class HelloWorld {
	// The static keyword denotes that a member variable,
	// or method, can be accessed without requiring an 
	// instantiation of the class to which it belongs.
	// Basically, means you call a method, even if you've
	// object never been created. associated with the class, 
	// not a specific instance (object) of that class.
	public static void main(String[] args){
		String one = "This is one.";
		// void means that the method has no return value.
		// main() it is a method or a function name (HelloWorld).
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
		System.out.println(one);
	}
	// String[] means java is expecting an array of strings.
	// args contains the supplied command-line arguments as an array of string object.
}
