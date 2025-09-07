package day05_05_2025;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Practice1st {

	public static void main(String[] args) {
		
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("https://demo.nopcommerce.com/");
		
		Driver.get();
		
		if (Act_title.equals("Welcome to our store"))
		
		{
			System.out.println("test passed");
		}
		
		else 
		{
			System.out.println("test failed");
		}
		

	}

}
