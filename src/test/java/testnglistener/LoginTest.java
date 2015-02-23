package testnglistener;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class LoginTest {
	
	@Test(priority=1)
	public void login(){
		System.out.println("start");
		try{
		AssertJUnit.assertEquals("A", "B");
		}catch(Throwable t){
			System.out.println("error");
		}
		System.out.println("stop");
	}
	

	@Test(priority=2)
	public void loginAdmin(){
		AssertJUnit.assertEquals("A", "A");
	}
}
