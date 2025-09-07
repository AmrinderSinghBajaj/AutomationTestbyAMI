package day5_8_25_Handle_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_windows 
{

	public static void main(String[] args) throws InterruptedException 
	{
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	     driver.manage().window().maximize();
	     
	     
	//1- Normal alert to click on "OK"
	     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	     Thread.sleep(5000);
	     
	     
	     driver.switchTo().alert().accept();
	     
	 //2- Alert for Confirmation alert
	     driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
	     Thread.sleep(5000);
	     
	     driver.switchTo().alert().dismiss();
	     
	 //3 - Alert using the text written
	     
	    WebElement Text = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
	    Text.click();
	    
	    Alert myalert = driver.switchTo().alert();
	    System.out.println("Text message on alert"+ myalert.getText());
	    
	    Text.sendKeys("abc");
	    Thread.sleep(3000);
	    
	    myalert.accept();
	    
	    
	   
	     
	     
	     
	     
	}

}
