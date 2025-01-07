package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExerise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		
		WebElement startButton = driver.findElement(By.xpath("//button[@id='downloadButton']"));
		startButton.click();
		
		//waits for the xpath of complete! web element to become visible in the web page.
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'Complete')]")));
		
		//waits for the cancel button to become invisible. (Alternative option for waiting)
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Cancel')]")));
		WebElement result = driver.findElement(By.xpath("//div[contains(text(),'Complete')]"));
		
		System.out.println(result.getText());
	}

}
