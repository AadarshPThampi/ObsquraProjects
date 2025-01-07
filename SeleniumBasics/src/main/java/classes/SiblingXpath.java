package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		
		//used preceding-sibling:: in XPath to locate the check box one which is the preceding sibling of label having text- One
		WebElement checkBox1 = driver.findElement(By.xpath("//label[contains(text(),'One')]//preceding-sibling::input[@type='checkbox']"));
		checkBox1.click();
		
		//used the folowing-sibling:: in XPath to locate the label which is the following sibling of check box one.
		WebElement checkbox1Content = driver.findElement(By.xpath("//input[@id='check-box-one']//following-sibling::label[contains(text(),'One')]"));
		System.out.println(checkbox1Content.getText()+" Clicked");
				
		//used preceding-sibling:: in XPath to locate the check box three which is the preceding sibling of label having text- Three
		WebElement checkBox3 = driver.findElement(By.xpath("//label[contains(text(),'Three')]//preceding-sibling::input[@type='checkbox']"));
		checkBox3.click();
		
		//used the folowing-sibling:: in XPath to locate the label which is the following sibling of check box Three.
		WebElement checkbox3Content = driver.findElement(By.xpath("//input[@id='check-box-three']//following-sibling::label[contains(text(),'Three')]"));
		System.out.println(checkbox3Content.getText()+" Clicked");
		
	}

}
