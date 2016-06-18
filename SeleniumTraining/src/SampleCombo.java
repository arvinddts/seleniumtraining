import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleCombo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arvind/chromedriver.exe");
		WebDriver driver= new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		Thread.sleep(3000);	
		WebElement webelement=driver.findElement(By.id("dropdown"));
		Select combo = new Select(webelement);
		combo.selectByIndex(1);
		Thread.sleep(3000);	
		combo.selectByValue("2");
		Thread.sleep(3000);	
		combo.selectByVisibleText("Option 1");
		

	}

}
