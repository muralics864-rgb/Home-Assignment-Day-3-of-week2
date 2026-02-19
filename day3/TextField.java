package week3.day3;

public class TextField extends WebElement{
	
	public void getTexty() {
		System.out.println("Text from GetTexty Class");
	}

	public static void main(String[] args) {
		
		TextField objText = new TextField();
		objText.click();

	}

}
