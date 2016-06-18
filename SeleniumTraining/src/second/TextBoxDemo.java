package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {
	
	public static  WebElement  webElement=null;
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException                        
	{		 
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.lufthansa.com/in/en/Homepage");
		Thread.sleep(3000);	
		
		webElement=driver.findElement(By.xpath(" //div[@id='pers_m']/descendant::a[contains(@href,'Baggage')]")); 		
		webElement.click();
		//selectGender("Female");
		
		 
	}
	
 	public static void selectGender(String selectGender)
	{
 		//webElement=driver.findElement(By.xpath("//label[text()='"+selectGender+"']/parent::span/child::input"));
 		webElement=driver.findElement(By.xpath("//label[text()='"+selectGender+"']/preceding-sibling::input")); 		
		webElement.click();
	} 
 	
 	 
 	
 	}


