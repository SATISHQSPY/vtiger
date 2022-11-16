package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import Genericutility.PropertyFileUtility;

public class SEARCHorganisNAMEadvSEARCH {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	PropertyFileUtility pfu = new PropertyFileUtility();
	String URL=pfu.Fromproertyfile("URL");
	}
}
String UN=pfu.readDatafromPropertyfile("UN");
String PWD=pfu.readDatafromPropertyfile("UPWD");
driver.get(URL);
driver.manage().timeouts().implicitlywait(Duration.ofSeconds(10));
WebElement NAME=driver.findElement(By.name("user_name"));
PWD.sendkeys(uNAME);
 

WebElement PWD=driver.findElement(By.name("user_password"));
PWD.sendkeys(PWD1);

WebElement loginButton=driver.findElement(By.id("submitButton"));
loginButton.click();

WebElement orgClick=driver.findElement(By.xpath("//a[text()='Organizations']"));
orgClick.click();

WebElement advsearch=driver.findElement(By.xpath("//a[text()='Go to Advanced Search']"));
advsearch.click();


String parentwin = driver.getWindowHandle();
System.out.println(parentwin);

Set<String> allwin = driver.getWindowHandles();

for(String awindow:allwin)
{
	   driver.switchTo().window(awindow);
	   System.out.println(awindow);
}

WebElement equalsdd=driver.findElement(By.name("fop0"));
Select select=new Select(equalsdd);
select.selectByIndex(1);

WebElement orgnameTf = driver.findElement(By.name("fval0"));
orgnameTf.sendKeys("Testyantra",Keys.ENTER);

WebElement orgname=driver.findElement(By.linkText("Testyantra"));
orgname.click();

driver.switchTo().window(parentwin);
Thread.sleep(3000);
// String orgnametext=driver.findElement(By.className("dvHeaderText")).getText();

WebElement admdd=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
   Actions act=new Actions(driver);
   act.moveToElement(admdd).perform();
   
   
   WebElement signout=driver.findElement(By.xpath("//a[text()='Sign Out']"));
   signout.click();
   
   driver.close()
