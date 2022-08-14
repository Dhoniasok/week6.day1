package testNGUsinginvocationCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	
	@Test(invocationCount=2)
	public  void dupLead() {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver (); // object
		 driver.get("http://leaftaps.com/opentaps"); // URL
		 driver.manage().window().maximize();    // to maximize
		 // find the user name and enter the user name
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 // find the password field and enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 // to click login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 // Click on CRM/SFA Link
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 //Click on Leads Button
		 driver.findElement(By.linkText("Leads")).click();
		 //Click on Create Lead 
		 driver.findElement(By.linkText("Create Lead")).click();
		 //Enter CompanyName Field Using id Locator
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		 //Enter FirstName Field Using id Locator
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Asok");
		 //Enter LastName Field Using id Locator
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		 // Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dhoni");
		 //Enter Department Field Using any Locator of Your Choice
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Tester");
		 //Enter Description Field Using any Locator of your Choice 
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("I am good to learn more about automation");
		 //Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("viratashok997@gmail.com");
		 
		 //Select State/Province as NewYork Using Visible Text
		WebElement dropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("New York");  // using VisibleText
		 driver.findElement(By.name("submitButton")).click();
		 
		 //Click on Duplicate button
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 
		// Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		
		//Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Asok");
		
		//Click on Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		 //Get the Title of Resulting Page using driver.getTitle()
		 String title = driver.getTitle();
		 {
			 System.out.println(" The title of the page is " +title);
		 }
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
			
		 driver.close();
	}

}
