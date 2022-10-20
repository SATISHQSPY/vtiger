package ObjectaryUtility;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericutility.WebDriverUtility;

public class NEWcontactpage {

	WebDriver driver;
	public WebDriverUtility webDriverUtility = new WebDriverUtility(driver);

	public NEWcontactpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "salutationtype")
	private WebElement DD;

	@FindBy(name = "firstname")
	private WebElement FirstNameTF;

	@FindBy(name = "lastname")
	private WebElement LastNameTF;

	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement ORGcreateBTN;

	@FindBy(name = "[name='button']")
	private WebElement Save;

	public WebElement getDD() {
		return DD;
	}

	public WebElement getFirstName() {
		return FirstNameTF;
	}

	public WebElement getLastName() {
		return LastNameTF;
	}

	public WebElement getORGcreateBTN() {
		return ORGcreateBTN;
	}

public WebElement getSave() {
	return Save;
	
	public void FirstNameDD(String value) {
		webDriverUtility.SelectBYvalue(FirstNameTF, value);
	}
	public void FirstLastName(String value1,value2){
		FirstNameTF.sendKeys(value1);
		LastNameTF.sendKeys(value2);
	}

public void SaveBTN() {
	Save.click();
}

}

}
