package week3.day3;

public class Button extends WebElement {

	public void submit() {
		System.out.println("Submitted from button Class");

	}

	public static void main(String[] args) {
		
		Button objButton = new Button();
		objButton.setText("Arguement from Button Class");

	}

}
