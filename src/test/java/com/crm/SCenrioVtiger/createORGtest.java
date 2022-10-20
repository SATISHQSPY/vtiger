package com.crm.SCenrioVtiger;

    import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	

	public class createORGtest {


	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.SPACE,Keys.ENTER);
	driver.findElement(By.xpath("//td[@align='center'][3]")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	driver.findElement(By.name("accountname")).sendKeys("qwerty1451111");
	driver.findElement(By.name("button")).click();

	
	}
	}


