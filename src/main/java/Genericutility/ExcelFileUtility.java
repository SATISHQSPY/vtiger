package Genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.sdk.metrics.data.Data;

public class ExcelFileUtility {
public String ReadDATAEXCELfile(String Sheetnum, int rownum, int cellnum ) throws Throwable {
	FileInputStream fis =new FileInputStream("./COMdata/COMDATEXC.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet s =wb.getSheet(Sheetnum);
	 Row r =s.getRow(rownum);
	   Cell c = r.getCell(cellnum);
	    String value = c.getStringCellValue();
	    return value;
	
}

public int getLastRowCount(String sheetNum) throws Throwable {
	FileInputStream fis=new FileInputStream("./COMdata/COMDATEXC.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
int sn=wb.getSheet(sheetNum).getLastRowNum();
return sn;
}

public int getLastRowCount(String sheetNum) {
	FileInputStream fis = new FileInputStream("./COMdata/COMDATEXC.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	return wb.getSheet(sheetNum).getLastRowNum();
}
}
