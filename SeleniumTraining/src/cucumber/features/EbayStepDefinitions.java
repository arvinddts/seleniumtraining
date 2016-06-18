/*package cucumber.features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.testng.AssertJUnit.assertTrue;

public class EbayStepDefinitions {

	WebDriver webDriver=null;
	
	@Given("^Iam on home page$")
	public void iam_on_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arvind/chromedriver.exe");
		webDriver= new ChromeDriver();
		webDriver.get("http://www.ebay.com");
		
		// implicit wait
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		webDriver.manage().window().maximize();	
	}

	@When("^I navigate to motor page$")
	public void i_navigate_to_motor_page() throws Throwable {
		webDriver.findElement(By.xpath("//a[text()='Motors']")).click();
		
		
	}	 
	
	@Then("^I check contents of the motor page$")
	public void i_check_contents_of_the_motor_page() throws Throwable {
		
		assertTrue(webDriver.getTitle().contains("Motors"));
	    
	}

	@When("^I navigate to fashion page$")
	public void i_navigate_to_fashion_page() throws Throwable {
		webDriver.findElement(By.xpath("//a[text()='Fashion']")).click();
	     
	}

	@Then("^I check contents of the fashion page$")
	public void i_check_contents_of_the_fashion_page() throws Throwable {
	    
		assertTrue(webDriver.getTitle().contains("Fashion"));
	}

	@When("^I navigate to electronics page$")
	public void i_navigate_to_electronics_page() throws Throwable {
		
		webDriver.findElement(By.xpath("//a[text()='Electronics']")).click();
	   
	}

	@Then("^I check contents of the electronics page$")
	public void i_check_contents_of_the_electronics_page() throws Throwable {
		
		assertTrue(webDriver.getTitle().contains("Electronics"));
	   
	}


	

}
*/