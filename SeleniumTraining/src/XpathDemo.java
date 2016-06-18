import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = new FirefoxDriver();
		webDriver.get("http://www.lufthansa.com");
		Thread.sleep(5000);
		WebElement webElement=webDriver.findElement(By.xpath("//button[contains(@data-airport-atlas,'OriginCode')]"));
		webElement.click();

	}

}
