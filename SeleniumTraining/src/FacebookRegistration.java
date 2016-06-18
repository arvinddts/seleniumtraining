import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
		WebDriver webDriver= new ChromeDriver(); 
		webDriver.get("https://www.facebook.com/"); 
		Thread.sleep(5000); 	
	/*	WebElement webElement=webDriver.findElement(By.name("firstname"));		 
		webElement.sendKeys("Arvind");
		Thread.sleep(2000);
		webElement=webDriver.findElement(By.name("lastname"));		 
		webElement.sendKeys("Kumar");*/
	/*	List webElements=webDriver.findElements(By.name("sex"));
		System.out.println(webElements.size());
		WebElement webElement=(WebElement) webElements.get(0);		 
		webElement.click(); */
		WebElement webElement=webDriver.findElement(By.name("birthday_month"));
		Select month = new Select(webElement);
		List<WebElement> webelements=month.getOptions();
		for(WebElement comboelement:webelements)
		{
			if(comboelement.getText().contains("N"))
				month.selectByVisibleText(comboelement.getText());
		}
		}

	}


