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



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Test {
	public WebDriver driver;
	public static WebDriver sdriver;
	PropertyFileUtility propertyFileUtility=new PropertyFileUtility();
	
	@BeforeSuite
	public void CONNECTINGdatabase() {
	System.out.println("CONNECTING TO DB"); 
 }
	
	@AfterSuite
	public void ENDINGdatabase(){
		System.out.println("Disconnecting TO DB");
	}

	
	//**LAUNCH BROWSER**//
	
		@BeforeClass
	public void LAUNCHBROWSER () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	System.out.println("OPEN BROWSER");	
	}
	
	
		@AfterClass
	public void CLOSEBROWSER(){
	System.out.println("CLOSE BROWSER");	
	}
	
	
		@BeforeMethod
	public void method() {
		System.out.println(" ");
	}
	
		@AfterMethod
	public void method1() {
		System.out.println(" ");

	}
		
		
		
		
}

