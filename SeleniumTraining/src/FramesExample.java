 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class FramesExample 
{
	//public WebElement webElement=null;
	
public static void main(String [] arg) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:/Users/arv/chromedriver.exe");
	WebDriver webDriver= new ChromeDriver();
	webDriver.manage().window().maximize();
	webDriver.get("http://the-internet.herokuapp.com/nested_frames");
		
	webDriver.switchTo().frame(0);
	Thread.sleep(2000); 
	webDriver.switchTo().frame(0);
	WebElement webElement = webDriver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
	
	System.out.println(webElement.isDisplayed());
	webDriver.switchTo().defaultContent();
	
	webDriver.switchTo().frame(0);
	Thread.sleep(2000); 
	webDriver.switchTo().frame(1);
	webElement = webDriver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
	System.out.println(webElement.isDisplayed());
	
	webDriver.switchTo().defaultContent();
	
	webDriver.switchTo().frame(0);
	Thread.sleep(2000); 
	webDriver.switchTo().frame(2);
	webElement = webDriver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
	System.out.println(webElement.isDisplayed());
	
webDriver.switchTo().defaultContent();
	
	webDriver.switchTo().frame(1);
	webElement = webDriver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
	System.out.println(webElement.isDisplayed());
	/*	webDriver.switchTo().defaultContent();
//	Thread.sleep(2000);
	
	
	System.out.println("right");
	webDriver.switchTo().frame(1);
	Thread.sleep(2000); 
	System.out.println("right1");
	Thread.sleep(2000);
	
	
	//WebElement webElement1 = webDriver.findElement(By.xpath("//frame[@name='frame-right']"));
	WebElement webElement1 =webDriver.findElement(By.cssSelector("//frame[@name='/frame_middle']"));


	//WebElement webElement1 = webDriver.findElement(By.xpath("//div[text()='MIDDLE']"));
	System.out.println(webElement1.isDisplayed());
	Thread.sleep(2000);
	webDriver.switchTo().defaultContent();
	
	
	
	
	webDriver.switchTo().frame(1);
//	Thread.sleep(2000); 
	System.out.println("ok");
	WebElement webElement2 = webDriver.findElement(By.xpath("//div[@id='content']/parent::body/child::div"));
	System.out.println(webElement2.isDisplayed());

	//webDriver.switchTo().defaultContent();
	Thread.sleep(2000);*/
	
	
}
}

