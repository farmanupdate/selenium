package stepsdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefinitionClassForOrangeHRM 
{
	static ChromeDriver chrome;
	@Given("Open Browser and visit orangeHRM site")
	public void open_Browser_and_visit_orangeHRM_site() 
	{
		System.setProperty("webdriver.chrome.driver","M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
		
		chrome = new ChromeDriver();
		chrome.manage().window().maximize();   	
		chrome.get("https://opensource-demo.orangehrmlive.com/");
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		System.out.println("Website launched successfully");
		
	}

	@When("Home page is launched")
	public void home_page_is_launched() 
	{
		
		String LoginPanel = "LOGIN Panel";
		String LoginPanelActual = chrome.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
		Assert.assertEquals(LoginPanel,LoginPanelActual);
		System.out.println("Home page is launched successfull");
	}
	
	@When("I enter the credentials {string} and {string}")
	public void i_enter_the_credentials(String username, String password) throws Exception
	{
		
		try
			{
			System.out.println("Entering the credentials");
			System.out.println(username + " " + password );
			chrome.findElement(By.id("txtUsername")).sendKeys(username);	
			chrome.findElement(By.id("txtPassword")).sendKeys(password);
			chrome.findElement(By.id("btnLogin")).click();
			Thread.sleep(4000);
			String Dashboard = "Welcome Admin";
			String DashboardActual = chrome.findElement(By.xpath("//*[@id=\'welcome\']")).getText();
			Assert.assertEquals(Dashboard, DashboardActual);
			System.out.println("Logged in successfull");
			
			}
		
		catch(Exception exp)
			{
				exp.printStackTrace();
				System.out.println("Invalid credentials");
			}
		
	}
	
	@When("I enter the set of credentials {string} and {string}")
	public void i_enter_the_set_of_credentials_and(String uname, String pwd) throws Exception 
	{
		try
			{
			chrome.findElement(By.id("txtUsername")).sendKeys(uname);	
			chrome.findElement(By.id("txtPassword")).sendKeys(pwd);
			chrome.findElement(By.id("btnLogin")).click();
			Thread.sleep(4000);
			String Dashboard = "Welcome Admin";
			String DashboardActual = chrome.findElement(By.xpath("//*[@id=\'welcome\']")).getText();
			Assert.assertEquals(Dashboard, DashboardActual);
			System.out.println("Logged in successfull");
			}
		
		catch(Exception Err)
			{
				Err.printStackTrace();
				System.out.println("Invalid credentials");
			}

	}

	@Then("User should be logged out")
	public void user_should_be_logged_out() throws Exception
	{
		try
			{
			
				chrome.findElement(By.xpath("//*[@id=\'welcome\']")).click();
				chrome.findElement(By.linkText("Logout")).click();
				String LoginPanel = "LOGIN Panel";
				String LoginPanelActual = chrome.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
				chrome.findElement(By.linkText("//*[@id='welcome-menu']/ul/li[2]/a")).click();
					
				Assert.assertEquals(LoginPanel, LoginPanelActual);	
					
				System.out.println("Logged out successfully");
			}
		
		catch(Exception Err)
			{
				Err.printStackTrace();
				System.out.println("Logged out not successfull");
					
			}
	}

}
