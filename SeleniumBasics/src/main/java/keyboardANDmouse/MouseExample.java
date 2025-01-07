package keyboardANDmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Login']"));
		WebElement cart = driver.findElement(By.xpath("//a[text()='Cart']"));
		
		
		Actions actions=new Actions(driver);//Action class is used to control mouse actions
		actions.moveToElement(loginButton).build().perform();//places mouse cursor over the login button
//		actions.click().build().perform();//clicks on login button since mouse is moved to that location now.
		
//		actions.click().build().perform();//clicks on where the mouse is at the moment.
		
		actions.click(cart).build().perform();//clicks on the cart web element
		
	}

}
