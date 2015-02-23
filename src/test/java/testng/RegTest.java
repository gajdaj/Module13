package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegTest {

	@Test(dataProviderClass=Data_Provider.class,dataProvider="regDataProvier")
	public void doRegister(String username,String password,String email){
		System.out.println(username+""+password+""+email);
	}
	/*
	@DataProvider
	public static Object[][] getData(){
		Object data[][] = new Object[2][3];
		
		data[0][0]="UI";
		data[0][1]="PI";
		data[0][2]="xyz@gmail.com";
		
		data[1][0]="UI2";
		data[1][1]="PI2";
		data[1][2]="xyz222@gmail.com";
		
		return data;
	}
	*/
}
