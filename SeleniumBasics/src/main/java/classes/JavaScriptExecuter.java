package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		//scrolldown page
		JavascriptExecutor js=(JavascriptExecutor) driver;	//casting. Explicit type conversion
		js.executeScript("window.scrollBy(0,600)");//scroll to 600 pixels to bottom from top
		js.executeScript("window.scrollBy(0,0)");//x is horizontal scroll, y is vertical scroll
		
		WebElement careerOption = driver.findElement(By.xpath("//a[text()='Careers']"));
		
		js.executeScript("arguments[0].scrollIntoView();", careerOption);//scrolls until career option is visible
		
		//click using javascript executer
		js.executeScript("arguments[0].click();",careerOption);//clicks on the career option
		
		
	}

}
