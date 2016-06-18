import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

public class VisibilityExample1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		WebDriver webDriver= new FirefoxDriver();		 
		webDriver.get("http://theaudiocrafts.com");
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement webElement=webDriver.findElement(By.xpath("//a[text()='DIY Speakers']"));	
	 /*	Coordinates coordinate = ((Locatable) webElement).getCoordinates(); 
 		coordinate.onPage(); 
 		coordinate.inViewPort();  */
	 //  	Actions action = new Actions(webDriver);		
	 //	action.moveToElement(webElement).build().perform();
	//	Thread.sleep(3000);
	//	webElement=webDriver.findElement(By.xpath("//a[contains(text(),'Spikes')]"));
	//	webElement.click();
	//	action.click().perform(); */
/*		Thread.sleep(2000);
	 	String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
	 	JavascriptExecutor js = (JavascriptExecutor) webDriver;
	 	js.executeScript(mouseOverScript, webElement); */
 	//  	JavascriptExecutor jse = (JavascriptExecutor)webDriver;
 	// 	jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
		  Point coordinates = webElement.getLocation();
		  Robot robot = new Robot();
		  robot.mouseMove(coordinates.getX()+50,coordinates.getY()+80);
	 

	}

}
