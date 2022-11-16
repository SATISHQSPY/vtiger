package tESTNGpavanSir;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonClass {
	static WebDriver driver;

	@Test
	public void amazon() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		AssertJUnit.assertEquals(false, true);
	}

	@Test

	public void flipkart() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://flipkart.com");
		System.out.println(driver.getTitle());
		AssertJUnit.assertEquals(true, true);

	}
}
