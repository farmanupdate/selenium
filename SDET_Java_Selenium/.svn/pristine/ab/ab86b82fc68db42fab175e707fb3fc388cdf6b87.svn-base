package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class LoginTest {
  static ChromeDriver chrome;
  @Test
  public void LoginURL() 
  {
	  System.setProperty("webdriver.chrome.driver", "M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
	  chrome = new ChromeDriver();
	  System.out.println("Entering the credentials");
	  chrome.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Admin");
	  chrome.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("admin123");
	  chrome.findElement(By.cssSelector("input[name=Submit]")).click();
	  
	  
  }
}
