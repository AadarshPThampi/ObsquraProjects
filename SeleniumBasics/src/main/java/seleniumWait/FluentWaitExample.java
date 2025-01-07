package seleniumWait;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		Wait<WebDriver> wait = new FluentWait<>(driver) 
				.withTimeout(Duration.ofSeconds(8)) 
				.pollingEvery(Duration.ofMillis(300)) 
				.ignoring(Exception.class);
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
			
		startButton.click();	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'World')]")));
		WebElement result = driver.findElement(By.xpath("//h4[contains(text(),'World')]"));
		String resultText=result.getText();
		System.out.println(resultText);

	}

}
