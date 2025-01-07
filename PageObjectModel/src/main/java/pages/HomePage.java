package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

WebDriver driver;						//local driver

By logo=By.xpath("(//img[@alt='logo'])[1]");	//global xpath for logo

public HomePage(WebDriver driver)		//parameterized constructor
{
	this.driver=driver;					//equates global driver and parameterized driver 
}

public boolean isLogoDisplayed()
{
	WebElement logoElement=driver.findElement(logo);
	return logoElement.isDisplayed();
}
	
}

