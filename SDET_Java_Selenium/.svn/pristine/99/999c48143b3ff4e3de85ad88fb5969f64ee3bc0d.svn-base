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


public class HybridDrivenFramework 
{
  static ChromeDriver chrome;
  
  @Test
  public void CallingFunctions() throws Exception
  {
	  //read the excel data
	  FileInputStream ReadKeywords = new FileInputStream("M:\\SDET Training\\SeleniumExcelKeyWord.xlsx");
	  // creating an excel object
	  XSSFWorkbook book1 = new XSSFWorkbook(ReadKeywords);
	  //Reading the data from the sheets
	  Sheet sh1 = book1.getSheetAt(0);
	  Sheet sh2 = book1.getSheetAt(1);
	  
	  //Getting the row numbers
	  Row r1 = sh1.getRow(0);
	  Row r2 = sh2.getRow(0);
	  
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
}



