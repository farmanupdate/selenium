package SeleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertionDemo 
{
	
	static ChromeDriver chrome;
	
  @Test
  public void assertTest() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
	  chrome = new ChromeDriver();
	  chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  
	  //Maximise the browser window
	  
	  chrome.manage().window().maximize();
	  chrome.get("https://opensource-demo.orangehrmlive.com/");
	  
	  String LogintxtA = "LOGIN Panel";
	  String LogintxtB = chrome.findElement(By.xpath("//*[@id='logInPanelHeading']")).getText();
	  Assert.assertEquals(LogintxtB, LogintxtA);
  } 
	
  	  @Test(dependsOnMethods= {"assertTest"}, alwaysRun = true)
	  public void TestDependsOn()
	  {
		  System.out.println("Test for depends on");
	  }
	  	  
  
}
