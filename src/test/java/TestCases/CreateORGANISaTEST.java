package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectaryUtility.HomePageClass;

public class CreateORGANISaTEST {
	@Test(groups = "regression")
	public void createOrganisationTest() {
		WebDriver driver;
		HomePageClass homePageClass = new HomePageClass(driver);
		homePageClass.orgClick;

		driver.findElement(By.linkText("Testyantra")).click();
		String data = driver.findElement(By.xpath("//span[text()='[ ACC1 ] Testyantra -  Organization Information']")).getText();
		String data1 = "Testyantra";
		String[] arr = data.split(" ");
		String valu2=arr[3];
		Assert.assertEquals(data1, valu2);
	}

}

