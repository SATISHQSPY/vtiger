package vTIGER;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateorgwithINDUSTRAILtest {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.findElement(null)
	driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.SPACE,Keys.ENTER);
	driver.findElement(By.xpath("//td[@align='center'][3]")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("accountname")).sendKeys("name");
	//driver.findElement(By.name("industry")).click();
//	driver.findElement(By.xpath("//option[@value='Finance']")).click();
//	 driver.findElements(By.xpath("//input[@type='text']"));
//	driver.findElement(By.id("[id='bas_searchfield']")).click();
//	driver.findElement(By.className("[name='submit']")).click();
	
	 WebElement signICON=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		signICON.click();
		Actions act = new Actions(driver);
		act.moveToElement(signICON).perform();
		
		 WebElement  SignOUT = driver.findElement(By.linkText("Sign Out"));
	    SignOUT.click();
}
}
