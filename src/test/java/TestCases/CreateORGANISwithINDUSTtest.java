package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectaryUtility.HomePageClass;
import ObjectaryUtility.ORGinfoPAGEclass;

public class CreateORGANISwithINDUSTtest extends BaseClass{
		@Test(groups = "integration")
		public void createOrganisationWithIndustryType() throws Throwable{
			

			String orgname1="Testyantra solutions"+JavaUtillity.generateRanNum();
			String indType = "Biotechnology";
			WebDriver driver;
			HomePageClass homePageClass = new HomePageClass(driver);
			homePageClass.orgB();
			ORGinfoPAGEclass organisationPageClass = new ORGinfoPAGEclass(driver);
			organisationPageClass.newOrgBtn();
			OrganisationDetailsPageClass organisationDetailsPageClass = new OrganisationDetailsPageClass(driver);
			organisationDetailsPageClass.orgPageDetails(orgname1, indType);
	//
//			WebElement orgclick=driver.findElement(By.xpath("//a[text()='Organizations']"));
//			orgclick.click();

//			WebElement createorgclick=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
//			createorgclick.click();
	//
//			WebElement orgname=driver.findElement(By.name("accountname"));
//			orgname.sendKeys(orgname1);
	//
//			WebElement indname=driver.findElement(By.name("industry"));
//			Select select=new Select(indname);
//			System.out.println(select.isMultiple());
//			select.selectByValue("Biotechnology");
	//
//			WebElement savebutton=driver.findElement(By.name("button"));
//			savebutton.click();

			Thread.sleep(3000);

			//		WebElement orgname2=driver.findElement(By.xpath("//a[text()='Testyantra']"));
			//		orgname2.click();
			String orgnametext=driver.findElement(By.className("dvHeaderText")).getText();
			if(orgnametext.contains(orgname1))
			{
				System.out.println("validation successful");
			}
			else
			{
				System.out.println("validation not successful");
			}
			

		}

	}
}
