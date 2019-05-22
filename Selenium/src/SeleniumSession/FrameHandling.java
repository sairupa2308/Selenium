package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bujjisowji\\eclipse-workspace\\Selenium\\src\\SeleniumSession\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.crmpro.com/index.html");

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		
		
		

	}

}
