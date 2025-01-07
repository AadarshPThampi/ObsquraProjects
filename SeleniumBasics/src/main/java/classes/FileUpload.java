package classes;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement chooseFileButton = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		String path= "E:\\OBSQURA\\TestData.xlsx"; //path of desired file to be attached
		
//		chooseFileButton.sendKeys(path); //send keys send the path as parameter
		
		//Alternate method using File class. Using path as argument for constructor
		File file= new File(path);
		chooseFileButton.sendKeys(file.getAbsolutePath());
	}

}
