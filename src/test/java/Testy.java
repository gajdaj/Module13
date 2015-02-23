import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class Testy {

	public String text;
	public int numbers;
	
	
	public Testy(String t,int n){
		this.text = t;
		this.numbers = n;
		
	}
	
	
	@Parameters
	public static Collection<Object[]> getData(){
		Object data[][] = new Object[2][2];
		data[0][0]="Hello";
		data[0][1]=1;
		data[1][0]="XXXX";
		data[1][1]=1111234;
		return Arrays.asList(data);
		
	}
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void test1() {
		System.out.println("Uruchamiam z danymi: "+this.numbers +" i "+this.text);
		System.out.println("Test 1");
		try {
			Assert.assertEquals("Hello", this.text);
		} catch (Throwable t) {
			collector.addError(t);
		}
		try {
			Assert.assertTrue("Jest blad", 3 < this.numbers);
		} catch (Throwable t) {
			collector.addError(t);
		}

		Assert.assertEquals("Hello", "Hello");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");

	}

}
