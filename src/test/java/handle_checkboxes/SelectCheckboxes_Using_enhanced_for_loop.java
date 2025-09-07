package handle_checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckboxes_Using_enhanced_for_loop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> totalcheckboxes = driver.findElements(By.xpath("//input[@class='form-check-input'and @type ='checkbox']"));
        System.out.println("this is the total"+totalcheckboxes.size());
        
        for(WebElement checkbox:totalcheckboxes)
        	
        {
        	checkbox.click();
        }
        
		//if you want to select the checkboxes from between 
        
        for (int i=0;i<totalcheckboxes.size();i++)
        	
        {
        	if (i==3 || i==5)
        	{
        		totalcheckboxes.get(i).click();
        	}
        }
        
        	
		
		
	}

}
