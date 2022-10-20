package vTIGER;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.apache.poi.sl.draw.geom.MoveToCommand;
import org.apache.poi.xdgf.usermodel.section.geometry.MoveTo;
import org.checkerframework.checker.interning.qual.EqualsMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

//import com.mysql.cj.jdbc.Driver;

public class CreateORGtest {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost:8888/");
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.SPACE,Keys.ENTER);
driver.findElement(By.xpath("//td[@align='center'][3]")).click();
driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
driver.findElement(By.name("accountname")).sendKeys("qwerty145");
driver.findElement(By.name("button")).click();
String compare =driver.findElement(By.xpath("[class='dvHeaderText']")).getText();
System.out.println(compare);



	
	
////SIGNOUT
//WebElement e =driver.findElement(By.xpath("//img[@src="themes/softed/images/user.PNG"]"));
//Actions act = new Actions(driver);
//act.moveToElement(e).perform();
//
////SEARCH BUTTON driver.findElement(By.className("[name='submit']")).click();
}
}
