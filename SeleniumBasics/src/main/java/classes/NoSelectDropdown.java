package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSelectDropdown {

	public static void main(String[] args) {
		String state="Oregon"; //declaring the item to be searched
		
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://selenium.qabible.in/jquery-select.php");
		//there is no select tab for the below drop down. So we need to click and enter text
		WebElement dropdown = driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[1]"));
		dropdown.click();
	
		//xpath used to get input tag to search for given item
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='search']"));
		searchBox.sendKeys(state);	//variable passed in sendkeys for search input
		
		//used contains XPath to select the drop down and click it
		WebElement oregonOption = driver.findElement(By.xpath("//li[contains(text(),"+state+")]"));//XPath using string concatination
		oregonOption.click();
		
	}

}
