import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuftansaDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.lufthansa.com/online/portal/lh/in/homepage");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='flightmanagerFlightsFormOutboundDateDisplay']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[text()='May 2016']/../following-sibling::div/descendant::button[text()='10']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[text()='June 2016']/../following-sibling::div/descendant::button[text()='01']")).click();	
		 
		 
	}

}
