package day26_05_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_ConditionalMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register");
	
	Thread.sleep(2000);
	
	WebElement male =driver.findElement(By.xpath("//input[@id='gender-male']"));
	male.click();
	
	System.out.println("is the male button clicked = "+male.isSelected());
	
	}

}
