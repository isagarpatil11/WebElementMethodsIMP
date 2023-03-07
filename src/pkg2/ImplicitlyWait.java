package pkg2;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
////Synchronization: 
		
        System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize(); 
		
		
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
	    
	    // 1) ImplicitlyWait
	    
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    // 2) ExplicitlyWait
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@Class='_1fQZEK'])[1]")));
	    element.click();
	    
	    
        List<WebElement> mobileList = driver.findElements(By.xpath("//a[@class='_1fQZEK']"));
	    
	    for(int i=0; i<3; i++)
	    {
	    	mobileList.get(i).click();
	    }
    
	    // 3) Fluent Wait
	    
//	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//	                   .withTimeout(Duration.ofSeconds(15))
//	                   .pollingEvery(Duration.ofMillis(100))
//	                   .ignoring(Exception.class);
//	    
//	    WebElement element = wait.until(new Function<WebDriver,WebElement>(){
//	    	public WebElement apply(WebDriver driver)
//	    	{
//	    		return driver.findElement(By.xpath("(//a[@Class='_1fQZEK'])[1]"));
//	    	}
//	    }
//	    		);
//	    element.click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
