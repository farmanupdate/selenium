package SeleniumJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
	
	public static void main(String[] args) throws Exception 
	{
	
	String file = "M:\\SDET Training\\SeleniumExcel.xlsx";
	File fl = new File("M:\\SDET Training\\SeleniumExcel.xlsx");
	FileInputStream readExcelFileData = new FileInputStream(fl);
	Workbook book1 = new XSSFWorkbook(readExcelFileData);
	Sheet sh = book1.getSheetAt(0);
	System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
	//sh.createRow(5).createCell(2).setCellValue("Testing");
	
	FileOutputStream f = new FileOutputStream(fl);
	sh.getRow(0).getCell(0).setCellValue("Testing for writing Excel");
	sh.createRow(1).createCell(0).setCellValue("Demo");
	book1.write(f);
	System.out.println("After Update : ");
	System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
	System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
	System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
	
	System.out.println("Data Inserted");
	f.close();
	
   }
	
}