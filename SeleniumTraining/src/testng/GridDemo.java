package testng;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
 
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GridDemo
{
    
   public String URL, Node;
   DesiredCapabilities cap;    
   static WebDriverWait wait =null;	
   
   
   @Parameters("browser")
   @BeforeMethod
   public void launchapp(String browser) throws MalformedURLException
   {
	   URL = "http://www.calculator.net";       
      if (browser.equalsIgnoreCase("firefox"))
      {
      /*   System.out.println(" Executing on FireFox");
         Node = "http://192.168.99.100:5555/wd/hub";
         cap = DesiredCapabilities.firefox();
         cap.setBrowserName("firefox"); */
          
      
      }
      else if (browser.equalsIgnoreCase("chrome"))
      {
          System.out.println(" Executing on CHROME");  
         Node = "http://localhost:5556/wd/hub";      
         cap = DesiredCapabilities.chrome();
         cap.setBrowserName("chrome");                 
            
      }     
      else
      {
         throw new IllegalArgumentException("The Browser Type is Undefined");
      }
   }
   
   @Test
   @Parameters( "browser" )
   public void calculatepercent(String browser) throws MalformedURLException, InterruptedException
   {
	   WebDriver driver = LocalDriverFactory.createInstance(browser);	   
       LocalDriverManager.setWebDriver(driver);		 
       wait = new WebDriverWait(driver,10);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();				
       driver.get(URL);
       Thread.sleep(2000);		
       System.out.println("Done");
      // Click on Math Calculators
      driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();     	
      // Click on Percent Calculators
      driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("10");
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
      // Get the Result Text based on its xpath
      driver.findElement(By.xpath("//*[@value='Calculate']")).click();
      String result = driver.findElement(By.xpath("//*[text()='5']")).getText();
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      if(result.equals("5"))
      {
         System.out.println(" The Result is Pass");
      }
      else
      {
         System.out.println(" The Result is Fail");
      }
   }
   
   @Test
   @Parameters( "browser" )
   public void calculatepercent1(String browser) throws MalformedURLException, InterruptedException
   {
	   WebDriver driver = LocalDriverFactory.createInstance(browser);	   
       LocalDriverManager.setWebDriver(driver);		 
       wait = new WebDriverWait(driver,10);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();				
       driver.get(URL);
       Thread.sleep(2000);		
       System.out.println("Done");
      // Click on Math Calculators
      driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();     	
      // Click on Percent Calculators
      driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("10");
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
      // Get the Result Text based on its xpath
      driver.findElement(By.xpath("//*[@value='Calculate']")).click();
      String result = driver.findElement(By.xpath("//*[text()='5']")).getText();
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      if(result.equals("5"))
      {
         System.out.println(" The Result is Pass");
      }      
      else
      {
         System.out.println(" The Result is Fail");
      }
   }
   
   
   @Test
   @Parameters( "browser" )
   public void calculatepercent3(String browser) throws MalformedURLException, InterruptedException
   {
	   WebDriver driver = LocalDriverFactory.createInstance(browser);	   
       LocalDriverManager.setWebDriver(driver);		 
       wait = new WebDriverWait(driver,10);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();				
       driver.get(URL);
       Thread.sleep(2000);		
       System.out.println("Done");
      // Click on Math Calculators
      driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();     	
      // Click on Percent Calculators
      driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("10");
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
      // Get the Result Text based on its xpath
      driver.findElement(By.xpath("//*[@value='Calculate']")).click();
      String result = driver.findElement(By.xpath("//*[text()='5']")).getText();
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      if(result.equals("5"))
      {
         System.out.println(" The Result is Pass");
      }      
      else
      {
         System.out.println(" The Result is Fail");
      }
   }
   
   
   
   
 //  @AfterTest
   public void closeBrowser()
   {
    //  driver.quit();
   }
}