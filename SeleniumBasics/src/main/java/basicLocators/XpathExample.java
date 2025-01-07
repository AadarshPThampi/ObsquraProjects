package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");	//History Saved
		
		//XPath using attribute and its unique value
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Mobiles");
		
		//XPath using //immediate parent//child relation
		WebElement searchButton = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@class='nav-input nav-progressive-attribute']"));
		searchButton.click();
		driver.navigate().back();
		
		//XPath using index number to get the 8-th out of 32 search results
		WebElement electronicsButton = driver.findElement(By.xpath("(//a[@class='nav-a  '])[8]"));
		electronicsButton.click();
		driver.navigate().back();
		
		//XPath using text() method to look for entire visible text
		WebElement freshButon = driver.findElement(By.xpath("//span[text()='Fresh']"));
		freshButon.click();
		driver.navigate().back();
		
		//XPath using contains text() to look for a portion of visible text
		WebElement todaysDealButton = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
		todaysDealButton.click();
		driver.navigate().back();
		
		//XPath using contains attribute to look for a portion of the attribute value
		WebElement amazonPayButton = driver.findElement(By.xpath("//a[contains(@href,'cs_apay')]"));
		amazonPayButton.click();
		driver.navigate().back();
		
		//XPath using starts-with method to look for text value starting with
		WebElement groceryButton = driver.findElement(By.xpath("//a[starts-with(text(),'Grocery')]"));
		groceryButton.click();
		driver.navigate().back();
		
		//XPath using starts-with method to look for attribute value starting with
		WebElement healthButton = driver.findElement(By.xpath("//a[starts-with(@data-csa-c-id,'84ahuj')]"));
		healthButton.click();
		driver.navigate().back();
		
		//driver.quit();
	}

}
