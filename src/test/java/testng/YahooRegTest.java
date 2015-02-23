package testng;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegTest {

	@Test(dataProvider = "registerData")
	public void testRegister(String username, String password, String email,
			String city) {

		try {
			System.out.println(username + " " + password + " " + email + " "
					+ city);
			

			Assert.assertTrue(9 < 1);
			System.out.println("After assertion error");
		} catch (Throwable t) {
			System.out.println("Catch the error");
		}
		AssertJUnit.assertEquals("Good", "Good");

	}

	@DataProvider
	public Object[][] registerData() {
		Object[][] data = new Object[3][4];
		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[0][2] = "email1";
		data[0][3] = "city1";

		data[1][0] = "user2";
		data[1][1] = "pass2";
		data[1][2] = "email2";
		data[1][3] = "city2";

		data[2][0] = "user3";
		data[2][1] = "pass3";
		data[2][2] = "email3";
		data[2][3] = "city3";

		return data;
	}

}
