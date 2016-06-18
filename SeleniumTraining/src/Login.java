import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {
    public static void loginToFacebook(String username, String password,String message) throws InterruptedException{
    	String url = "http://www.facebook.com";
    	System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
    	ChromeDriver driver= new ChromeDriver();	    	 
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.manage().window().maximize();				
    	driver.get(url);
    	Thread.sleep(2000);	
    	driver.findElement(By.id("email")).sendKeys(username);
    	driver.findElement(By.id("pass")).sendKeys(password);
    	driver.findElement(By.id("loginbutton")).click();
    	Thread.sleep(3000);
    	WebElement webelement = driver.findElement(By.xpath("//*[text()='"+message+"']"));
    	Assert.assertNotNull(webelement);
    }
/*    public static void main(String a[]) throws InterruptedException
    {
    	loginToFacebook("admin","admin","Incorrect email address or phone number");	
    } */
}