package testProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class MavenDemoTest {
	
	static ChromeDriver chrome;
	static XSSFWorkbook book1;
	static Sheet sh3;
	
  @Test
  public void Demo1() throws Exception 
  {
	  
	  FileInputStream ReadKeywords = new FileInputStream("M:\\SDET Training\\SeleniumExcelMaven.xlsx");
//	  System.setProperty("webdriver.chrome.driver", "M:\\SDET Training\\chromedriver_win32\\chromedriver.exe");
//	  chrome = new ChromeDriver();
	  
	  book1 = new XSSFWorkbook(ReadKeywords);
	  Sheet sh1 = book1.getSheetAt(0);
	  Sheet sh2 = book1.getSheetAt(1);
	  sh3 = book1.getSheetAt(2);
	  
	  Row r1 = sh1.getRow(0);
	  Row r2 = sh2.getRow(0);
	  Row r3 = sh3.getRow(0);
	  
	  int rowNum = sh1.getLastRowNum();
	  System.out.println("Sheet1 " +rowNum);
	  int rowNum1 = sh2.getLastRowNum();
	  System.out.println("Sheet2 " +rowNum1);
	  int colNum = r1.getLastCellNum();
	  System.out.println("Sheet1 " +colNum);
	  int colNum1 = r2.getLastCellNum();
	  System.out.println("Sheet2 " +colNum1);
	  
	  for(int r=0; r<=rowNum1; r++)
	  {
		  String Uname = sh2.getRow(r).getCell(0).getStringCellValue();
		  System.out.println("Username " + Uname);
		  String Pass = sh2.getRow(r).getCell(1).getStringCellValue();
		  System.out.println("Password " + Pass);
		  
		  for(int R=0; R<=rowNum; R++)
		  {
			  String Keywords = sh1.getRow(R).getCell(0).getStringCellValue();
			  System.out.println("Keyword " + Keywords);
			  String Locator = sh1.getRow(R).getCell(1).getStringCellValue();
			  System.out.println("Locator " + Locator);
			  
	  		switch(Keywords)
	  		{
	  			case "OpenBrowser":
	  				OpenBrowser();
	  				break;
		  
	  			case "EnterURL":
	  				EnterURL(Locator);
	  				break;	
	  				
	  			case "EnterUsername":
	  				EnterUsername(Locator, Uname);
	  				break;
	  				
	  			case "EnterPassword":
	  				EnterPassword(Locator, Pass);
	  				break;
	  				
	  			case "ClickOnLogin":
	  				ClickOnLogin(Locator);
	  				break;	
	  			
	  			case "CheckForWelcome":
	  				CheckForWelcome(Locator, Locator);
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
		  //chrome.get(URL);
	  }
  
	  static void EnterURL(String URL)
	  {
		  chrome.manage().window().maximize();   	
		  chrome.get(URL);
		  chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  }
	  
	  static void EnterUsername(String UnameId, String Uname)
	  {
		  chrome.findElement(By.id(UnameId)).sendKeys(Uname);
	  }
	  
	  static void EnterPassword(String PwdId, String Pass ) 
	  {
		  chrome.findElement(By.id(PwdId)).sendKeys(Pass);	  
	  }
  
	  static void ClickOnLogin(String btnId)
	  {
		  chrome.findElement(By.id(btnId)).click();
	  	
	  }
	  
	  static void CheckForWelcome(String WelId, String Logout) throws Exception 
	  {
		  
	  	  try
		  {
//	  		  FileInputStream ReadKeywords = new FileInputStream("M:\\SDET Training\\SeleniumExcelMaven.xlsx");
//	  		  XSSFWorkbook book1 = new XSSFWorkbook(ReadKeywords);
//			  Sheet sh3 = book1.getSheetAt(2);
			  chrome.findElement(By.id(WelId)).click();
			  chrome.findElement(By.xpath(Logout)).click();
			  sh3.getRow(0).getCell(0).setCellValue("Logged out successfully");
			  System.out.println("Logged out Successfully");
		  }
		  catch (Exception e) 
		  {		
//			  FileInputStream ReadKeywords = new FileInputStream("M:\\SDET Training\\SeleniumExcelMaven.xlsx");
//	  		  XSSFWorkbook book1 = new XSSFWorkbook(ReadKeywords);
//			  Sheet sh3 = book1.getSheetAt(2);
			  e.printStackTrace();
			  sh3.getRow(0).getCell(0).setCellValue("Home screen not found");
			  System.out.println("Home screen not found");
		  }	  
 
	  }
}
	  
//	  chrome.navigate().to("https://opensource-demo.orangehrmlive.com/");
//	  chrome.manage().window().maximize();
//	  chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//	  
//	  chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
//	  chrome.findElement(By.id("txtPassword")).sendKeys("admin123");
//	  chrome.findElement(By.id("btnLogin")).click();
	  