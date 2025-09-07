package handle_Dropdown_23_8_25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dropdowns {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select countryname = new Select(country);
		
		// 1- Select from Dropdown
		
		countryname.selectByContainsVisibleText("India");
		
		//change the value of the dropdown by opening the dropdown again
		
		
		Select Countryname = new Select(country);
		Countryname.selectByContainsVisibleText("United States");
		
		
		//next is selecting a country by value rather than visible text
		
		//how to calculate number of options in the dropdown 
		
		   List<WebElement>  Size = Countryname.getOptions();
		   System.out.println("So this is the total number of values: " +Size.size());
		   
		  /*for (int i=0;i<Size.size();i++)
			  
		  {
			  System.out.println(Size.get(i).getText());
		  }*/
		   
		  //Enhanced For Loop
		  
		  for (WebElement si:Size)
		  {
			  System.out.println(si.getText());
		  }
		  
		   
		
		
		
		
		
		
	}

}
