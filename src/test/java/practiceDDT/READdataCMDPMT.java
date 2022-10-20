package practiceDDT;

import org.testng.annotations.Test;

public class READdataCMDPMT {
@Test
public void readDataTest(){
	String Url=System.getProperty("url");
	String Username=System.getProperty("username");
	String Password=System.getProperty("password");
	System.out.println("=====>"+Url);
	System.out.println("<====="+Username);
	System.out.println("<=====>"+Password);
}
}
