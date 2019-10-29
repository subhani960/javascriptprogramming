package mavenproject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writenewexcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
    String filepath = System.getProperty("user.dir")+"//studentdetailes//student4.xlsx";
    File f = new File(filepath);
    Workbook wb = null;
    Sheet s = null;
    Row r = null;
    Cell c = null;
    if(filepath.endsWith(".xls"))
    	wb = new HSSFWorkbook();
    else if (filepath.endsWith(".xlsx"))
    	wb = new XSSFWorkbook();
    s = wb.createSheet("Name");
    for(int i=0; i<10; i++) {
    	r = s.createRow(i);
    for(int j=0; j<10; j++) {
    	c = r.createCell(j);
    	c.setCellValue("subhani"+i+j);
    	System.out.println("subhani");
    }
    }
    FileOutputStream fos = new FileOutputStream(f);
    wb.write(fos);
    wb.close();
	}

}
