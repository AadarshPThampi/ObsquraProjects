package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement showMessageButton = driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		String classAttribValue = showMessageButton.getAttribute("class");//gets the value of attribute class
		
		System.out.println(classAttribValue);
		
		String notFoundAttribValue = showMessageButton.getAttribute("name");// there is no such attribute in webelement
		
		System.out.println(notFoundAttribValue); //no error will be shown. but will print/give a blank value
		
		String idAttribValue = showMessageButton.getAttribute("id");//get the value of attribute id
		
		System.out.println(idAttribValue);
	
				
	}

}
