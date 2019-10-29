package mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Dataexisting {
  @Test
  public void f() throws IOException {
	  String filepath = System.getProperty("user.dir")+"//studentdetailes//student information.xlsx";
	  String sheetname = "student detailes";
	  File n = new File(filepath);
	  FileInputStream is = new FileInputStream(n);
	  Workbook wb = null;
	  Sheet s = null;	  
	  Row r = null;	  
	  Cell c = null;	  
	  if(filepath.endsWith(".xls"))
		  wb = new HSSFWorkbook(is);
	  else if(filepath.endsWith(".xlsx"))
		  wb = new XSSFWorkbook(is);
	  s = wb.getSheet(sheetname);
	  int nr =s.getLastRowNum()+1;
	  for(int i=1; i<nr; i++) {
		  r = s.getRow(i);
		  c = r.getCell(6);
		  if (c==null)
			  c = r.createCell(6);
		      c.setCellValue("jilani");
			  System.out.println("jilani");
			 
	  }
	  FileOutputStream fos=new FileOutputStream(n);
	  wb.write(fos);
	  wb.close();		  
  }
}
