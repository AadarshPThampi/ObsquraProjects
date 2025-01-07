package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		
		WebElement normalSuccessBox = driver.findElement(By.xpath("//button[contains(text(),'Normal success')]"));
		
		int xCoordinate=normalSuccessBox.getLocation().getX();//returns the x-coordinate value as an integer
		
		int yCoordinate=normalSuccessBox.getLocation().getY();//returns the y-coordinate value as an integer
		
		System.out.println("The coordinates are: "+xCoordinate+", "+yCoordinate);
	}

}
