import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class TestFlipkart {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/arvind/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

		 	 	 	 
		 	 
			driver.get("http://www.flipkart.com");
	 		driver.manage().window().maximize();
			Thread.sleep(5000);
			WebElement e = driver.findElement(By.cssSelector("#fk-mainfooter-id a[href*='payments']"));
			Actions actions = new Actions(driver);			
			actions.moveToElement(e);
			actions.perform(); 
		}
	}
	

