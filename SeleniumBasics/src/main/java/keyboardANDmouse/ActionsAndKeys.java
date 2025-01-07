package keyboardANDmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
//		searchBox.sendKeys("samsung galaxy");
		
		Actions actions = new Actions(driver);//Action class is used to control mouse actions
		
		actions.sendKeys(searchBox,"Samsung").build().perform();//send text to search box using mouse actions
		
		actions.keyDown(Keys.BACK_SPACE).build().perform();//pressing buttons using actions class
		
		actions.clickAndHold(searchBox).build().perform();//mouse click and hold on the search box(cursor won't blink)
		
//		actions.release().build().perform();//mouse click and hold released from the search box

	}

}
