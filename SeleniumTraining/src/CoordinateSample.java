import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

public class CoordinateSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.microsoft.com/en-us/");
		Thread.sleep(3000);
		WebElement webelement=driver.findElement(By.xpath("//*[@id='88903a6c-ba7c-476a-8262-a9228a93eeed']"));
		Coordinates coordinate = ((Locatable) webelement).getCoordinates(); 
		coordinate.onPage(); 
		coordinate.inViewPort();
		webelement.click();

	}

}
