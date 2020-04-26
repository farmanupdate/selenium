package POMTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class zeroLoginTest {

	static ChromeDriver chrome;
		
		public static void main(String[] args)
		{
			
			System.setProperty("webdriver.chrome.driver","M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
			
			chrome = new ChromeDriver();
			chrome.manage().window().maximize(); 
			System.out.println("Browser launched successfully");
			chrome.get("http://zero.webappsecurity.com/login.html");
			chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			System.out.println("Website launched successfully");
			
			storePageObjects objects = PageFactory.initElements(chrome, storePageObjects.class);
			objects.logintest();
			
			
		}
	
}
