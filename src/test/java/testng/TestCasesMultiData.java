package testng;

import org.testng.annotations.Test;

public class TestCasesMultiData {
	
	
	
	@Test(priority=1,dataProviderClass=DataProv.class,dataProvider="dataProvider")
	public void test1(String imie,String nazwisko,String email){
		System.out.println("Test 1");
		System.out.println("Imie:"+imie);
		System.out.println("Nazwisko:"+nazwisko);
		System.out.println("Email:"+email);
	}
	
	@Test(priority=2,dataProviderClass=DataProv.class,dataProvider="dataProvider") 
	public void test2(String imie,String nazwisko,String email){
		System.out.println("Test 2");
		System.out.println("Imie:"+imie);
		System.out.println("Nazwisko:"+nazwisko);
		System.out.println("Email:"+email);
	}
	
	@Test(dependsOnMethods={"test1"},priority=3,dataProviderClass=DataProv.class,dataProvider="dataProvider")
	public void test3(String imie,String nazwisko,String email){
		System.out.println("Test 3");
		System.out.println("Imie:"+imie);
		System.out.println("Nazwisko:"+nazwisko);
		System.out.println("Email:"+email);
	}
}
