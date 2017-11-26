package Lab;

public class Lab2 {
	
	public static void main(String[] args){
		// Create static a student information
		Student stud1 = new Student("Janelle", "321456987");
		Student stud2 = new Student("Thomas", "45679546");
		Student stud3 = new Student("Elizabeth", "615326574");
		
		stud1.enroll("Math 151");
		stud1.enroll("Eng 255");
		stud1.enroll("Hist 211");
		stud1.payTuition(758);
		System.out.println(stud1.toString());
	}
	
}

	interface activities{
		public void enroll(String courses);
		public void payTuition(int amount);
		public void checkBalance();
		public void showCourses();
		public String toString();
		public static final int costOfCourse = 800;
	}
	
	class Student implements activities{
		// properties
		private static int ID = 1000, balance;
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		private String userId, name, ssn, email, phone, city, state;
		private String courses = "";
		
		
		public Student(String name, String ssn){
			ID++;
			this.name = name;
			this.ssn = ssn;
			setUserId();
			setEmail();
		}
		
		private void setEmail(){
			email = name.toLowerCase() + "." + ID + "@sdetuniversity.com";
			System.out.println("Your email: " + email);
		}
		
		private void setUserId(){
			int max = 9000;
			int min = 1000;
			int randNum = (int)(Math.random() * ((max - min)));
			randNum = randNum + min;
			userId = ID + randNum + ssn.substring(5);
			System.out.println("Your User ID: " + userId);
		}
		
		public void enroll(String courses){
			this.courses = this.courses + " " + courses;
			balance = balance + costOfCourse;
		}
		
		public void payTuition(int amount){
			balance = balance - amount;
		}
		
		public void checkBalance(){
			System.out.println("Balance: $" + balance);
		}
		
		public void showCourses(){
			System.out.println(courses);
		}
		
		public String toString(){
			return "[NAME: " + name + " ] [COURSES: " + courses + "] [BALANCE: " + balance + "]";
		}
	}
