package tESTNGpavanSir;

import org.testng.annotations.Test;

import Genericutility.BaseClass_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebHEADLESSclass extends BaseClass_Test {
@Test
public void webbrowser() {
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--headless");
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(chromeOptions);
	driver.get("https://www.amazon.com");
	System.out.println(driver.getTitle());
}
}
