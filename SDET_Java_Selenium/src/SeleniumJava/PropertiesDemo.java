package SeleniumJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class PropertiesDemo {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		FileInputStream read = new FileInputStream("C:\\Users\\ZainAaliya\\eclipse-workspace\\SDET_Java_Selenium\\src\\SeleniumJava\\data.properties");
		
		Properties p = new Properties();
		p.load(read);
		
		System.setProperty("webdriver.chrome.driver", "M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://opensource-demo.orangehrmlive.com/");
		chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		chrome.findElement(By.id(p.getProperty("un"))).sendKeys("Admin");
		chrome.findElement(By.id(p.getProperty("pwd"))).sendKeys("admin123");
		chrome.findElement(By.name(p.getProperty("Loginbtn"))).click();
		System.out.println("Logged in successfully");
		
		chrome.findElement(By.id(p.getProperty("wel"))).click();
		chrome.findElement(By.linkText(p.getProperty("logoutbtn"))).click();
		
		System.out.println("Logged out successfully");
		chrome.close();
		
		
				

	}

}
