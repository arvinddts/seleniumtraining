import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);	
		WebElement webElement=driver.findElement(By.id("file-upload"));
		webElement.sendKeys("C:/1.txt");
		Thread.sleep(3000);	
		webElement=driver.findElement(By.id("file-submit"));
		webElement.click();
	    Actions action = new Actions(driver);
	
		 
		 
		
		
		}
}
