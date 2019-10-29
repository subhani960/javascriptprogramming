package mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Datadriven {
  @Test
  public void f() throws IOException {
	  String filepath = System.getProperty("user.dir")+"//studentdetailes//student information.xlsx";
	  String sheetname ="student detailes";
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
	  System.out.println(s.getLastRowNum());
	  r = s.getRow(6);
	  c = r.getCell(1);
	  System.out.println(c.getStringCellValue());
	  
	  
	  
  }
}
