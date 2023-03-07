package pkg1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassG {

	public static void main(String[] args) throws InterruptedException {
	
	//Drag & Drop	
		
		System.setProperty("webdriver.chrome.driver","D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		
		Actions act = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("(//ul[@id='gallery']//li)[1]"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
		
		act.dragAndDrop(drag, drop).perform();
		
	

}
}