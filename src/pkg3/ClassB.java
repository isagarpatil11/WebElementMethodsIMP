package pkg3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
        System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
        Thread.sleep(2000);
		
	     WebElement emailId = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		    
		 emailId.sendKeys("sagarpatil278@gmail.com");
		    
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		    
		 password.sendKeys("Sagar278@");
		    
	     WebElement loginBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		    
		 loginBtn.click();
		    
	     driver.manage().window().maximize(); 
		    
	     Thread.sleep(4000);
		    
	     WebElement searchField = driver.findElement(By.xpath("//input[@type='text']"));
	     
	     WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
	     
	     FileInputStream file = new FileInputStream("C:\\Users\\dell\\Desktop\\Test Cases\\ApacheExcel.xlsx");
	   
	     Thread.sleep(4000);
	     
	     Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
	     
	     for(int i=0; i<=4; i++)
      {      String data;
	    	 
	    	 try {
	    		 data = sheet.getRow(i).getCell(0).getStringCellValue();
	    	 }catch(Exception e){
	    		data = String.valueOf(sheet.getRow(i).getCell(0).getNumericCellValue());
	    	 }
	    
	     
	     searchField.sendKeys(data);   
	     searchButton.click();
	     
	     Thread.sleep(4000);
	     
	     for(int j=0; j<data.length(); j++)
	     {
	    	 searchField.sendKeys(Keys.BACK_SPACE);
	     }
	     for(int k=0; k<4; k++)
	     {
	    	 
	     }
	  } 
	     
	     
	
	
	}

}
