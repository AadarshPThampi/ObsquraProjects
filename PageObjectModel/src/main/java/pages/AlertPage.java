package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

WebDriver driver;

@FindBy(xpath = "//a[@id='alert-modal']")						//declaring WebElements using @Findby
WebElement alertPageLink;

@FindBy(xpath = "//button[@id='autoclosable-btn-success']")
WebElement autoSuccessButton;

public AlertPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);		//used to initialize all the WebElements located by @findby annotation
}
	

public void clickOnAlertLink()
{
	alertPageLink.click();
}

public boolean isAutoSuccessButtonEnabled()
{
	return autoSuccessButton.isEnabled();
}
	
}
