import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		 WebDriver webDriver = new ChromeDriver();
		 webDriver.get("http://www.facebook.com");	
		 webDriver.manage().window().maximize();
		/* Options option=webDriver.manage();
		 Window window=option.window();
		 window.maximize(); */
		 Thread.sleep(3000);
		 WebElement webElement=webDriver.findElement(By.id("email"));
		 webElement.sendKeys("arvinddts@gmail.com");
		 webElement=webDriver.findElement(By.id("pass"));
		 webElement.sendKeys("abcd1234");
		 webElement=webDriver.findElement(By.xpath("//input[@value='Log In']"));
		 webElement.click();
		 webElement=webDriver.findElement(By.xpath("//span[text()='Log in to Facebook']"));
		 if(webElement!=null)
		 {
			 System.out.println("The user not able to login with wrong password and testcase is successfull");
		 } 
		 
		  
		
		
		/*Thread.sleep(5000);
		 
		WebElement webElement=webDriver.findElement(By.id("next"));		
		webElement.click();
		Thread.sleep(2000);
		webElement=webDriver.findElement(By.id("errormsg_0_Email"));
		String errorMessage=webElement.getText();		 
		if(errorMessage.contains("Please enter your email."))
		{
			System.out.println("The error info is properly displayed");
		}
		
	// 	webDriver.close();
		*/
		

	}

}
