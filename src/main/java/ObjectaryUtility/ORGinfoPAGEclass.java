 
 
 
 package ObjectaryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ORGinfoPAGEclass {
@FindBy(className="dvHeaderText")
private WebElement hTEXT;


public ORGinfoPAGEClass(WebDriver driver) {
PageFactory.initElements(driver,this);
}

public String gethTEXT() {
	return hTEXT;
}

public String HEADtf() {
	return.hTEXT();hTEXT.getText()
}
}

