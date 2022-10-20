package Demo;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDATAproperties {

	public static void main(String[] args) throws Throwable {
		//Step1 Property file into java object 
		FileInputStream fis =new FileInputStream("./DDT.properties");
		Properties p = new Properties();
		//Step2 load java object
		p.load(fis);
		//step3 Read the data with return
		String url=	p.getProperty("url");
		System.out.println(url);
		String username= p.getProperty("username");
		System.out.println(username);
		String password=p.getProperty("password");
		System.out.println(password);
	}

}
