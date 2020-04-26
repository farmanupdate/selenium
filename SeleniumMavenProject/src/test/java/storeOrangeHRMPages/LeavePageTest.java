package storeOrangeHRMPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeavePageTest {
	
	static ChromeDriver chrome;
	
	@When("I hover mouse on leave")
	public void I_hover_mouse_on_leave() 
	{
		
		System.out.println("Hovered on leave");
		
	}
	
	@Then("the leave suboptions should be displayed")
	public void the_leave_suboptions_should_be_displayed() 
	{
		
		//List<WebElement> paymentTypes = chrome.findElement
		System.out.println("Leave Suboptions are displayed");
		
	}

}
