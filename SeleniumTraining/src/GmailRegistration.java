/*import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 

public class GmailRegistration {

	public static void main(String[] args) throws InterruptedException {
 
//		String username = RandomStringUtils.random(12, true, true);		 
//		String password = RandomStringUtils.random(12, true, true)+"@";
		System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		 
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		WebElement webelement=driver.findElement(By.xpath("//*[contains(text(),'Create account')]"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click();			 
		webelement=driver.findElement(By.id("FirstName"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys(username);		 
		webelement=driver.findElement(By.id("LastName"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys(username);		 
		webelement=driver.findElement(By.id("GmailAddress"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys(username);
		webelement=driver.findElement(By.id("Passwd"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys(password);		 
		webelement=driver.findElement(By.id("PasswdAgain"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys(password);		 	 	 
		webelement=driver.findElement(By.xpath("//*[contains(@id,'birthday')]//*[@role]"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click(); 		 
		webelement=driver.findElement(By.xpath("//*[text()='January']"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click(); 		  
		webelement=driver.findElement(By.id("BirthDay"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys("01");		 
		webelement=driver.findElement(By.id("BirthYear"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys("2001");		 	 
		webelement=driver.findElement(By.xpath("//*[contains(@id,'gender')]//*[@role]"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click(); 		
		webelement=driver.findElement(By.xpath("//*[text()='Male']"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click();			 	 
		webelement=driver.findElement(By.xpath("//*[contains(@id,'phone')]//*[@role]"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click(); 		 
		webelement=driver.findElement(By.xpath("//*[contains(text(),'India')]"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click(); 		 
		webelement=driver.findElement(By.id("RecoveryPhoneNumber"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys("9901528380");		 
		webelement=driver.findElement(By.id("RecoveryEmailAddress"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys("indepthrealtime@gmail.com");		 
		webelement=driver.findElement(By.id("SkipCaptcha"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click( );		 
		webelement=driver.findElement(By.id("TermsOfService"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click();		  
		webelement=driver.findElement(By.id("submitbutton"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click();
		
		
		
		
		  
		  
		
		
		//*[contains(@id,'gender')]//*[@role='listbox']
		
		
		
		
		
		//*[contains(@id,'country')]//*[@role]
		
		
		
		
		

	}

}
*/