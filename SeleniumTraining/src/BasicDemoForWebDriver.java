import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicDemoForWebDriver
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
		DesiredCapabilities capability = null;

		capability = DesiredCapabilities.chrome();

		ChromeOptions options = new ChromeOptions();
		options.addArguments(Arrays.asList("allow-running-insecure-content","ignore-certificate-errors","--disable-javascript"));
		 
		options.addArguments("test-type");
		capability.setCapability(ChromeOptions.CAPABILITY, options);
		capability.setBrowserName("chrome");
		
 		ChromeDriver driver= new ChromeDriver(capability);
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		 
  		driver.get("http://www.zamzar.com");	
  		Thread.sleep(3000);
  		Actions action = new Actions(driver);
  //		JavascriptExecutor js = (JavascriptExecutor) driver;
//  		js.executeScript("document.getElementById('inputFile').style.opacity=\"1\";"); 
//  		js.executeScript("document.getElementById('inputFile').style.display=\"unblock\";"); 
//  		WebElement webelement=driver.findElement(By.xpath("//button[text()='Choose Files...']"));
//  		action.moveToElement(webelement).build().perform();
  		 
  		driver.findElement(By.id("inputFile")).click();
  		Thread.sleep(5000);
//  	    driver.switchTo()
//  	            .activeElement()
//  	            .sendKeys(
//  	                    "/home/likewise-open/GLOBAL/123/Documents/filename.txt");  		 
  		//action.moveToElement(webelement).sendKeys("/Users/arvind/Downloads/SikuliX-1.0.1-SetupLog.txt").build().perform();
  		//((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", webelement);
  	  driver.findElement(By.id("inputFile")).sendKeys("/Users/arvind/Downloads/SikuliX-1.0.1-SetupLog.txt");
//  		JavascriptExecutor rightexecutor = (JavascriptExecutor)driver;
//  		js.executeScript("arguments[0].setAttribute('innerHTML','/Users/arvind/Downloads/SikuliX-1.0.1-SetupLog.txt')", webelement);
  		//action.moveToElement(webelement).sendKeys("/Users/arvind/Downloads/SikuliX-1.0.1-SetupLog.txt").build().perform();
  		
 // 		 webelement=driver.findElement(By.id("uploadButton"));
 // 		action.moveToElement(webelement).click().build().perform();
  		
// 		WebElement webelement=new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.name("originName1")));
//			 
//		WebElement webelement = driver.findElement(By.id("ns_7_CO19VHUC6FF8F0AELSQ6AN3IT2_aa-origin"));
//		webelement.click();
//		driver.manage().window().maximize();

//		Thread.sleep(2000);	

//		Thread.sleep(2000);	
//		//webelement = driver.findElement(By.xpath("//*[@class='aa-select aa-city']"));
		WebElement webelement1=driver.findElement(By.xpath("//*[text()='India']"));
 		Coordinates coordinate = ((Locatable) webelement1).getCoordinates(); 
 		coordinate.onPage(); 
 		coordinate.inViewPort();
//		Actions action = new Actions(driver);	
//		action.moveToElement(webelement1).click().perform();
//		//webelement1.click();
//		Thread.sleep(3000);
//		//webelement = driver.findElement(By.xpath("//*[@class='aa-select aa-city']"));
//		webelement1=driver.findElement(By.xpath("//*[text()='Pune']"));
//		action.moveToElement(webelement1).click().perform();
//		Thread.sleep(2000);
//		webelement1=driver.findElement(By.xpath("//*[text()='Pune (PNQ)']"));
//		action.moveToElement(webelement1).click().perform();
//		
////		coordinate = ((Locatable) webelement1).getCoordinates(); 
////		coordinate.onPage(); 
////		coordinate.inViewPort();
////		webelement1.click();
////		JavascriptExecutor jse = (JavascriptExecutor)driver;
////		jse.executeScript("arguments[0].scrollIntoView(true);", webelement);
////		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
////		jse.executeScript("scroll(0, 500);");
////		Thread.sleep(2000);
////		jse.executeScript("scroll(500, 1000);");
////		WebElement webelement = driver.findElement(By.xpath("//*[text()='Developers']"));
////		if(webelement.isDisplayed())
////		{
////			System.out.println("visible on page");
////		}
////	
////		Thread.sleep(3000);
////		Actions act= new Actions(driver);
////		act.moveToElement(webelement).click();
////		act.sendKeys(Keys.DOWN).perform();
////		int i=0;
////		while(i<10)
////		{
////		webelement.sendKeys(Keys.DOWN);	
////		if(webelement.isDisplayed())
////		{
////			break;
////		}
////		i++;
////		Thread.sleep(1000);
////		}
//		
////		for (String winHandle : driver.getWindowHandles()) {
////		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
////		}
////		Thread.sleep(2000);	
////		webelement = driver.findElement(By.xpath("//*[text()='Promotions section']"));
////		webelement.click();
////		driver.close();
//		
//		
//	    //Select select = new Select(e);
//	//    select.selectByVisibleText("one");
//		
//		
//		/*Actions action = new Actions(driver);
//		action.moveToElement(e).perform();
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		e=driver.findElement(By.xpath("//*[text()='actiTIME Add-ons']"));
//		executor.executeScript("arguments[0].click();", e);*/
//		 Alert alert = driver.switchTo().alert();
	}
}

