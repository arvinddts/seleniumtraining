import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
		Thread.sleep(3000);			
		driver.switchTo().frame(0);	
		WebElement webElement=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		System.out.println(webElement.isDisplayed());
		driver.switchTo().defaultContent();
		webElement=driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
		System.out.println(webElement.isDisplayed());
		/*		driver.switchTo().frame("mce_0_ifr");
		WebElement webElement=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		System.out.println(webElement.isDisplayed());
		driver.switchTo().defaultContent();
		webElement=driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
		System.out.println(webElement.isDisplayed()); */
		

	}

}
