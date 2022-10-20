package ObjectaryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ORGpageClass {
@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement CreORG;

public ORGpageClass(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}

public WebElement getCreORG() {
	return CreORG;

}


}

