package practiceDDT;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class READdatadependfromXMLText {
	@Test
	public void readDataTest(XmlTest xml)
	{
		String url=xml.getParameter("url");
		System.out.println(url);
		String username=xml.getParameter("username");
		System.out.println(username);
		String password=xml.getParameter("password");
		System.out.println(password);
	}
}
