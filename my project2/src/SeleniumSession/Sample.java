package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/SeleniumSession/chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
