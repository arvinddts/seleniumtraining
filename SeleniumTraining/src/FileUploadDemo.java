import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	
		static ChromeDriver driver=null;
		static WebElement webelement=null;
		public static void main(String[] args) throws InterruptedException, AWTException {
			 System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
			driver= new ChromeDriver();	
			driver.manage().window().maximize();		
			driver.get("https://login.oracle.com/mysso/signon.jsp");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//label/following-sibling::input")).sendKeys("abcd@gmail.com");
			
	}

}
