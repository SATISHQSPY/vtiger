package practiceDDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXCELreadDATATest1 {
public static void main(String[] args) throws Throwable {
		
		//Step1 Convert excel file into java object	
FileInputStream fis =new FileInputStream("./modexcel.xlsx");
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("Sheet1");
Row r =sh.getRow(5);
Cell c =r.getCell(1);
String value=c.getStringCellValue();
System.out.println(value);
	
	}

}


