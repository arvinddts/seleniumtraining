import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VisibilityExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
		WebDriver webDriver= new ChromeDriver();		 
		webDriver.get("http://www.lufthansa.com");
		Thread.sleep(5000);
		WebElement webElement=webDriver.findElement(By.xpath("//div[@id='pers_m']/descendant::a[contains(text(),'Flight status')]"));
		Actions action = new Actions(webDriver);
		action.moveToElement(webElement).build().perform();
		action.click().perform();

	}

}
