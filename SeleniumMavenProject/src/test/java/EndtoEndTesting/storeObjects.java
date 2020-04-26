package EndtoEndTesting;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

//import POMTest.storeObjects;

public class storeObjects {
	
	static ChromeDriver chrome;
	
	
	@FindBy(name="user_login")
	WebElement un;
	
	@FindBy(name="user_password")
	WebElement pass;
	
	@FindBy(name="submit")
	WebElement Lbtn;
	
	@FindBy(className="brand")
	WebElement HPage;
	
	@FindBy(id="transfer_funds_tab")
	WebElement TransferBtn;
	
	@FindBy(xpath="//*[@id=\"transfer_funds_content\"]/form/div/div/h2")
	WebElement TransferPage;
	
	@FindBy(xpath="//*[@id=\"transfer_funds_content\"]/div/div/h2")
	WebElement TransferConfirm;
	
	//@FindBy()
	
	public void logintest()
	{
		un.sendKeys("username");
		pass.sendKeys("password");
		Lbtn.click();
		
	}
	
	public void transactionPage()
	{
		String HomePage = "Zero Bank";
		String HomePageActual = HPage.getText();
		 
		System.out.println("Home page landed is " +HomePageActual);
		Assert.assertEquals(HomePage,HomePageActual);
	}
	
	public void transferFunds()
	{
		TransferBtn.click();
				
	}
	
	public void transferFundsPageAppears()
	{
		String TransferPageExpected = "Transfer Money & Make Payments";
		String TransferActualPage = TransferPage.getText();
		System.out.println("Transfer Page text is = " + TransferActualPage);
		Assert.assertEquals(TransferPageExpected,TransferActualPage);
		
	}
	
	public void transferFundsConfirmation()
	{
		String TransferFundsExpected = "Transfer Money & Make Payments - Confirm";
		String TransferFundsActual = TransferConfirm.getText();
		System.out.println("Confirmation Message for successfull transfer = " + TransferFundsActual);
		Assert.assertEquals(TransferFundsExpected,TransferFundsActual);
		
	}

}
