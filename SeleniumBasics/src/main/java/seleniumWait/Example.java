package seleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
		startButton.click();
		
		Thread.sleep(7000);	//Java Wait. code freeze for 7 seconds and then runs. Not used since time is wasted.
		
		WebElement result = driver.findElement(By.xpath("//h4[contains(text(),'World')]"));
		String resultText=result.getText();
		System.out.println(resultText);
		
	}

}
