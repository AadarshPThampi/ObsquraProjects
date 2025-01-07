package keyboardANDmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		Actions actions = new Actions(driver);//Action class is used to control mouse actions
		
//		actions.contextClick().build().perform(); //normal right click on the web page
		
//		actions.contextClick(rightClickButton).build().perform();//right click on the webelement, passed as parameter
		
		actions.doubleClick().build().perform();//normal double click on the web page
		
		actions.doubleClick(doubleClickButton).build().perform();//double click on the webelement, passed as parameter
	
	}

}
