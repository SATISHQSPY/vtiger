package ObjectaryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {

	public WebDriver driver;

	public HomePageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Organizations")
	private WebElement ORGbutton;

	@FindBy(linkText = "Contacts")
	private WebElement CONbutton;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement SignOPTIONadmin;

	@FindBy(linkText = "Sign Out")
	private WebElement SignOUT;

	public WebElement getORGbutton() {
		return ORGbutton;
	}

	public WebElement getCONbutton() {
		return CONbutton;
	}

	public WebElement getSignOPTIONadmin() {
		return SignOPTIONadmin;
	}

	public WebElement getSignOUT() {
		return SignOUT;
	}

	public void MouseOVERaction(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(SignOPTIONadmin).build().perform();
		SignOPTIONadmin.click();
	}

	public WebElement getDocumentsBtn() {
		// TODO Auto-generated method stub
		return null;
	}

	public void actionOnAdmin(WebDriver driver2) {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		action.moveToElement(SignOPTIONadmin).build().perform();
		SignOPTIONadmin.click();
	}

}
