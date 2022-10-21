package Genericutility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectaryUtility.HomePageClass;
import ObjectaryUtility.LOGINpageClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Test {
	public WebDriver driver;
	public static WebDriver sdriver;
	PropertyFileUtility propertyFileUtility=new PropertyFileUtility();
	
	@BeforeSuite(groups = {"smoke","integration","regression"})
	public void CONNECTINGdatabase() {
	System.out.println("CONNECTING TO DB"); 
 }
	
	@AfterSuite(groups = {"smoke","integration","regression"})
	public void ENDINGdatabase(){
		System.out.println("Disconnecting TO DB");
	}

	
	//**LAUNCH BROWSER**//
	
		@BeforeClass(groups = {"smoke","integration","regression"})
	public void LAUNCHBROWSER () throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		sdriver=driver;
		 WebDriverUtility webDriverUtility=new WebDriverUtility(driver);
		webDriverUtility.Maximize();
		webDriverUtility.implicitywait();
		String uRl = propertyFileUtility.readDatafromPropertyFile("url");
		driver.get(uRl);
	
	System.out.println("OPEN BROWSER");	
	}
	
	
		@AfterClass(groups = {"smoke","integration","regression"})
	public void CLOSEBROWSER () {
			driver.close();
	System.out.println("CLOSE BROWSER");	
	}
	
	
		@BeforeMethod
			(groups = {"smoke","integration","regression"})
			public void loginIntoPage() throws Throwable
			{
				String uName = propertyFileUtility.readDatafromPropertyFile("username");
				String pWd = propertyFileUtility.readDatafromPropertyFile("password");
				LOGINpageClass loginPageClass=new LOGINpageClass(driver);
				loginPageClass.LOGIN(uName, pWd);
		System.out.println(" ");
	}
	
		@AfterMethod(groups = {"smoke","integration","regression"})
	public void method1() {
			HomePageClass homePageClass = new HomePageClass(driver);
			homePageClass.actionOnAdmin(driver);
			homePageClass.getSignOUT().click();
		System.out.println(" ");

	}
		
		
		
		
}

