package basics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //opens chrome browser
		
		driver.get("https://www.amazon.in/"); //launch fresh browser
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
				
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is: "+url);
		
		driver.get(url); //same as refresh using navigate
		
		driver.quit(); //closes entire session
		
	}

}
