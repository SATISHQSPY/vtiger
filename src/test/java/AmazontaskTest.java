import java.util.List;

import org.apache.poi.xdgf.usermodel.section.geometry.MoveTo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazontaskTest {


private static final WebDriver WebDriver = null;

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\TYSS\\SDET_HYD\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	
List<WebElement> SELall=driver.findElements(By.id("searchDropdownBox"));


	for (WebElement ele1:SELall)
	{
		String List=ele1.getText();
	System.out.println(List);
	
}
	driver.findElement(By.id("searchDropdownBox")).click();
	driver.findElement(By.xpath("//option[@value='search-alias=todays-deals']")).click();

}
}
