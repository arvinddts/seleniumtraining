import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleSingon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://admin:admin@the-internet.herokuapp.com");
		Thread.sleep(3000);	
		 

	}

}
