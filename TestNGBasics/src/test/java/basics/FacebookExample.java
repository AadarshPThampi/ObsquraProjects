package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookExample {

WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();	//web driver manager used for chrome driver
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "FB Login Credentials",dataProviderClass = DataProviders.class)
	public void enterLoginCredentials(String user, String pass)
	{
		WebElement usernameField = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));
		
		usernameField.sendKeys(user);
		passwordField.sendKeys(pass);
	}
	
}
