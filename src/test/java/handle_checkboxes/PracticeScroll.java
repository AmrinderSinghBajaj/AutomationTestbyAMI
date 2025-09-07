package handle_checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeScroll {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//captured each checkbox
		List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input'and @type ='checkbox']"));
		
		System.out.println("these are the total"+Checkboxes.size());
		
		for (i=0;i<Checkboxes.size();i++) 
		{
		    Checkboxes.get(i).click();
	}

}
