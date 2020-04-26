package SeleniumJava;

import static org.testng.Assert.assertNull;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGAssignment 
{
	static ChromeDriver chrome;
	
	//Function for login with valid credentials
	@Parameters({"signbtn","un","pwd","loginbtn"})
	@Test(priority=1)
  public void TestLogin(String signbtn,String uname, String pass, String loginbtn) throws Exception 
  {
	System.setProperty("webdriver.chrome.driver","M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
	chrome = new ChromeDriver();
	
	chrome.get("http://zero.webappsecurity.com/");
	chrome.manage().window().maximize();  
	chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
	chrome.findElement(By.id(signbtn)).click();
	chrome.findElement(By.id(uname)).sendKeys("username");	
	chrome.findElement(By.id(pass)).sendKeys("password");
	chrome.findElement(By.name(loginbtn)).click();
	Thread.sleep(3000);
  }
	
	@Parameters({"Homepage"})
	@Test(priority=2)
  public void TestHomepage(String Homepage) throws Exception
  {
	boolean HomePagetest = chrome.findElement(By.xpath(Homepage)).isDisplayed();
			
		if(HomePagetest==true)
		
			System.out.println("Login Successfull");
		
		else
		
			System.out.println("Login Unsuccessful");
			//chrome.close();		
  }
	
	//Logging out after successful login to test for login with invalid credentials
	
	@Parameters({"user","logout"})
	@Test(priority=3)//(dependsOnMethods = "TestHomepage")

  public void Logoutforvalidcre(String user, String logout) throws Exception
  {
	chrome.findElement(By.xpath(user)).click();
	chrome.findElement(By.id(logout)).click();
	Thread.sleep(5000);
	
	
	String Afterlogouthomepage = chrome.findElement(By.id("homeMenu")).getText();
	
	String Afterlogoutexpected = "HOME";
	
	if(Afterlogoutexpected.equals(Afterlogouthomepage))
	
		System.out.println("Logout is successful");
	else
		System.out.println("Logout is unsuccessful");
		//chrome.close();
  }
	
	//Function for login with invalid credentials
	
	@Parameters({"signbtn","un1","pwd1","loginbtn"})
	@Test(priority=4)
  public void TestLoginInvalid(String signbtn,String uname1, String pass1, String loginbtn) throws Exception 
  {
	
	chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
	chrome.findElement(By.id(signbtn)).click();
	chrome.findElement(By.id(uname1)).sendKeys("username1");	
	chrome.findElement(By.id(pass1)).sendKeys("password1");
	chrome.findElement(By.name(loginbtn)).click();
	Thread.sleep(3000);
	String LogoutformExp = "Login and/or password are wrong.";
	String logoutformAct = chrome.findElement(By.xpath("//*[@id=\'login_form\']/div[1]")).getText();
	
	Assert.assertEquals(logoutformAct, LogoutformExp);
	System.out.println("Cannot login due to invalid credentials");
	chrome.quit();
	
  }
	
	@Parameters({"Homepage"})
	@AfterTest
  public void TestHomepage1(String Homepage) throws Exception
  {
	//boolean HomePagetest = chrome.findElement(By.xpath(Homepage)).isDisplayed();
		
	  String HomePagetest = chrome.findElement(By.xpath(Homepage)).getAttribute("Value");
			
	Assert.assertNull(HomePagetest);
		
			//System.out.println("After test - Login Successfull");
		
			System.out.println("Login Unsuccessful-Credentials are invalid");
			//chrome.close();		
  }
	
  @Parameters({"CA","IA","CrA","LA"})
  @Test(priority=5)
  
  public void CheckAccWithBal(String CA, String IA, String CrA, String LA) throws Exception
  {
	  String CashAcc = chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/h2[1]")).getText();
	  
	  	try
	  	{
	  		System.out.println("Cash Account type is avialable");
	  		String CashSavings = chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/a")).getText();
	  		String CashSavings1 = chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/a")).getText();
	  	}	
	  	catch(Exception Exp)	  		
	  		{	
	  		System.out.println("Cash Account type is not avialable");
	  		}
	  			try	
	  			{
	  				System.out.println("Cash Account type savings are available");
	  				String CashSavingsBal = chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[3]")).getText();
	  				String CashSavingsBal1 = chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[2]/td[3]")).getText();
	  			}	
	  			catch(Exception Exp)
	  				{	
	  				System.out.println("Cash Account type savings are not available");
	
	  				String InvestAcc = chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/h2[2]")).getText();			
	  				}
			  try
			  {
			  		System.out.println("Investment Account type is avialable");
			  		String InvestmentBrokerage = chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/a")).getText();
			  }		  		
			  catch(Exception Exp)	  		
				{	
		  		System.out.println("Investment Account type is not avialable");
		  		}
			try
			{
				System.out.println("Cash Account type savings are available");
				String CashSavingsBal = chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[3]")).getText();
				String CashSavingsBal1 = chrome.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[2]/td[3]")).getText();
			}	
			catch(Exception Exp)
			{		
			System.out.println("Cash Account type savings are not available");	
			
			}
  }
}

