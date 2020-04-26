package POMTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class storePageObjects {
	
	//page object model
	
	@FindBy(name="user_login")
	WebElement un;
	//equivalent to : chrome.findElement(By.name("user_Login"))
	
	@FindBy(name="user_password")
	WebElement pass;
	
	@FindBy(name="submit")
	WebElement Lbtn;
	
	public void logintest()
	{
		un.sendKeys("username");
		pass.sendKeys("password");
		Lbtn.click();
	}
	
	

}
