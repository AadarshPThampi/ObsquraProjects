package classes;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
		WebElement confirmButton = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
		WebElement promptButton = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		
		alertButton.click();
		String alertText1 = driver.switchTo().alert().getText();
		System.out.println(alertText1);
		driver.switchTo().alert().accept(); //clicks the ok button on alert
		
		confirmButton.click();
		String alertText2 = driver.switchTo().alert().getText();
		System.out.println(alertText2);
		driver.switchTo().alert().dismiss(); //clicks the cancels button on alert
		
		promptButton.click();
		String alertText3 = driver.switchTo().alert().getText();
		System.out.println(alertText3);
		driver.switchTo().alert().sendKeys("Testing");	//sends string data to the alert input box
		driver.switchTo().alert().accept();
		
		
	}

}
