package testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class SampleTest {

	
	@Test(priority=1)
	public void testLogin(){
		AssertJUnit.assertEquals("A", "A");
		System.out.println("Login Test");
	}
	
	@Test(priority=2,dependsOnMethods={"testLogin"},dataProviderClass=Data_Provider.class,dataProvider="regDataProvier")
	public void testChangePassword(String name,String pass,String email){
		System.out.println("Change Password Test");
	}
	
	@Test(priority=3,dependsOnMethods={"testChangePassword"})
	public void testLogout(){
		System.out.println("Logout Test");
	}
}


