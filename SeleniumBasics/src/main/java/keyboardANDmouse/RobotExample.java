package keyboardANDmouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExample {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN); //presses the page down button once.
		
		robot.keyRelease(KeyEvent.VK_DOWN); //releases the page down button.
		

	}

}
