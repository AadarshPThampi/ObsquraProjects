package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");	
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean buttonStatus = maleRadioButton.isSelected();
		System.out.println("Male Button Selected Status: "+buttonStatus);
		if(buttonStatus==false)
		{
		maleRadioButton.click();
		}
		WebElement showButton = driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
		showButton.click();
	}

}
