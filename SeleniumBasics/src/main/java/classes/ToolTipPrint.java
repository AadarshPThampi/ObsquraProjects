package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipPrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://demo.guru99.com/test/social-icon.html");
		
		WebElement messageIcon = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		
		String messageIconTitle=messageIcon.getAttribute("title");//gets the attribute value of title attribute
		System.out.println("Message icon title is: "+messageIconTitle);// title attribute value is tool tip value
		
		String messageIconHref=messageIcon.getAttribute("href");//gets the value of href attribute
		System.out.println("Message icon href is: "+messageIconHref);
		
		String messageIconTagName=messageIcon.getTagName();//gets the tag name of the web element
		System.out.println("Tag name of message icon is: "+messageIconTagName);
		
		
		driver.get("https://www.amazon.in/");
		
		WebElement allDropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		String allDropdownToolTip=allDropdown.getAttribute("title"); //gets the tool tip value during mouse hover
																	// title attribute value is tool tip value
		System.out.println("Tooltip value of Amazon all dropdown is: "+allDropdownToolTip);
		
		
	}

}
