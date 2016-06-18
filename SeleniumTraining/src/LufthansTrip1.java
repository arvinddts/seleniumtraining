import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.WebElement;

public class LufthansTrip1 
{
	public static WebElement webElement=null;
	public static WebDriver webDriver=null;
	
	//private static final String WebElement = null;
	
	public static void main(String[] arg) throws InterruptedException
	{
/*		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://www.lufthansa.com");
		Thread.sleep(3000); */
		
	/*	webDriver.findElement(By.id("flightmanagerFlightsFormAirportAtlasDestination")).click();
		webDriver.findElement(By.xpath("//label[text()='India' or @for='flmDestinationAirportAtlasCountry76']")).click();
		
		webDriver.findElement(By.xpath("//label[text()='Bengaluru' or @value='BLR']")).click();*/
		
/*		webDriver.findElement(By.xpath("//button[contains(@id,'Destination')]")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//label[contains(text(),'India')]")).click();
		Thread.sleep(2000);
 		webDriver.findElement(By.xpath("//label[contains(text(),'Bengaluru')]")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//label[contains(text(),'BLR')]")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//input[@value='Select']")).click(); */
/*		WebElement webElement=webDriver.findElement(By.xpath("//a[contains(text(),'Flights & Deals')]"));
		Actions action = new Actions(webDriver);
		action.moveToElement(webElement).build().perform();
	/*	Thread.sleep(2000);
		webElement=webDriver.findElement(By.xpath("//a[text()='Travel Guide']"));
		if(webElement.isDisplayed())
		{
			System.out.println("The element is visible");
			webElement.click();
		}
		else
			System.out.println("The element is not visible");*/
		
		
		
		//webElement= driver.findElement(By.xpath("//Input[@value='IN']/parent::label"));
/*		webElement= driver.findElement(By.xpath("//div[@data-name='country']/child::label[@for='flmDestinationAirportAtlasCountry76']"));
		webElement.click();*/
	 
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		WebDriver webDriver= new FirefoxDriver();	
		webDriver.manage().window().maximize();		 
		webDriver.get("http://www.lufthansa.com");
 		Thread.sleep(5000);		
 	//	JavascriptExecutor js = (JavascriptExecutor) webDriver;
	//	WebElement webElement=webDriver.findElement(By.xpath("//a[contains(text(),'Flights & Deals')]"));
		 
	//	webElement.sendKeys(Keys.CLEAR);
	//	 String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		 
	//	js.executeScript(mouseOverScript, webElement); 
 		 
 		WebElement webElement=webDriver.findElement(By.cssSelector("button[id*='Origin']"));
 		System.out.println(webElement.isDisplayed());
 		webElement.click();
 		
	//	webElement = (WebElement) js.executeScript("return document.elementFromPoint(arguments[0], arguments[1])", p.getX(),p.getY());
//		webElement.click();
		 
		 
		 
		
		//System.out.println(x+"="+y);
/*		Point p=webElement.getLocation();
				Actions action = new Actions(webDriver);
		action.moveToElement(webElement).build().perform();		
		Thread.sleep(2000); */
 //		action.click(webElement).perform();  
	//	 	WebElement webElement=webDriver.findElement(By.xpath("//span[text()='Premium Economy']"));
//		 String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
//		JavascriptExecutor js = (JavascriptExecutor) webDriver;
//		js.executeScript(mouseOverScript, webElement); 
		 
 /*		Coordinates coordinate = ((Locatable) webElement).getCoordinates(); 
 		coordinate.onPage(); 
 		coordinate.inViewPort();  */
			}
	
}