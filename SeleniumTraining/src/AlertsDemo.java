import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AlertsDemo {

	static ChromeDriver driver=null;
	static WebElement webelement=null;
	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/arvind/chromedriver.exe");
		driver= new ChromeDriver();	
		driver.manage().window().maximize();		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);	
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//p[text()='You successfuly clicked an alert']")).isDisplayed());
		
		
/*		Thread.sleep(2000);
		StringSelection stringSelection = new StringSelection("admin");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        alert.sendKeys(Keys.CONTROL+"v"); */
         
         //tab to password entry field
//         rb.keyPress(KeyEvent.VK_TAB);
//         rb.keyRelease(KeyEvent.VK_TAB);
//         Thread.sleep(2000);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.);
//		alert.sendKeys("Hello");
//		Thread.sleep(3000);
//		System.out.println(alert.getText());
//		alert.accept();

	}

}
