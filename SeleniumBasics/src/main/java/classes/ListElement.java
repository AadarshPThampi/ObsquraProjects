package classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://selenium.qabible.in/");
		
		//returns 8 web elements from the xpath saved as List
		//XPath lists all the 8 web elements of childs having tag a, whose parent is having tag ul
		List<WebElement> menuItems= driver.findElements(By.xpath("//ul[@class='navbar-nav']//a"));
		System.out.println("Number of menu items: "+menuItems.size());
		
		System.out.println("The menu items are: ");
		
		for(int i=0;i<menuItems.size();i++)
		{
			System.out.println(menuItems.get(i).getText());//get(i) returns web element
		}
		
		System.out.println("The attributes are: ");
		for(WebElement a:menuItems)
		{
			System.out.println(a.getAttribute("href"));
		}
	}

}
