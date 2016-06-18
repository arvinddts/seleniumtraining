import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class TestingWindowsWithSelenium {
		static ChromeDriver driver=null;
		static WebElement webelement=null;
		public static void main(String[] args) throws InterruptedException  {
			
			System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
			driver= new ChromeDriver();	
			driver.manage().window().maximize();
			driver.get("http://www.lufthansa.com/online/portal/lh/in/homepage");
			Thread.sleep(3000);	
			WebElement webelement=driver.findElement(By.id("pers_m"));
			Thread.sleep(5000);
			WebElement childwebelement=webelement.findElement(By.xpath("child::*//*[@href='/in/en/Arrival-and-Departure']"));
			childwebelement.click();
			 
}
}

