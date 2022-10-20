package practiceDDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXCELtaskModifyTest {
	public static void main(String[] args) throws Throwable{
		FileInputStream fis =new FileInputStream("./modexcel.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		 int lastname=sh.getLastRowNum();
//		 for (int i=1;i<=lastname;i++)
//		 {
//			String name= sh.getRow(i).getCell(1).getStringCellValue();
//		 System.out.println(name);
//		
//		 }

		//salary more then 35000
//		 for (int i=1;i<=lastname;i++)
//		 {
//			 int sal =(int) sh.getRow(i).getCell(3).getNumericCellValue();
//			 if (sal>35000)
//			 {
//			 int salary=(int) sh.getRow(i).getCell(3).getNumericCellValue();
//			 System.out.println(salary);
//		 }
//		
//	}
		 //LOOK FOR QUALITYASSURANCE ENGG
		 for (int i=1;i<=lastname;i++)
		 {
		String	dept = sh.getRow(i).getCell(2).getStringCellValue();
			 if (dept.equals("qa"))
			 {
			String name=sh.getRow(i).getCell(1).getStringCellValue(); 
			System.out.println(name);
			 }
		 }


	}
}

