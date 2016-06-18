import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstExampleForWebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver webDriver = new FirefoxDriver();
	//	webDriver= new FirefoxDriver();
	//	System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
	//	WebDriver webDriver= new ChromeDriver();
		
		webDriver.manage().window().maximize();
		
		
		webDriver.get("http://www.lufthansa.com");	
		Thread.sleep(3000);
		WebElement webElement=webDriver.findElement(By.xpath("//a[contains(@href,'Online-Check-in')]/img"));
		webElement.click();

	}

}