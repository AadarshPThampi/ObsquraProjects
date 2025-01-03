package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {

WebDriver driver;	

@BeforeMethod
public void launchBrowser()
{
	WebDriverManager.chromedriver().setup();	//web driver manager used for chrome driver
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
}

@Test
public void verifyFlipkartTitle()
{
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	
	String expectedTitle="Happy New Year";
	Assert.assertEquals(actualTitle, expectedTitle);//Throws exception if failed.

}

@Test(dependsOnMethods="verifyFlipkartTitle")
public void verifyCurrentURL()
{
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://www.flipkart.com/";
	
	Assert.assertEquals(actualURL, expectedURL);
}

}
