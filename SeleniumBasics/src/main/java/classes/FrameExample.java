package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
//		driver.switchTo().frame(1); //actual search is 2 of 3. so we give index as 1 to get desired 2nd iframe.
		
//		driver.switchTo().frame("a077aa5e"); 	//using id attribute value of iframe.
		
//		driver.switchTo().frame("a077aa5e");	//using name attribute value of iframe.
		
		//using web element of iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
				
		WebElement image = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		System.out.println(image.isDisplayed());
		
		driver.switchTo().defaultContent(); //return from iframe to webpage

		driver.close();	
	}

}
