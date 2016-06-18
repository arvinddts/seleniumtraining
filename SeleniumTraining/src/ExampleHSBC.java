import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleHSBC {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		 WebDriver webDriver = new ChromeDriver();
		/* webDriver.get("http://www.hsbc.com");	
		 webDriver.manage().window().maximize();
		 Thread.sleep(3000);
		 WebElement webElement=webDriver.findElement(By.xpath("//a[contains(@data-linktype,'Retail') and @href]/descendant::span[text()='Select country']"));
		 webElement.click(); */
		 webDriver.get("http://www.lufthansa.com");
		 Thread.sleep(3000);
		 WebElement webElement=webDriver.findElement(By.xpath("//button[contains(@id,'Origin')]"));
		 webElement.click();
		 Thread.sleep(3000);
		 webElement=webDriver.findElement(By.xpath("//h2[contains(@id,'Origin')]/../following-sibling::div/descendant::label[contains(text(),'Ireland')]"));
		 webElement.click();
		 Thread.sleep(3000);
		 webElement=webDriver.findElement(By.xpath("//label[contains(text(),'Dublin')]"));
		 webElement.click();
		 Thread.sleep(3000);
		 webElement=webDriver.findElement(By.xpath("//label[contains(text(),'DUB')]"));
		 webElement.click();
		 Thread.sleep(3000);
		 webElement=webDriver.findElement(By.xpath("//input[@value='Select']"));
		 webElement.click();
		 Thread.sleep(3000);

	}

}
