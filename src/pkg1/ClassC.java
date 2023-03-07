package pkg1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassC {

	public static void main(String[] args) throws InterruptedException {
		
//DropDown & Listbox
		
		 System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
	     
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get(" https://courses.letskodeit.com/practice");
	     
	     driver.manage().window().maximize();
	     
	     WebElement listBox = driver.findElement(By.xpath("//select[@id='carselect']"));
	     
	     Select s = new Select(listBox);
	     
	     s.selectByIndex(1);
	     Thread.sleep(2000);
	     
	     s.selectByValue("honda");
	     Thread.sleep(2000);
	     
	     s.selectByVisibleText("BMW");
	     
	     System.out.println(s.getFirstSelectedOption().getText());
	     
	     List<WebElement> options = s.getOptions();
	     
	     for(int i=0; i<options.size(); i++)
	     {
	    	 System.out.println(options.get(i).getText());
	     }
	     
//	     List<String> dataFromUI = new ArrayList<String>();
//	     
//	     for(int i=0; i<options.size(); i++)
//	     {
//	    	 dataFromUI.add(options.get(i).getText());
//	     }
	     
	     
	     
		
		
	}

}
