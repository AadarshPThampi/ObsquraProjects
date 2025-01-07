package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class PracticeFluentWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
	
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofMillis(200))
				.ignoring(Exception.class);
		
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		
		WebElement startButton = driver.findElement(By.xpath("//button[@id='downloadButton']"));
		startButton.click();
		
		//waits for close button to be clickable.
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ui-dialog-buttonset']//button[text()='Close']")));
		
		WebElement closeButton = driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']//button[text()='Close']"));
		closeButton.click();
		
		driver.quit();
	}

}
