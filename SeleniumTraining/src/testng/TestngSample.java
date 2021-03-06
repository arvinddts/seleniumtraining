package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestngSample {
  
	static String url = null;
 	static ChromeDriver driver= null;
	 
	static WebElement webelement =null;
	static String username =null;
	static String password = null;
	static WebDriverWait wait =null;	
	
	 @BeforeClass
	  public void beforeClass() {
		  
		  url = "http://www.facebook.com";
		  System.out.println("Called Before Class");
			
	  }
	 
 	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
			System.out.println("Called Before Method"); 
			System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
				 driver= new ChromeDriver();			 
			wait = new WebDriverWait(driver,10);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();				
			driver.get(url);
			Thread.sleep(2000);		
	  } 
 	 
 	@Test(priority=2)
	public void wrong_user_and_password() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		 webelement = driver.findElement(By.xpath("//*[text()='Log in to Facebook']"));		 
		 Assert.assertNotNull(webelement);		
	}
 	
 	
  	@Test(priority=1)
	public void no_user_and_password() throws InterruptedException {
		driver.findElement(By.id("email"));
		driver.findElement(By.id("pass"));
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);		 
		webelement = driver.findElement(By.xpath("//*[text()='Log in to Facebook']"));	
	//	String errorMessage=webelement.getText();
	//	System.out.println(errorMessage);
		Assert.assertTrue(webelement!=null,"The Element is not displayed on the page");
	//	assertEquals("The Element is not displayed on the page","Incorrect email address or phone number",errorMessage);
		
	}

	
/*  @Test
  public void wrong_user_and_password() throws InterruptedException {
	 
	  WebDriver driver = LocalDriverFactory.createInstance("chrome");
      LocalDriverManager.setWebDriver(driver);		 
	wait = new WebDriverWait(driver,10);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();				
	driver.get(url);
	Thread.sleep(2000);		
	    driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		webelement = driver.findElement(By.xpath("//*[text()='Incorrect email address or phone number']"));
		Assert.assertNotNull(webelement);
  }
  
  @Test
	public void no_user_and_password() throws InterruptedException {
	  WebDriver driver = LocalDriverFactory.createInstance("chrome");
      LocalDriverManager.setWebDriver(driver);
	 		 
	wait = new WebDriverWait(driver,10);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();				
	driver.get(url);
	Thread.sleep(2000);		
		driver.findElement(By.id("email"));
		driver.findElement(By.id("pass"));
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);		 
		webelement = driver.findElement(By.xpath("//*[text()='Incorrect email address or phone number']"));		 
		Assert.assertTrue(webelement!=null,"The Element is not displayed on the page");
	 
		
	} */
  
  @AfterMethod
  public void afterMethod() {
	  
	  //driver.close();
  }

 

  @AfterClass
  public void afterClass() {
  }

}
