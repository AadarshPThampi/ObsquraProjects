package keyboardANDmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//source to be dragged
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		//destination for the dragged element
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions actions = new Actions(driver);//Action class is used to control mouse actions
		
		actions.dragAndDrop(source, destination).build().perform();//drags the source to destination
	}

}
