package Genericutility;

import java.time.Duration;
import java.util.Set;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.Variable;

public class WebDriverUtility {

	WebDriver driver;
	
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	/**
	 * THIS METHOD IS USED TO MAXIMIZE THE WINDOW
	 * @author XYZ
	 */

	public void Maximize() {
		driver.manage().window().maximize();

}
	/*
	 * This method is used to WAIT FOR LOAD PAGE
	 * @author XYZ
	 */
public void implicitywait() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

/*
 * This method used to SELECT BY INDEX
 * @author ABC
 * @param ele
 * @param num
 */
public void selectBYindex(WebElement ele,int num){
	Select select= new Select(ele);	
	select.selectByIndex(num);
}

/*
 * This method is used to SELECT BY VISIBLETEXT
 * @author JKL
 * @param ele
 * @param Text
 */
public void SelectBYVisibleText(WebElement ele,String Text){
Select select=	new Select(ele);
select.selectByVisibleText(Text);
}

/*
 * This method is used to  SELECT BY VALUE
 * @author LMN
 * @param ele
 * @param value
 */
public void SelectBYvalue(WebElement ele,String value) {
Select select =	new Select(ele);
select.selectByValue(value);
}

/*
 * This method is used to GET PARENT___WINDOW___HANDLE
 * @author EFG
 * @return
 */
public String GetParentHandle() {
String parentHandle=driver.getWindowHandle();
System.out.println(parentHandle);
return parentHandle;
}

/*
 * This method is used to GET ALL___WINDOW___HANDLE
 * @author TUV
 * @param pHandle
 */

public void AllwinHandle(String ParentHAND) {
Set<String> allWinHandles=	driver.getWindowHandles();
System.out.println("All window Handles are:");
for (String AllWindow:AllWindow) {
	System.out.println(AllWindow);
if (!ParentHAND:AllWindow) {
	driver.switchTo().window(AllWindow);
	break;
	
}
else {
		driver.switchTo().window(ParentHAND);
	 }
}
}



/*
 * This method is used to DO MOUSE OVER ACTION
 * @author HIJ
 * @param varible
*/

public void MouseOVERaction(WebElement variable) {
	Actions action = new Actions(driver);
	action.moveToElement(variable).perform();
	
	/*
	 * This method is used to EXPLCITY__WAIT
	 * @author PQR
	 * param locator
	 */
	public void ExplicityWait(By locator) {
		WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement locatedElement =Wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	locatedElement.click();
	}
}

}