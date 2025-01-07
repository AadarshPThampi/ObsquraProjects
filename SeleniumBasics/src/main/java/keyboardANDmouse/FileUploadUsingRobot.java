package keyboardANDmouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobot {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement chooseFileButton = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		String path= "E:\\OBSQURA\\TestData.xlsx"; //path of desired file to be attached
		
		Robot robot = new Robot();
		
		Actions actions = new Actions(driver);
		
		StringSelection ss = new StringSelection(path); //convert the path as object of string selection class
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//equivalent to CTRL+C
		
		actions.click(chooseFileButton).build().perform();
		
		robot.delay(1000);	//delay for 1 sec. since copy to clipboard might take some time
		
		robot.keyPress(KeyEvent.VK_CONTROL);	//presses control button
		robot.keyPress(KeyEvent.VK_V);			//presses V button
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.delay(1000);	//delay for 1 sec.
		robot.keyPress(KeyEvent.VK_ENTER);		//presses Enter key for Uploading
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
