package tESTNGpavanSir;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genericutility.ExcelFileUtility;

public class DataPrividerUSINGexcel {
@Test(dataProvider = "excelDATA")
public void getdata(String UN,String PWD) {
	System.out.println(UN+" "+PWD);
}
@DataProvider
public Object[][] excelDATA() throws Throwable {
	Object arr[][]=new Object[4][2];
	
	
	ExcelFileUtility excelFileUtility=new ExcelFileUtility();
	for (int i=0;i<=excelFileUtility.getLastRowCount("Sheet3");i++)
	{
		arr[i][0]=excelFileUtility.ReadDATAEXCELfile("Sheet3", i,0);
	arr[i][1]=excelFileUtility.ReadDATAEXCELfile("Sheet", i, 1);
	}
	return arr;
}
}
