package pkg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
//Child Browser Popup
		
		//driver.switchTo().window("Address of window");
		
		//1) getWindowHandle();--> String
		
	    String mainPageAddress = driver.getWindowHandle();
	    
	    System.out.println(mainPageAddress);
	    
	    driver.switchTo().window(mainPageAddress);
	    
	    System.out.println(driver.getTitle());
	    
	    //Login
	    
	    WebElement emailId = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    
	    emailId.sendKeys("sagarpatil278@gmail.com");
	    
	    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	    
	    password.sendKeys("Sagar278@");
	    
	    WebElement loginBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	    
	    loginBtn.click();
	    
	    Thread.sleep(3000);
	    
	    //Product Search
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Realme");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    Thread.sleep(7000);
	    
	    List<WebElement> mobileList = driver.findElements(By.xpath("//a[@class='_1fQZEK']"));
	    
	    for(int i=0; i<3; i++)
	    {
	    	mobileList.get(i).click();
	    }
	    
	    //2) getWindowHandles() -->Set Of String
	    
	    Set<String> addresses = driver.getWindowHandles();
	    
	    for(String k: addresses)
	    {
	    	System.out.println(k);
	    	driver.switchTo().window(k);
	    	try
	    	{driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	    	}catch(Exception e)
	    	{}
	    	Thread.sleep(3000);
	    	
	     }
	    
	    //Converting set to list
	    
//	    List<String> addresses1 = new ArrayList<>(addresses);
//	    driver.switchTo().window(addresses1.get(2));
//	    driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
//	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}	
	}


