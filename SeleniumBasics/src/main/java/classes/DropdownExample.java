package classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://www.amazon.in/");
		
		WebElement allDropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//aggregation using the select class
		Select select = new Select(allDropdown); //parameterized constructor uses the web element
		
		select.selectByIndex(3);//selects the 4th option based on index value(Index starts with 0)
		
		select.selectByValue("search-alias=freshmeat");//content of value attribute used to select drop down
		
		select.selectByVisibleText("Collectibles");//selects drop down based on visible text
		
		List<WebElement> options = select.getOptions(); //lists all options in dropdown as WebElements
		
		for(WebElement a: options)
		{
			System.out.println(a.getText());	// prints the text in all the dropdown options one by one
		}
	}
	
}
