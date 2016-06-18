import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class FixLuftansaIssue {
	
	static WebDriver webDriver =null;
	static WebElement webElement =null;
	
	public static void selectSource(String country,String city,String airport) throws InterruptedException
	{
		webElement=webDriver.findElement(By.xpath("//button[contains(@data-airport-atlas,'OriginCode')]"));
		webElement.click();
		Thread.sleep(3000);
		webElement=webDriver.findElement(By.xpath("//label[contains(text(),'"+country+"')]"));
		webElement.click();
		Thread.sleep(3000);
		webElement=webDriver.findElement(By.xpath("//label[contains(text(),'"+city+"')]"));
		webElement.click();
		Thread.sleep(3000);
		webElement=webDriver.findElement(By.xpath("//label[contains(text(),'"+airport+"')]"));
		webElement.click();
		Thread.sleep(3000);
		webElement=webDriver.findElement(By.xpath("//input[@value='Select']"));
		webElement.click();	
	}
	public static void selectDestination(String country,String city,String airport) throws InterruptedException
	{
		Thread.sleep(3000);
		webElement=webDriver.findElement(By.xpath("//button[contains(@data-airport-atlas,'DestinationCode')]"));
		webElement.click();
		Thread.sleep(3000);		
		webElement=webDriver.findElement(By.xpath("//label[contains(@for,'DestinationAirport') and contains(text(),'"+country+"')]"));
		webElement.click();
	 	Thread.sleep(3000);
		webElement=webDriver.findElement(By.xpath("//label[contains(@for,'DestinationAirport') and contains(text(),'"+city+"')]"));
		webElement.click();
		Thread.sleep(3000);
		webElement=webDriver.findElement(By.xpath("//label[contains(@for,'DestinationAirport') and contains(text(),'"+airport+"')]"));
		webElement.click();
		Thread.sleep(3000);
		webElement=webDriver.findElement(By.xpath("//div[contains(@aria-labelledby,'Destination')]/descendant::input[@value='Select']"));
		webElement.click();	 
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
		webDriver= new ChromeDriver();		 
		webDriver.get("http://www.lufthansa.com");
		Thread.sleep(5000);
		selectSource("Poland","Wroclaw","WRO");
		selectDestination("Zimbabwe","Harare","HRE");
		
	}
	
	private static void display(String name,int rollno) throws IOException
	{
 		 
		System.out.println("This "+name+" has rollno ="+rollno);
	}  

} 

 
 