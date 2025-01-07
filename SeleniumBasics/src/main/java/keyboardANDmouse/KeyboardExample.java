package keyboardANDmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
//		searchBox.sendKeys("iphone16"+Keys.ENTER);//press enter button
		
		searchBox.sendKeys("samsung galaxy");
		searchBox.sendKeys(Keys.BACK_SPACE);//deletes one last letter. This presses backspace once.
		
//		searchBox.sendKeys(Keys.chord(Keys.CONTROL,"A"));//selects the whole text in the search box.
		
		searchBox.sendKeys(Keys.chord(Keys.CONTROL,"a"));//both a and A works the same.
		
		}

}
