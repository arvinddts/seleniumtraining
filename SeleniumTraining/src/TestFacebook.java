import static org.junit.Assert.*;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 


public class TestFacebook {

	static String url = null;
 	 ChromeDriver driver= null;	 
	 WebElement webelement =null;
	 String username =null;
	 String password = null;
	 WebDriverWait wait =null;
	static Properties p = null;
	static FileReader fr= null;
	
/*	@Rule
	    public Timeout globalTimeout = Timeout.seconds(30); */
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		 p = new Properties();
		 fr= new FileReader("C:/Selenium/SeleniumTraining/src/setup.properties");
		 p.load(fr);
		 url = (String) p.get("url");
		 System.out.println("Called Before Class");
		
	}

	
	@Before
	public void setUpForFacebookTesting() throws Exception {
				
				System.out.println("Called Before Method");
//				username = RandomStringUtils.random(12, true, true);
//				password = RandomStringUtils.random(12, true, true)+"@";
				System.setProperty("webdriver.chrome.driver", "C:/Users/arvind/chromedriver.exe");
				driver= new ChromeDriver();				 
				wait = new WebDriverWait(driver,10);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();				
				driver.get(url);
				int a = 20;
				
				//Thread.sleep(2000);		
		
	}
	
	
	@Test 
	public void wrong_user_and_password() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		 webelement = driver.findElement(By.xpath("//span[text()='Log in to Facebook']"));		 
		assertNotNull(webelement);		
	}
	
	
	@Test
	public void no_user_and_password() throws InterruptedException {
		driver.findElement(By.id("email"));
		driver.findElement(By.id("pass"));
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);		 
		webelement = driver.findElement(By.xpath("//span[text()='Log in to Facebook']"));	
	//	String errorMessage=webelement.getText();
	//	System.out.println(errorMessage);
		assertTrue("The Element is not displayed on the page", webelement!=null);
		 
	//	assertEquals("The Element is not displayed on the page","Incorrect email address or phone number",errorMessage);
		
	}

	@After
	public void tearDown() throws Exception {			
		 driver.close();		
	}
	 @AfterClass
	public static void AfterClass() throws Exception {
		fr.close();
	}

	
	
	 
	
	//Documentation
	//@Ignore
/*	@Test
	public void gmailRegistration() throws InterruptedException {
		//Documentation what is this identification and which page
		webelement=driver.findElement(By.xpath("//*[contains(text(),'Create account')]"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click();		
		//Documentation what is this identification and which page
		webelement=driver.findElement(By.id("FirstName"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys(username);	
		//Documentation what is this identification and which page
		webelement=driver.findElement(By.id("LastName"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys(username);		 
		//Documentation what is this identification and which page
		webelement=driver.findElement(By.id("GmailAddress"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys(username);
		webelement=driver.findElement(By.id("Passwd"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys(password);		 
		webelement=driver.findElement(By.id("PasswdAgain"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys(password);		 	 	 
		webelement=driver.findElement(By.xpath("//*[contains(@id,'birthday')]//*[@role]"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click(); 		 
		webelement=driver.findElement(By.xpath("//*[text()='January']"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click(); 		  
		webelement=driver.findElement(By.id("BirthDay"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys("01");		 
		webelement=driver.findElement(By.id("BirthYear"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys("2001");		 	 
		webelement=driver.findElement(By.xpath("//*[contains(@id,'gender')]//*[@role]"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click(); 		 
		webelement=driver.findElement(By.xpath("//*[text()='Male']"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click();			 	 
		webelement=driver.findElement(By.xpath("//*[contains(@id,'phone')]//*[@role]"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click(); 		 
		webelement=driver.findElement(By.xpath("//*[contains(text(),'India')]"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click(); 		 
		webelement=driver.findElement(By.id("RecoveryPhoneNumber"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys("9901528380");		 
		webelement=driver.findElement(By.id("RecoveryEmailAddress"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.sendKeys("indepthrealtime@gmail.com");		 
		webelement=driver.findElement(By.id("SkipCaptcha"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click( );		 
		webelement=driver.findElement(By.id("TermsOfService"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click();		  
		webelement=driver.findElement(By.id("submitbutton"));
		wait.until(ExpectedConditions.visibilityOf(webelement));
		webelement.click();			
		//webelement=driver.findElement(By.xpath("//*[contains(text(),'Verify your account')]"));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(),'Verify your account')]"))));
		assertNotNull(webelement);
		
		
		
	}*/
/*	@Test
	public void no_user_and_password() {
		fail("Not yet implemented");
	}
	
	@Test
	public void correct_user_and_password() {
		fail("Not yet implemented");
	} */
	

}
