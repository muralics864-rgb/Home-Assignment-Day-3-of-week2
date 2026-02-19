package week3.day3;

public class RadioButton extends Button {

	public void selectRadioButton() {
		System.out.println("Selected from selectRadioButton");

	}

	public static void main(String[] args) {
		
		RadioButton objRadioButton = new RadioButton();
		objRadioButton.click();

	}

}
