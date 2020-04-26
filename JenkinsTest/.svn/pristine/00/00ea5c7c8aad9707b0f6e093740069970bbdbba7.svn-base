package JenkinsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsTestNGClass {
	
	static ChromeDriver chrome;
	
  @Test
  public void f() 
  {
	  
	  	System.setProperty("webdriver.chrome.driver","M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
		
		chrome = new ChromeDriver();
		chrome.manage().window().maximize(); 
		System.out.println("Browser launched successfully");
		chrome.get("http://zero.webappsecurity.com/login.html");
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		System.out.println("Website launched successfully");
		System.out.println("This is jenkins test");
	  
  }
}
