package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.navigate().to("https://www.facebook.com/");	//History Saved
		
		WebElement forgotPassword=driver.findElement(By.partialLinkText("Forgot"));//given the partial name(case sensitive) of the hyperlink 
		forgotPassword.click();

	}

}
