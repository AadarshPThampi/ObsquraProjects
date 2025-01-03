package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonTest {
WebDriver driver;
	
@BeforeMethod
public void launchBrowser()
{
	WebDriverManager.chromedriver().setup();	//web driver manager used for chrome driver
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/radio-button-demo.php");
}

@Test(priority=-2)
public void verifyButtonText()
{
	WebElement button=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
	String actualButtonText=button.getText();
	
	String expectedButtonText="Show Selected Value";
	
	Assert.assertEquals(actualButtonText, expectedButtonText);
	System.out.println("SAMPLE TEXT");
}

@Test(priority=2,invocationCount=2)
public void verifyMaleButtonIsEnabled()
{
	WebElement maleButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	boolean actualStatus = maleButton.isEnabled();
		
//	Assert.assertEquals(actualStatus, true);
	
	Assert.assertTrue(actualStatus);	//Expects true by default
	
}

@Test(priority=1,enabled=false)
public void verifyButtonBackgroundCOlor()
{
	WebElement button=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
	String actualColor = button.getCssValue("background-color");
	System.out.println(actualColor);
	String expectedColor="rgba(0, 123, 255, 0)";
	Assert.assertEquals(actualColor, expectedColor,"Custom Failure Message by User");//shows custom message in report on failure
}

}
