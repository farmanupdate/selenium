package SeleniumJava;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTest {
	
  @Test(dataProvider = "dp")
  
  public void f(String S1, String S2) {
	  System.out.println(S1 + " " + S2);
  }
  
  @DataProvider
  public Object[][] dp() throws Exception
  {
	  Object[][] Str = getExcelData();
	  return Str;
	  
  }
  
  String[][] getExcelData() throws Exception
  {
	  //String readData[][] = null;
	  
	  FileInputStream ReadExcelData = new FileInputStream("M:\\SDET Training\\SeleniumExcel.xlsx");
	  
      XSSFWorkbook book1 = new XSSFWorkbook(ReadExcelData);
	  
	  Sheet sh = book1.getSheetAt(0);
	  
	  Row r1 = sh.getRow(0);
	  
	  int rowNum = sh.getLastRowNum();
	  System.out.println("Number of rows " +rowNum);
	  int colNum = r1.getLastCellNum();
	  System.out.println("Number of columns " +colNum);
	  
	  String readData[][] = new String[rowNum+1][colNum];
	  
	  
	  for(int r=0; r<=rowNum; r++)
	  {  
		  for(int c=0; c<colNum; c++)
		  {
			  readData[r][c] = sh.getRow(r).getCell(c).getStringCellValue();  
			  
		  }
			  
	  }  
      return readData; 		  		  
  }
   
}
