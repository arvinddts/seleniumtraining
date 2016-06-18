import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class StaleExceptionExample {

	public static void main(String[] args) throws Exception{
		 
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		WebDriver webDriver= new ChromeDriver();			
		webDriver.get("http://www.github.com");
		WebElement Search_Box = webDriver.findElement(By.xpath("//input[@name='q']"));		  
		Search_Box.sendKeys("Hello");
		Search_Box.sendKeys(Keys.ENTER);
		Thread.sleep(5000);		  
	    Search_Box = webDriver.findElement(By.xpath("//input[@name='q']"));	
		Search_Box.clear();  
		Search_Box.sendKeys("Hi");

	}

}
