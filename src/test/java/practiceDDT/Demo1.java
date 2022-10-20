package practiceDDT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
	public static void main(String[] args) throws Throwable{
		//System.setProperty("webdriver.chrome.driver.", "C:\\Users\\hp\\eclipse-workspace\\TYSS\\SDET_HYD\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("denyBtn")).click();
		WebElement ele1=driver.findElement(By.xpath("//a[@title='Rings']"));
		Actions act= new Actions(driver);
		act.moveToElement(ele1).perform();
		driver.findElement(By.xpath("//a[@title='Diamond Rings']")).click();
		List<WebElement> allPrice = driver.findElements(By.id("bst-discounted-price"));
		int count = allPrice.size();
		System.out.println(count);
		for (int i=0;i<count;i++) {
			String text = allPrice.get(i).getText();
			System.out.println(text);

		}
	}
}
