package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickersPage {

WebDriver driver;

@FindBy(xpath = "(//a[@class='nav-link'])[3]")			//declaring webelement using @findby
WebElement datePickersLink;

@FindBy(xpath = "//button[@id='button-one']")
WebElement showDateButton;

public DatePickersPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);		//used to initialize all the WebElements located by @findby annotation
}
	
public void clickOnDatePickers()
{
	datePickersLink.click();
}

public boolean isShowDateButtonDisplayed()
{
	return showDateButton.isDisplayed();
}
}
