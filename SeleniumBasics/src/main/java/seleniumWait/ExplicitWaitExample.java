package seleniumWait;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(7));//throws timeout exception
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
		
		//waits for start button to be clickable if it takes time to be enabled.
		wait.until(ExpectedConditions.elementToBeClickable(startButton));
		startButton.click();	
		
		//waits for the xpath of hello world to be visible in the webpage until time specified.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'World')]")));
		WebElement result = driver.findElement(By.xpath("//h4[contains(text(),'World')]"));
		String resultText=result.getText();
		System.out.println(resultText);
	}

}
