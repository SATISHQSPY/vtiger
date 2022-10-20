package ObjectaryUtility;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Genericutility.WebDriverUtility;


public class NewORGPageClass {
	
	WebDriver driver;
	WebDriverUtility webDriverUtility=new WebDriverUtility(driver);
	
	
	
	
@FindAll({@FindBy(name="accountname"),@FindBy(xpath = "//input[@class='detailedViewTextBox']")})
private WebElement ORGnameTF; 

@FindBys({@FindBy(name="button"),@FindBy(xpath = "//input[@type='button']")})
private WebElement SBTN;

@FindBy(name="industry")
private WebElement IndDD;

public NewORGPageClass(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getORGnameTF() {
	return ORGnameTF;
}

public WebElement getSBTN() {
	return SBTN;
}

public WebElement getIndDD() {
	return IndDD;
}

public void ORGnameTF(String ORGtext) {
	ORGnameTF.sendKeys(ORGtext);
}

public void IndustryDD(String value) {
webDriverUtility.SelectBYvalue(IndDD, value);
}
public void SBTN() {
	SBTN.click();
}
	
}
