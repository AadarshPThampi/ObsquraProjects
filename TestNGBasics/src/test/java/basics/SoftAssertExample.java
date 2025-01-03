package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertExample {
	SoftAssert softassert=new SoftAssert();
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();	//web driver manager used for chrome driver
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
	}	
	
	
	@Test
	public void verifyButtonTextANDisEnabled()
	{
		WebElement button=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
		String actualButtonText=button.getText();
		String expectedButtonText="Show Selected Value";
		
		WebElement maleButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean actualStatus = maleButton.isEnabled();
		
		//softassert used for multiple assertions in single test case.
		softassert.assertEquals(actualButtonText, expectedButtonText); //1st assert
		
		softassert.assertTrue(actualStatus);	//2nd assert
		
		softassert.assertAll();//mandatory method to report any test case failure in the report. 
		//If not given, then even if test fails, then no failure will be shown in report.
	}

	
}
