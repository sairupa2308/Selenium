package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/SeleniumSession/chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("sam");
		driver.findElement(By.id("txtPassword")).sendKeys("rupa");
		driver.findElement(By.id("btnLogin")).click();
		
	}


}
