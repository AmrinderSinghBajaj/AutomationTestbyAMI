package handle_Dropdown_23_8_25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDropdown 
{public static void main(String[] args) throws InterruptedException 
    {
    WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//user login
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		

    

    driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();

    Thread.sleep(5000);

    List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']"));

    for(WebElement option:options)
    {
        System.out.println(option.getText());
    }

    }

}
 
