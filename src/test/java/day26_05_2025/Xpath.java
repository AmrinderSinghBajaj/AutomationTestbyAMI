package day26_05_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		  
		 WebElement element = driver.findElement(By.xpath("//a[normalize-space()='MacBook']"));
		 element.click();
		 
		 driver.findElement(By.xpath("//a[text()='Apple']")).isDisplayed();
		 System.out.println("very good");
		
		
	
		

	}

}
