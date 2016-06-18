/*package cucumber.features;

import static org.testng.AssertJUnit.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbayStepDefinitionsWithOutline {

WebDriver webDriver=null;

	@Before
	public void lauchBrowser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arvind/chromedriver.exe");
		webDriver= new ChromeDriver();
	}
	
	
	@Given("^Iam on home page$")
	public void iam_on_home_page() throws Throwable {		
		webDriver.get("http://www.ebay.com");		
		// implicit wait
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		webDriver.manage().window().maximize();	
	}
	
	@When("^I navigate to ([^\"]*) page$")
	public void i_navigate_to_page(String link) throws Throwable {
		webDriver.findElement(By.xpath("//a[text()='"+link+"']")).click();
	     
	}

	@Then("^I check contents of the ([^\"]*) page$")
	public void i_check_contents_of_the_page(String title) throws Throwable {
		assertTrue(webDriver.getTitle().contains(title));
	     

	}
	
	@After
	public void close_the_browser() throws Throwable {		
		webDriver.close();
	    
	}
}
*/