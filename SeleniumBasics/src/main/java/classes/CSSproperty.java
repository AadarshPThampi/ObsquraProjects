package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSproperty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		
		WebElement normalSuccessBox = driver.findElement(By.xpath("//button[contains(text(),'Normal success')]"));
		
		//gets the css value of bgrnd colour in RGB format
		String normalSUccessBoxBgndColor=normalSuccessBox.getCssValue("background-color");
		System.out.println("Button bgrnd colour is: "+normalSUccessBoxBgndColor);
	
		String	fontCOlour=normalSuccessBox.getCssValue("color");//Gets the CSS value of font color in RGB format
		System.out.println("Font color is: "+fontCOlour);
		
		String	fontSize=normalSuccessBox.getCssValue("font-size");//Gets the CSS value of font size in pixels
		System.out.println("Font size is: "+fontSize);
		
		String	fontStyle=normalSuccessBox.getCssValue("font-style");//Gets the CSS value of font style
		System.out.println("Font style is: "+fontStyle);
	}

}
