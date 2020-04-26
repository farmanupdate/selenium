package SeleniumJava;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class KeywordDriven 
{
  static ChromeDriver chrome;
  
  @Test
  public void CallingFunctions() throws Exception
  {
	  
	  FileInputStream ReadKeywords = new FileInputStream("M:\\SDET Training\\SeleniumExcelKeyWord.xlsx");
	  XSSFWorkbook book1 = new XSSFWorkbook(ReadKeywords);
	  Sheet sh = book1.getSheetAt(0);
	  
	  Row r1 = sh.getRow(0);
	  
	  int rowNum = sh.getLastRowNum();
	  System.out.println(rowNum);
	  int colNum = r1.getLastCellNum();
	  System.out.println(colNum);
	  
	  for(int r=0; r<=rowNum; r++)
	  {
		  for(int c=0; c<colNum; c++)
		  {
			  String Keywords = sh.getRow(r).getCell(c).getStringCellValue();    
			  
	  		switch(Keywords)
	  		{
	  			case "OpenBrowser":
	  				OpenBrowser();
	  				break;
		  
	  			case "EnterURL":
	  				EnterURL();
	  				break;	
	  				
	  			case "EnterUsername":
	  				EnterUsername();
	  				break;
	  				
	  			case "EnterPassword":
	  				EnterPassword();
	  				break;
	  				
	  			case "ClickOnLogin":
	  				ClickOnLogin();
	  				break;		
			 }
		  }
	   }
  }
   	  static void OpenBrowser() 
	  {
		  
   		  System.setProperty("webdriver.chrome.driver","M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
		  //ChromeDriver chrome = new ChromeDriver();
   		  chrome = new ChromeDriver();
		  chrome.get("https://opensource-demo.orangehrmlive.com/");
	  }
  
	  static void EnterURL()
	  {
		  chrome.manage().window().maximize();   	
		  chrome.get("https://opensource-demo.orangehrmlive.com/");
		  chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  }
	  
	  static void EnterUsername()
	  {
		  chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
	  }
	  
	  static void EnterPassword() 
	  {
		  chrome.findElement(By.id("txtPassword")).sendKeys("admin123");	  
	  }
  
	  static void ClickOnLogin()
	  {
		  chrome.findElement(By.name("Submit")).click();
	  }
}




