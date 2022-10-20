package com.modifyVTIGER;

	import java.awt.Window;
import java.time.Duration;
import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

import Genericutility.ExcelFileUtility;
import Genericutility.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

	
public class MODCompareORGwithINDUSTRAILtest{
		public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ExcelFileUtility eFU = new ExcelFileUtility();
		String Mr=eFU.ReadDATAEXCELfile("Sheet1", 7, 1);
		String Firstname = eFU.ReadDATAEXCELfile("Sheet1", 7, 2);
		String LastName=eFU.ReadDATAEXCELfile("Sheet1", 7, 3);
		
		driver.get("http://localhost:8888");
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("admin");
		WebElement login = driver.findElement(By.id("submitButton"));
		login.click();

		WebElement conMOD=driver.findElement(By.linkText("Contacts"));
		conMOD.click();
		
		WebElement createNEW = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createNEW.click();
		
		WebElement nameTYPE= driver.findElement(By.name("salutationtype"));
	Select select = new Select(nameTYPE);
	select.selectByValue(Mr);




	WebElement FIRSTnameTF = driver.findElement(By.name("firstname"));
	FIRSTnameTF.sendKeys(Firstname);

	WebElement LASTnameTF = driver.findElement(By.name("lastname"));
	LASTnameTF.sendKeys(LastName);


	WebElement ORGicon = driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"));
	ORGicon.click();

	 String PARENTwin = driver.getWindowHandle();
	 System.out.println(PARENTwin);
	 
	 Set<String>  allWIN= driver.getWindowHandles();
	 
	 for(String allWindow:allWIN)
	 {
		 driver.switchTo().window(allWindow);
	System.out.println(allWindow); 
	 }
	 
	 WebElement ORGname= driver.findElement(By.name("search_text"));
	 ORGname.sendKeys("TY");
	 

	 
	 WebElement SEARCHTY= driver.findElement(By.linkText("TY"));
	 SEARCHTY.click();
	 
	 driver.switchTo().window(PARENTwin);
	 
	 WebElement SaveBTN= driver.findElement(By.name("button"));
	 SaveBTN.click();
	
	 
	 WebElement signICON=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		signICON.click();
		Actions act = new Actions(driver);
		act.moveToElement(signICON).perform();
		
		 WebElement  SignOUT = driver.findElement(By.linkText("Sign Out"));
	    SignOUT.click();
	 
	    driver.close();
	 
		}

	}


