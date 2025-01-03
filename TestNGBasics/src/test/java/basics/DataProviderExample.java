package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();	//web driver manager used for chrome driver
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}		
	
	@Test(dataProvider = "Electronic Products",dataProviderClass = DataProviders.class)	//Name of data provider to be fetched
	public void enterProductforSearch(String product)	//String passes as argument to method
	{
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
		searchBar.sendKeys(product);
	}
	
}
