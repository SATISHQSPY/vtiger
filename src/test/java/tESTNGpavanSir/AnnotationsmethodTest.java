package tESTNGpavanSir;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsmethodTest 
{
	@Test
	public void sathish()
	{
		System.out.println("FINAL OUTPUT MAIN_TEST");
	}
	
	@org.testng.annotations.BeforeSuite
	 public void BeforeSuite() {
		  System.out.println("BEFORE SUITE");
	  }
	  
	  @AfterSuite
	  public void aftersuite() {
		  System.out.println("AFTER SUITE");
	  }
	  
	  
	  @BeforeTest
	  public void beforetest() {
		  System.out.println("BEFORE TEST");
	  }
	  
	  @AfterTest
	  public void aftertest() {
		  System.out.println("AFTER TEST");
	  }
	  
	 @BeforeClass
public void beforeclass(){
		System.out.println("BEFORE CLASS");  
	  }
	  
	  @AfterClass
	  public void afterclass() {
		  System.out.println("AFTER CLASS");
	  }
	  
	  @BeforeMethod
	  public void beforemethod() {
		  System.out.println("BEFORE METHOD");
	  }
	 
	  @AfterMethod
	  public void aftermethod() {
		  System.out.println("AFTER METHOD");
	  }
	  


}
