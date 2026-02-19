package week3.day3;

public class CustomButton extends Button {

	public void clickCheckButton() {
	System.out.println("Clicked from clickCheckButton Class");

	}

	public static void main(String[] args) {
	
		
		CustomButton objCustomButton = new CustomButton();
		objCustomButton.submit();
		
	}

}
