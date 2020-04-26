package storeOrangeHRMPages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
	
	static ChromeDriver chrome;
	
	@Given("Browser Open")
	public void Browser_Open() 
	{
		System.setProperty("webdriver.chrome.driver","M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
		
		chrome = new ChromeDriver();
		chrome.manage().window().maximize(); 
		System.out.println("Browser launched successfully");
		
	}

	@When("I enter URL")
	public void I_enter_URL() 
	{
		chrome.get("https://opensource-demo.orangehrmlive.com/");
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		System.out.println("Website launched successfully");
	}
	
	@Then("Check if login page is displayed")
	public void Check_if_login_page_is_displayed() 
	{
		String LoginPanel = "LOGIN Panel";
		String LoginPanelActual = chrome.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
		Assert.assertEquals(LoginPanel,LoginPanelActual);
		System.out.println("Login page is launched successfull");
	
	}
	
	@And("when i enter the credentials {string} and {string}")
	public void when_i_enter_the_credentials(String username, String password) throws Exception
	{
		try
		{
		System.out.println("Entering the credentials");
		System.out.println(username + " " + password );
		chrome.findElement(By.id("txtUsername")).sendKeys(username);	
		chrome.findElement(By.id("txtPassword")).sendKeys(password);
		chrome.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		
		//System.out.println("Logged in successfull");
		
		}
	
	catch(Exception exp)
		{
			exp.printStackTrace();
			System.out.println("Invalid credentials");
		}
	}
	
	@Then("User should be logged in and dashboard should be displayed")
	public void User_should_be_logged_in_and_dashboard_should_be_displayed() throws Exception
	{
		try
		{
			String Dashboard = "Welcome Admin";
			String DashboardActual = chrome.findElement(By.xpath("//*[@id=\'welcome\']")).getText();
			Assert.assertEquals(Dashboard, DashboardActual);
			System.out.println("Login & Dashboard is displayed Successfully");
		}
		
		catch(Exception exp)
		{
			exp.printStackTrace();
			System.out.println("Dashboard is not displayed");
		}
	}
	

}
