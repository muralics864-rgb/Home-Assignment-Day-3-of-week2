package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IsDisplayd {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");

		// Instantiate the Browser driver
		ChromeDriver driver = new ChromeDriver(opt);

		// Maximize the browser window.

		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Load the url
		driver.get("http://leaftaps.com/opentaps/");

		// Enter the username as ‘demosalesmanager’
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// Enter the password as 'crmsfa'
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Extract the Title of the web page
		

		

		// Click on the CRM/SFA link
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();

		// Click on the Leads tab.
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// Click on the Create Lead link from shortcuts.
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		// Advance xpath from Elder cousing to younger cousin
		
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[1]")).sendKeys("Dua Company limited");
		
		// Advance xpath from Elder cousing to younger cousin
		
		driver.findElement(By.xpath("//span[text()='First name']/following::input[@id='createLeadForm_firstName']")).sendKeys("Dua Niha");
		
		//Advance xpath from Elder cousing to younger cousin
		
		driver.findElement(By.xpath("//span[text()='Last name']/following::input[@name='lastName']")).sendKeys("C M");
		
		driver.findElement(By.xpath("//span[text()='First Name (Local)']/following::input[@id='createLeadForm_firstNameLocal']")).sendKeys("Bumbudu");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Dua Department");
		
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Dua Description");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']/preceding::input[1]")).sendKeys("dua@gmail.com");
		
		WebElement slctStat = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select slctState = new Select(slctStat);
		slctState.selectByVisibleText("New York");
		
		boolean isEnab = driver.findElement(By.xpath("//input[@name='submitButton']")).isEnabled();
		
		System.out.println(isEnab);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.contains("Lead"))
		{
		 System.out.println("Title Contains");
		}
		else
		{
			System.out.println("title doesnt contains");
		}

	}

}
