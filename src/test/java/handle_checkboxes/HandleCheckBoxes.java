package handle_checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		/*     **1** Selection of checkbox
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='saturday']"));
		System.out.println("whether the button is selected?"+checkbox.isSelected());
		
		checkbox.click();
		
		System.out.println("checkbox is selected or not?"+checkbox.isSelected());
		
		
		*/
		 //  **2**  Count the total number of checkboxes
		
		List<WebElement> totalcheckbox= driver.findElements(By.xpath("//input[@class='form-check-input' and @type ='checkbox']"));
		
		//to count the total number of checkboxes
		System.out.println("this is the total number of checkboxes present = "+totalcheckbox.size());
		
		/*to select each checkbox
		for(int i=0;i<totalcheckbox.size();i++)
		
		{
		totalcheckbox.get(i).click();	
		}
		
		//different type of loop (enhanced Loop)
		
		 we basically store the value in variable and then use a loop to click again and again
		 */
		
		//Enhanced "for" loop
		
		for ( WebElement check:totalcheckbox)
		{
			check.click();
		}
		
		driver.quit();

	}

}
