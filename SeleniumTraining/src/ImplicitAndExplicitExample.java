import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitExample {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		WebDriver webDriver= new ChromeDriver();
		webDriver.get("http://www.lufthansa.com/online/portal/lh/in/homepage");
		
		// implicit wait
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		webDriver.manage().window().maximize();			
		webDriver.findElement(By.id("flightmanagerFlightsFormAirportAtlasDestination")).click();
		webDriver.findElement(By.xpath("//button[@aria-label='Close window']")).click();		 
		webDriver.findElement(By.xpath("//label[text()=' India']")).click();
		 
		// explicit wait
 	/*	WebDriverWait wait = new WebDriverWait(webDriver, 50, 1000);		
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		webElement.click();		 */
		
	}

}
