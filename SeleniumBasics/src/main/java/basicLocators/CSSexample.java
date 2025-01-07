package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.navigate().to("https://www.amazon.in/");	//History Saved
		
		//for using id attribute value for locating web element, we use "#" symbol.
		WebElement productSearch=driver.findElement(By.cssSelector("#twotabsearchtextbox")); 
		productSearch.sendKeys("Samsung galaxy s24");
		
		productSearch.clear();
		
		//for using class attribute value for locating web element, we use "." symbol. Spaces also replaced by "." symbol.
		WebElement productSearch2=driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
		productSearch2.sendKeys("iphone 16");
		
		WebElement searchButon=driver.findElement(By.cssSelector("#nav-search-submit-button"));//used id for locating
		searchButon.click();
		
		WebElement dropdown = driver.findElement(By.tagName("select"));	//using tagname. select tag is unique in this amazon webpage
		dropdown.click();
		
	}

}
