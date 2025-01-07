package classes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement newTabButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		newTabButton.click(); //this click launches new tab in the browser
				
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		Iterator<String> iterate=windowHandles.iterator();
		
		while(iterate.hasNext())
		{
			String windowId=iterate.next();
			if(!parentWindow.equals(windowId))	//not matching cases
			{
				driver.switchTo().window(windowId);
				break;
			}
		}
		
		WebElement autocomplete = driver.findElement(By.xpath("(//a[contains(text(),'Autocomplete')])[2]"));
		autocomplete.click();
		
		driver.close();	//closing child window does not give control to parent window
		
		driver.switchTo().window(parentWindow);	//to get control back to parent window
	}

}
