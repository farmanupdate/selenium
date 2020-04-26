package SeleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Workingwithxml {
	static ChromeDriver chrome;
  @Parameters({"un"})
  @Test(priority = 1)
  public void paraTest(String uname) 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
	  chrome = new ChromeDriver();
	  chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  
	  //Maximize the browser window
	  
	  chrome.manage().window().maximize();
	  chrome.get("https://opensource-demo.orangehrmlive.com/");
	  
	  chrome.findElement(By.id(uname)).sendKeys("Admin");	
	  //chrome.findElement(By.id("txtPassword")).sendKeys("admin123");
	  //chrome.findElement(By.name("Submit")).click();
  }  
	  @Parameters({"pwd","Login"})
	  @Test(priority = 2)
	  public void paraTest2(String pass, String LgnBtn) 
	  {
		  
		  chrome.findElement(By.id(pass)).sendKeys("admin123");
		  chrome.findElement(By.name(LgnBtn)).click();
		  System.out.println("Logged in Successfully");
		  
	  }  
	  
	  @Parameters({"wel","Logout"})
	  @AfterTest
	  public void LogoutTest(String wel, String LogO)
	  {
		 
		  chrome.findElement(By.id(wel)).click();
		  chrome.findElement(By.xpath(LogO)).click();
		  System.out.println("Logged out Successfully");
		 
	  }  
	  
	  
}
 

