package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTestngDemo {
	
  @Test
  @Parameters({ "locationofchromedriver", "luftansaurl","browser"})
  public void openLuftansa(String location,String url,String browser) {
	  WebDriver webDriver=null;
	  if(browser.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", location);
		  webDriver= new ChromeDriver();
	  }
	  else
	  {
		  webDriver= new FirefoxDriver();
	  }
	  webDriver.manage().window().maximize();		 
	  webDriver.get(url);
  }
 
  @Test
  @Parameters({ "locationofchromedriver", "facebookurl","browser"})
  public void openFacebook(String location,String url,String browser) {
	  WebDriver webDriver=null;
	  if(browser.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", location);
		  webDriver= new ChromeDriver();
	  }
	  else
	  {
		  webDriver= new FirefoxDriver();
	  }
	  webDriver.manage().window().maximize();		 
	  webDriver.get(url);
  }
}
