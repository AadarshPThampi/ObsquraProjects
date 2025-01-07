package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledDisabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://formy-project.herokuapp.com/enabled");

		WebElement disabledBox = driver.findElement(By.xpath("//input[@id='disabledInput']"));
		System.out.println("Disabled box is displayed "+disabledBox.isDisplayed());
		System.out.println("Disabled box is enabled: "+disabledBox.isEnabled());
		
		WebElement enabledBox = driver.findElement(By.xpath("//input[@id='input']"));
		System.out.println("Enabled box is displayed "+enabledBox.isDisplayed());
		System.out.println("Enabled box is enabled: "+enabledBox.isEnabled());
		enabledBox.sendKeys("Sample text");
	}

}
