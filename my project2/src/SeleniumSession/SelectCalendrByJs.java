package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendrByJs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bujjisowji\\eclipse-workspace\\CollectionSessions\\src\\SeleniumSession\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		driver.get("https://www.spicejet.com/");
	
	WebElement date =  driver.findElement(By.id("ctl00_mainContent_view_date1"));
	
		String dateVal ="13/05/2019";

		selectDateByJs(driver, date, dateVal);
	}
	


		public static void selectDateByJs(WebDriver driver, WebElement element, String dateVal){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0],setAttribute('value', '"+dateVal+"');", element);
			
			
		}
		
		
		
		
		
		
		
		
		
	}


