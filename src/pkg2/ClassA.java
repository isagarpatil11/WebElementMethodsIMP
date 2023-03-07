package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
		Dimension p = new Dimension(500,1000);
		
//		driver.manage().window().setSize(p);
//		js.executeScript("window.scrollBy(100,0)");
		
		//scrollup up to particular element
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//h2[text()='No Cost EMI']")));
		//Click on any Button
		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
		js.executeScript("arguments[0].click();",loginBtn);
		
		//Send String in input field
		WebElement emailId = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].value = 'sagarpatil278@gmail.com'",emailId);
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].value = 'Sagar278@'", password);
		 
		
		
		
		
		
		
		
		
		
		
	}

}
