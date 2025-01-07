package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public WebDriver driver;	

@BeforeMethod
public void launchObsquraBrowser()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/index.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}



}
