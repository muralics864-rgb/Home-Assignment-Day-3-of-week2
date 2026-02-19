package week3.day3;

public class SubClass extends SupClass { // Inheriting the class from Supclass

	// Creating two methods

	public void enterUsername() {
		System.out.println("Entered UserName");

	}

	public void enterPassword() {

		System.out.println("Entered Password");

	}

	public static void main(String[] args) {
// Accessing all the methods from both parent & child class
		SubClass obj1 = new SubClass();
		obj1.enterUsername();
		obj1.enterPassword();
		obj1.enterCredentials();
		obj1.navigateToHomePage();

	}

}
