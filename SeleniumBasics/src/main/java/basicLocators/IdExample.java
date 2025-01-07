package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.navigate().to("https://www.facebook.com/");	//History Saved
		
		WebElement emailField=driver.findElement(By.id("email"));	//finding webelement by using id
		
		emailField.sendKeys("user");	//used to send data
		
		WebElement passwordField=driver.findElement(By.name("pass"));	//finding webelement by using name
		passwordField.sendKeys("password");
		
		WebElement loginButton=driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		loginButton.click();	//class name starting with "_" will not be accepted by selenium.
		
		
	}

}
