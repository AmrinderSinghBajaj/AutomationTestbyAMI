package window_handles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		
		//create a variable of name window ID which is a string and this has imported all the
		Set<String> windowIDs = driver.getWindowHandles();
		
		
		//approach 1
		
		List<String> windowList = new ArrayList(windowIDs);
		String parentID = windowList.get(0);
		String childID = windowList.get(1);
		
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
			
		
		//switch to parent
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		
	}

}
