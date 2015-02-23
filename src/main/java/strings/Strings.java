package strings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Strings {
	public static void main(String[] args) throws FileNotFoundException {
		String text = "There is a good staff";
		System.out.println("Char at 5:"+text.charAt(3));
		System.out.println("is index:"+text.indexOf("is"));
		String temp[] = text.split(" ");
		for(String x:temp){
			System.out.println(x);
		}
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\jakub\\workspace2\\Selenium_Test\\src\\main\\java\\strings\\tool.propertis");
		try {
			prop.load(file);
			System.out.println(prop.getProperty("Imie"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
