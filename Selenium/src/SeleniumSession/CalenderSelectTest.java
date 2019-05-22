package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bujjisowji\\eclipse-workspace\\CollectionSessions\\src\\SeleniumSession\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		driver.findElement(By.xpath("//a[@class=\"btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left\"]")).click();
		
		driver.findElement(By.name("email")).sendKeys("sairupa2308@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Rupa1234@");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		//driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//span[text()='Calendar']")).click();
		
		String date = "18-february-2019";
		String dateArr[]= date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		
		driver.findElement(By.xpath("//span[text()='Week']")).click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
