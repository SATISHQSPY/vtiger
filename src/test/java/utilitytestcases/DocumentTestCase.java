package utilitytestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Genericutility.PropertyFileUtility;
import Genericutility.WebDriverUtility;
import ObjectaryUtility.HomePageClass;
import ObjectaryUtility.LOGINpageClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DocumentTestCase {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.Maximize();
		wdu.implicitywait();
		PropertyFileUtility pfu=new PropertyFileUtility();
		String uRl = pfu.readDatafromPropertyFile("url");
		String uName = pfu.readDatafromPropertyFile("username");
		String pWd = pfu.readDatafromPropertyFile("password");
		driver.get(uRl);
		
		LOGINpageClass lpc=new LOGINpageClass(driver);
		lpc.LOGIN(uName, pWd);
		
		HomePageClass hpc=new HomePageClass(driver);
		hpc.getDocumentsBtn().click();
		
		DocumentPageClass dpc=new DocumentPageClass(driver);
		dpc.getDocumentPlusBtn().click();
		dpc.getTitleTf().sendKeys("Tharun1");
		dpc.getsButton().click();
		Thread.sleep(3000);
		
		hpc.actionOnAdmin(driver);
	    hpc.getSignOUT().click();
	    driver.close();
		
		
		
		
	}

}
}
