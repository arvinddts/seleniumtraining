import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriverExample {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		 WebDriver webDriver = new ChromeDriver();
		 webDriver.get("http://www.theaudiocrafts.com");
		 Thread.sleep(3000);	
		 webDriver.findElement(By.xpath("//a[text()='DIY Speakers']"));
		 Thread.sleep(3000);
		 webDriver.findElement(By.xpath("//a[contains(text(),'Spikes')]")).click();
		 

	}

}
