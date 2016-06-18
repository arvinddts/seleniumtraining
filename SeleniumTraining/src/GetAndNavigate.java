import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		WebDriver webDriver= new ChromeDriver();		 
		//webDriver.get("http://www.lufthansa.com");
		//webDriver.navigate().to("http://www.google.com");
		Thread.sleep(5000);
		webDriver.navigate().to("http://www.lufthansa.com");
		

	}

}
