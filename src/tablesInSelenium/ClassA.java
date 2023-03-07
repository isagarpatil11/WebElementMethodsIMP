package tablesInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		
		driver.manage().window().maximize();
		
		//1) Number of Rows And Columns 
		
		List<WebElement> columns = driver.findElements(By.xpath("//table//thead//tr//th"));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		
		System.out.println("Rows = "+rows.size()+" Columns = "+columns.size());
		
		//2) Get details from Company Name
		  //a)
		
		String cName = "IDFC L";
		for(int i=1; i<=rows.size(); i++)
		{
			String cNameFromUI = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td/a")).getText().trim();
		    System.out.println(cNameFromUI);
		
		if(cName.equals(cNameFromUI))
		 {
			String CDetails = driver.findElement(By.xpath("//table/tbody/tr["+i+"]")).getText();
			System.out.println(CDetails);
			break;
		 }
		}
		
		   //b)
		System.out.println("======================================================================");
		
		try
		{
			String cDetails = driver.findElement(By.xpath("(//table/tbody/tr//td/a[contains(text(),'IDFC L')]/parent::td)[1]//following-sibling::a")).getText().trim();
		 System.out.println(cDetails);
		}catch(Exception e)
		{
			System.out.println("Company is Not Listed");
		}
		
		System.out.println("===============================================================");
		//3) Getting company name from detais 
		
		String columnName = "% Change";
		String value = "+ 7.8";
		
		for(int i=1; i<=columns.size(); i++)
		{
			String columnNameFromUI = driver.findElement(By.xpath("//table//thead//tr//th["+i+"]")).getText().trim();
			if(columnNameFromUI.equals(columnName))
			{
				System.out.println(columnName);
				for(int j=1; j<=rows.size(); j++)
				{
					String companyPercentage = driver.findElement(By.xpath("(//table//tbody//tr//td["+i+"])["+j+"]")).getText().trim();
					System.out.println(companyPercentage);
					if(companyPercentage.equals(value))
					{
						System.out.println(j);
						String cNameFromUI = driver.findElement(By.xpath("//table/tbody/tr["+j+"]/td/a")).getText().trim();
						System.out.println(cNameFromUI);
					}
				}
			}
			
			
			
			
			
		}
		
		
	}

}
