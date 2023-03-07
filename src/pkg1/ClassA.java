package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement emailId = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		emailId.sendKeys("sagarpatil278@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		password.sendKeys("Sagar278@");
		
		// emailId.clear();
		
		WebElement loginbtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		loginbtn.click();
		
	//	Thread.sleep(3000);
			
	//	System.out.println(loginbtn.getText());
		
		WebElement loginbtnonHomescreen = driver.findElement(By.xpath("//a[text()='Login']"));
		
//	try {	
//		WebElement loginbtnonHomescreen = driver.findElement(By.xpath("//a[text()='Login']"));
//	}catch(Exception e)
//	{
//		System.out.println("User logged in Succesfully");
//	}
		
		
	}

}
