package classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiCheckboxClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		//XPath returns 4 nos of checkboxes which are saved in the List
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='check-box-list']"));
		
		int size=checkboxes.size();
		
/*		for(int i=0;i<size;i++)
		{
			checkboxes.get(i).click(); //click all the 4 check boxes one by one
		}
*/		
		for(WebElement a:checkboxes)	//for each loop
		{
			a.click(); //click all the 4 check boxes one by one
		}

	}

}
