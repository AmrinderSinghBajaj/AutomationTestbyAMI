package day05_05_2025;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/* 
 * 1- launch chrome
 * 2- open url 
 * 3-validate the title 
 * 4- close browser
 */

public class Testcase1 {

	public static void main(String[] args) {

		//launch browesr (chrome)
		
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		
		//Open URL 
		
		driver.get("https://www.opencart.com/");
		
		//validate the title 
		
	
		String act_title = driver.getTitle();
		
		if (act_title.equals("OpenCart - Open Source Shopping Cart Solution"))
		
		{
			System.out.println("test Passed");
			
		}
		
		else
		{
			System.out.println("Test failed");
		}
		
		//Close Browser
		driver.close();

	}

}
