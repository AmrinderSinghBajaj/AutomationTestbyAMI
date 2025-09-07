package day26_05_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		  
		 WebElement image = driver.findElement(By.xpath("//img[@alt=nopCommerce demo store"));
		 System.out.println("display status of logo" + image.isDisplayed());
		 
		 driver.quit();
	}

}
