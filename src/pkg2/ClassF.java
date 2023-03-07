package pkg2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassF {

	public static void main(String[] args) throws InterruptedException {
		
		//// Authentication Popup

		System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class='D121_options_nav_a'])[4]")).click();
		
		driver.findElement(By.xpath("//div[@id='D121_signupDrop']")).click();
		
	    Thread.sleep(4000);
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='D121_iframe']")));
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'gsi_')]")));
	    
	    driver.findElement(By.xpath("//div[@id='container']")).click();
	    
	    
	    List<String> AutoPopUp = new ArrayList<>(driver.getWindowHandles());
	    
	    driver.switchTo().window(AutoPopUp.get(1));                       //Authentication PopUp
	    
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sagarpatil278@gmail.com");
	    
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    
	    
	    
		
	    
		
	}

}
