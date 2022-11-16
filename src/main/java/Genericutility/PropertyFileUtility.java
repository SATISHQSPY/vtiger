package Genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtility {
public String Fromproertyfile(String key) throws Throwable
{
	FileInputStream fis = new FileInputStream("./COMdata/commonDATA.properties");
	Properties p = new Properties();
	p.load(fis);
	String value =p.getProperty(key);//adding as parameter
	return value; //return type change to string
}

public String readDatafromPropertyFile(String string) throws Throwable {
	FileInputStream fis = new FileInputStream("./COMdata/commonDATA.properties");
	Properties p = new Properties();
	p.load(fis);
	String value =p.getProperty(string);//adding as parameter
	return value; //return type change to string
	
}
}
