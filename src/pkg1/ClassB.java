package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium\\Drivers\\chromedriver.exe");
     
     WebDriver driver = new ChromeDriver();
     
     driver.get(" https://courses.letskodeit.com/practice");
     
     driver.manage().window().maximize();
     
     //isSelected
     
     WebElement radioButton = driver.findElement(By.xpath("//input[@id='bmwradio']"));
     
     System.out.println(radioButton.isSelected());
		
	 radioButton.click();
	 
	 System.out.println(radioButton.isSelected());
	
	 //isDisplayed
	 
	 WebElement inputBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
	 
	 System.out.println(inputBox.isDisplayed());
	 
	 driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
	 
	 System.out.println(inputBox.isDisplayed());
	 
	 //isEnabled
	 
	 WebElement inputBox1 = driver.findElement(By.xpath("//input[@id='enabled-example-input']"));
	 
	 System.out.println(inputBox1.isEnabled());
	
	 driver.findElement(By.xpath("//input[@id='disabled-button']")).click();
	 
	 System.out.println(inputBox1.isEnabled());
	 
	 //getAttribute
	 
	 System.out.println(inputBox1.getAttribute("class"));
	 
	 
		
     
     
    
	}

}
