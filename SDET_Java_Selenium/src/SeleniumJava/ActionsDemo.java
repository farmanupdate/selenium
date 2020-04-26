package SeleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo {
	
	static ChromeDriver chrome;
	
  @Test
  public void Actions() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver","M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
	  chrome = new ChromeDriver();
	  Actions Act = new Actions(chrome);
	  chrome.manage().window().maximize();   	
	  chrome.navigate().to("https://opensource-demo.orangehrmlive.com/");
	  chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  String txt = chrome.findElement(By.xpath("//span[text()='Username']")).getText();
	  System.out.println(txt);
	  chrome.findElement(By.cssSelector("form>div>input")).sendKeys("Admin");
	  chrome.findElement(By.id("txtPassword")).sendKeys("admin123");
	  //chrome.findElement(By.xpath("//input[starts-with(@id,'btn')]")).click();
	  //chrome.findElement(By.cssSelector("input[id^='btn']")).click();
	  //chrome.findElement(By.cssSelector("input.button")).click();
	  chrome.findElement(By.cssSelector("input[id$='gin']")).click();
	  Thread.sleep(4000);
	  
	  WebElement Admin = chrome.findElement(By.linkText("Admin")); //Webelement is an interface so we have to keep the actions class just below it.
	  Act.moveToElement(Admin).build().perform();
	  WebElement Job = chrome.findElement(By.linkText("Job"));
	  Act.moveToElement(Job).build().perform();
	  WebElement JobTitles = chrome.findElement(By.linkText("Job Titles"));
	  Act.click(JobTitles).build().perform();
	  Thread.sleep(2000);
	  chrome.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "T");
	  
	  Thread.sleep(2000);
	  
//	  chrome.navigate().back();
//	  chrome.findElement(By.id("welcome")).click();
//	  chrome.findElement(By.linkText("Logout")).click();
//	  chrome.quit();
	  	  
  }
}
