package testng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProv {

	@DataProvider(name="sampleProvider")
	public static Object[][] dataProvider(Method m){
		Object data [][] = null;
		if(m.getName().equals("test1")){
			data = new Object[2][3];
			data[0][0] = "Jakub";
			data[0][1] = "Gajda";
			data[0][2] = "jgajda@jitsolutions.pl";
		}else{
			data = new Object[2][3];
			data[0][0] = "Maciej";
			data[0][1] = "Kurdyn";
			data[0][2] = "mkurdyn@jitsolutions.pl";
		}
		return data;
	}
}
