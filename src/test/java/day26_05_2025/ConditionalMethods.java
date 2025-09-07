package day26_05_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {

          WebDriver driver = new ChromeDriver();
          driver.get("https://demo.nopcommerce.com/register");
          
          Thread.sleep(2000);
          
          driver.manage().window().maximize();
          
          //isDisplayed
          
          //WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
          //System.out.println("Display status of logo:" +logo.isDisplayed());
          
          //isEnabled
          
          boolean status = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed();
          System.out.println("Enabled status:"+status);
          
          //isSelected
          
         WebElement male =driver.findElement(By.xpath("//input[@id='gender-male']"));
         WebElement female =driver.findElement(By.xpath("//input[@id='gender-female']"));
         
         System.out.println("before selection");
         System.out.println(male.isSelected());
         System.out.println(female.isSelected());
         
         System.out.println("after selection");
         male.click();
         System.out.println(male.isSelected());
         System.out.println(female.isSelected());
         
         
         
         
          
          

	}

}
