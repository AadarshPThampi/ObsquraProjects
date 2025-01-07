package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
				
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		boolean checkBox1Status=checkBox1.isSelected(); //return boolean if checkbox1 is selected or not
		System.out.println("Checkbox 1 Status: "+checkBox1Status);
		
		WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		boolean checkBox2Status=checkBox2.isSelected(); //return boolean if checkbox2 is selected or not
		System.out.println("Checkbox 2 Status: "+checkBox2Status);
		
		if(checkBox1Status==false)
		{
			checkBox1.click();
		}
		
		if(checkBox2Status==false)
		{
			checkBox2.click();
		}
		System.out.println("Checkbox1 is present in page: "+checkBox1.isDisplayed());//if not displayed in page, returns false
		
		System.out.println("Checkbox1 is enabled in page: "+checkBox1.isEnabled());	//if not enabled, returns false. checks if box is enabled for click
		
	}

}
