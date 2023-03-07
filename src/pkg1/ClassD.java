package pkg1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ClassD {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

         System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
	     
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get(" https://courses.letskodeit.com/practice");
	     
	     driver.manage().window().maximize();
	     
	     WebElement listBox = driver.findElement(By.xpath("//select[@id='carselect']"));
	     
	     Select s = new Select(listBox);
	     
	     s.selectByValue("honda");
	     
	     System.out.println(s.getFirstSelectedOption().getText());
	     
	     Date date = new Date();
	     
	     SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
	     
	     String currentDate = f.format(date);
	     
		//ScreenShot
	     
	     File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     File dest = new File("D:\\#JAVA#\\Selenium\\ScreenShots\\image"+currentDate+".jpg");
	     
	     FileHandler.copy(source, dest);
	     
	     
	}

}
