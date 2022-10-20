package vTIGER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class createINDUSTRAILtest {

	public static void main(String[] args) throws Throwable {
//		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("admin");
		WebElement login = driver.findElement(By.id("submitButton"));
		login.click();
		
		String orgaName="orgName1";
		
		WebElement orgBTN1 = driver.findElement(By.linkText("Organizations"));
		orgBTN1.click();
		
		WebElement createNEW = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createNEW.click();
		
		WebElement fNameTF = driver.findElement(By.name("accountname"));
		fNameTF.sendKeys(orgaName);
		
		WebElement INDtype=driver.findElement(By.name("industry"));
		
		Select select= new Select(INDtype);
		select.selectByValue("Banking");
		
		WebElement saveButton = driver.findElement(By.name("button"));
		saveButton.click();
		
		WebElement Header = driver.findElement(By.className("dvHeaderText"));
		String htext = Header.getText();
		System.out.println(htext);
		if(htext.contains(orgaName)) {
			System.out.println("Validated sucessfully");
		}
		else {
			System.out.println("Not Validated");
		}
		WebElement signICON=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		signICON.click();
		Actions act1 = new Actions(driver);
		act1.moveToElement(signICON).perform();
		
		 WebElement  SignOUT = driver.findElement(By.linkText("Sign Out"));
	    SignOUT.click();
	 
	    driver.close();
	}

}

