package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Genericutility.WebDriverUtility;
import ObjectaryUtility.HomePageClass;

public class CreateCONTACTwithORGnameTEST<ContactDetailsPageClass> extends {
	@Test(groups = "smoke")
	public void createConWithOrgNametest() throws Throwable {
		WebDriver driver;
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		HomePageClass homePageClass = new HomePageClass(driver);
		homePageClass.conB();
		CreateConPageClass createConPageClass = new CreateConPageClass(driver);
		createConPageClass.createCon();
		ContactDetailsPageClass contactDetailsPageClass = new ContactDetailsPageClass(driver);
		contactDetailsPageClass.firstName("Mr.");

		contactDetailsPageClass.firstName("Bahubali");
		contactDetailsPageClass.lastName("Amarendra");
		contactDetailsPageClass.getSelOrg().click();

		String parentwin = webDriverUtility.switchToParent();
		webDriverUtility.allHandles(parentwin);
		contactDetailsPageClass.getSrchTxt().sendKeys("amsa");
		contactDetailsPageClass.getSearchBtn().click();
		contactDetailsPageClass.getCompanyNameClick().click();
		driver.switchTo().window(parentwin);
		contactDetailsPageClass.getsButton().click();
		Thread.sleep(3000);

	}
}
