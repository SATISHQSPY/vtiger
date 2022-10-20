package ObjectaryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGINpageClass {
	

	public LOGINpageClass(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "user_name")
private WebElement UN;

	@FindBy(name="user_password")
	private WebElement PWD;

	@FindBy(id="submitButton")
	private WebElement LoginButton;

	public WebElement getUN() {
		return UN;
	}

	public WebElement getPWD() {
		return PWD;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void LOGIN(String UserNameText,String PasswordText) {
		UN.sendKeys(UserNameText);
		PWD.sendKeys(PasswordText);
		LoginButton.click();
	}
	
	}
	


