package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement firstHeading = driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
		String headingString = firstHeading.getText(); //returns Visible text of the web element.
		System.out.println("Button text is: "+headingString);
		
		WebElement checkbox1 = driver.findElement(By.xpath("//label[contains(text(),'One')]"));
		String checkBoxName=checkbox1.getText();//do not return anything if there is no Visible text in web element
		System.out.println("Checkbox1 string is: "+checkBoxName);

	}

}
