package pkg2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//1)Count iframe on Webpage
		List<WebElement> elements = driver.findElements(By.xpath("//iframe"));
		
		int count = driver.findElements(By.xpath("//iframe")).size();
		
		System.out.println("Total no of iframes = "+ count);
		
		//2)Switching To Parent frame
		driver.switchTo().frame("frame1");            //name or Id
		
		WebElement element = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		
		System.out.println(element.getText());
		
		////3)switching to child frame
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@srcdoc,'Child')]")));   //WebElement
		
		WebElement element1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		
		System.out.println(element1.getText());
		
		//4)Move To parent Frame
		driver.switchTo().parentFrame();
		
		WebElement element2 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		
		System.out.println(element2.getText());
		
		//5)move to main frame
		
		driver.switchTo().parentFrame();                                       ////div[@id='framesWrapper']
		
		WebElement element3 = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested')]"));
		
		System.out.println(element3.getText());
		
		//6)move to main frame from child frame
		driver.switchTo().defaultContent();
		
		WebElement element4 = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested')]"));
		
		System.out.println(element4.getText());
		
		//7)After Refreshing we are moving to child frame
		
		refrashPage(driver);
		
		
	}

	private static void refrashPage(WebDriver driver) {
		// TODO Auto-generated method stub
			
		driver.navigate().refresh();
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@srcdoc,'Child')]")));
		
	}

}
