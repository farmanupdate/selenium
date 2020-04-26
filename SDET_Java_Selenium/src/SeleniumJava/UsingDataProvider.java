package SeleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingDataProvider {
  @Test(dataProvider = "dpTest", dataProviderClass=StoreDataProvider.class)
  
  public void UsingDP(String S1, String S2) {
	  
	  System.setProperty("webdriver.chrome.driver","M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver chrome = new ChromeDriver();
		
	  chrome.get("https://opensource-demo.orangehrmlive.com/");
	  chrome.manage().window().maximize();  
	  chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);	
	  
	  chrome.findElement(By.id("txtUsername")).sendKeys(S1);
	  chrome.findElement(By.id("txtPassword")).sendKeys(S2);
	  chrome.findElement(By.id("btnLogin")).click();
	  chrome.quit();
	   
  }
}
