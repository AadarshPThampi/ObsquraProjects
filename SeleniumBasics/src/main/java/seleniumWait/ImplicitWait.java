package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		//wait for max 10 sec or until expected webelement found
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Applicable to all web elements.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12)); //latest time will be considered.
		
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
		
		startButton.click();	
		WebElement result = driver.findElement(By.xpath("//h4[contains(text(),'World')]"));
		String resultText=result.getText();
		System.out.println(resultText);

	}

}
