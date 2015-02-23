package testng;

import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest {

	@BeforeSuite
	public void initializeSelenium(){
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void shutDownSelenium(){
		System.out.println("After suite");
	}
  @Test
  public void testReciveMail() {
	 System.out.println("Code testReciveMail"); 
  }
  
  @Test
  public void testSendMail() {
	 System.out.println("Code testSendMail"); 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }
 
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
	 // throw new SkipException("Skipping test");
	  
  }

}
