package day14_06_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://portal.chicmicstudios.in/auth/login");
		
		
		WebElement login = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='timedragon_id_1859']")));
		login.sendKeys("CMS/2025/734");
		
		WebElement Password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='timedragon_id_1867']")));
		Password.sendKeys("CMS/2025/734");
		
		driver.findElement(By.xpath("//button[@id='timedragon_id_1874")).click();
		
		
		
		
		

	}


	}


