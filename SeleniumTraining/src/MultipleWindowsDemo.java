	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class MultipleWindowsDemo {
	
		static ChromeDriver driver=null;
		static WebElement webelement=null;
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
			driver=new ChromeDriver();	
			driver.manage().window().maximize();
			driver.get("http://the-internet.herokuapp.com/windows");
			Thread.sleep(3000);
			Set<String> handlers=driver.getWindowHandles();
			System.out.println(handlers);			 
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//*[text()='Click Here']")).click();
			handlers=driver.getWindowHandles();				
			String newHandler=null;
			for (String winHandle : handlers) {				
				newHandler=winHandle;
				System.out.println(newHandler);
			}
			driver.switchTo().window(newHandler);
	//		System.out.println(handlers);
	 		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed());
	//		System.out.println(driver.getWindowHandles().size());
 	/*		String parentHandler=driver.getWindowHandle();
 			System.out.println("The parent handle id = "+parentHandler);
 			driver.findElement(By.xpath("//*[text()='Click Here']")).click();
 			System.out.println(driver.getWindowHandles().size());
 			Set<String> set=driver.getWindowHandles();
 			
 			String newHandler=null;
			for (String winHandle : set) {
				newHandler=winHandle ;
			}	
			System.out.println("The child handle id = "+newHandler);
			driver.switchTo().window(newHandler);
			Thread.sleep(2000);	
			System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed());			 
			driver.close();
			driver.switchTo().window(parentHandler);		
			Thread.sleep(2000);			
			System.out.println(driver.findElement(By.xpath("//*[text()='Click Here']")).isDisplayed()); 
			*/
	
		}
	
	}
