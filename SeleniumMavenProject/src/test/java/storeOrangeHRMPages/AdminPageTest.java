package storeOrangeHRMPages;

import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminPageTest {
	
	//Actions act;
	static ChromeDriver chrome;
	static List<WebElement> paymentTypes;
	static XSSFWorkbook book1;
	
	@When("i hover mouse on admin")
	public void i_hover_mouse_on_admin() throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
		
		chrome = new ChromeDriver();
		chrome.manage().window().maximize(); 
		System.out.println("Browser launched successfully");
		chrome.get("http://zero.webappsecurity.com/");
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		System.out.println("Website launched successfully");
		chrome.findElement(By.id("signin_button")).click();
		chrome.findElement(By.id("user_login")).sendKeys("username");	
		chrome.findElement(By.id("user_password")).sendKeys("password");
		chrome.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		
		
		FileInputStream ReadData = new FileInputStream("M:\\SDET Training\\SeleniumCucumber.xlsx");
		book1 = new XSSFWorkbook(ReadData);
		
		
//		LoginPageTest LP = new LoginPageTest();
//		this.chrome = LP.chrome; 
//		System.out.println(chrome.getCurrentUrl());
//		WebElement admin = chrome.findElement(By.id("menu_admin_viewAdminModule"));
//		
//		act.moveToElement(admin).build().perform();
		
	}
	
	@Then("the suboptions should be displayed")
	public void the_suboptions_should_be_displayed() throws Exception
	{
		
		for(int i=0; i<=5; i++)
			{
			List<WebElement> paymentTypes = chrome.findElementsByCssSelector("a[style='text-decoration:underline']");
			
			System.out.println("Payment Types: " +(paymentTypes.get(i).getText()));
			}
	}
		
}
