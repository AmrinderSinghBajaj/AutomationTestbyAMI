package day13_05_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		Thread.sleep(3000);
		
		
		//by css tag+id
		//WebElement electronics = driver.findElement(By.cssSelector("input#small-searchterms"));
		//electronics.sendKeys("iphone");
			
		// by tag+class
		
		/*WebElement electronics = driver.findElement(By.cssSelector("input.search-box-text"));
		
		electronics.sendKeys("iphone");*/
		
		
		//tag attribute = (['value'])
		
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("iphone");
		
		// tag.class[attribute =value]
		
		WebElement search =driver.findElement(By.cssSelector("input.search-box-text[id=small-searchterms]"));
		search.sendKeys("Iphone");
		
		
		
		
		
		
		
		
	}

}
