/*package cucumber.features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.testng.AssertJUnit.assertTrue;

public class EbayStepDefinitionsWithParameters {

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

	@When("^I navigate to \"([^\"]*)\" page$")
	public void i_navigate_to_page(String link) throws Throwable {
		webDriver.findElement(By.xpath("//a[text()='"+link+"']")).click();
	     
	}

	@Then("^I check contents of the \"([^\"]*)\" page$")
	public void i_check_contents_of_the_page(String title) throws Throwable {
		assertTrue(webDriver.getTitle().contains(title));
	     

	}
	@And("^close the browser$")
	public void i_check_contents_of_the_motor_page() throws Throwable {
		
		webDriver.close();
	    
	}
	

}
*/