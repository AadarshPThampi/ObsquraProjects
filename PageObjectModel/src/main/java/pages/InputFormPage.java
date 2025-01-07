package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {

WebDriver driver;	
By InputFormLink = By.xpath("(//a[@class='nav-link'])[2]");
By showButton = By.xpath("//button[@id='button-one']");
By MessageBox=By.xpath("//input[@id='single-input-field']");
By ReturnMessageBox = By.xpath("//div[@id='message-one']");

String testMessage= "Test Message";

public InputFormPage(WebDriver driver)
{
	this.driver=driver;
}
	
	
public void clickInputFormLink()
{
	WebElement inputForm =driver.findElement(InputFormLink);
	inputForm.click();
}
	
public String getButtonName()
{
	WebElement button = driver.findElement(showButton);
	return button.getText();
}

public void enterMessage()
{
	WebElement messageFiled=driver.findElement(MessageBox);
	messageFiled.sendKeys(testMessage);
}
	
public void clickShowMessageButton()
{
	WebElement button = driver.findElement(showButton);
	button.click();
}

public String getResultMessage()
{
	WebElement returnMessage = driver.findElement(ReturnMessageBox);
	return returnMessage.getText();
}
}
