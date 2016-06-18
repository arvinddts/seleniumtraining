import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import junit.framework.Assert;

public class TestJunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Ignore
	
	@Test
	public void test1() throws InterruptedException {
		SafariDriver driver= new SafariDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.cs.tut.fi/~jkorpela/forms/combo.html");
		Thread.sleep(2000);	
		WebElement webelement=driver.findElement(By.xpath("//a[text()='The simple basis: two independent fields']"));
		assertTrue(webelement!=null && webelement.isDisplayed() );
		
		
	}
	@Test
	public void test2() throws InterruptedException {
		SafariDriver driver= new SafariDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.cs.tut.fi/~jkorpela/forms/combo.html");
		Thread.sleep(2000);	
		WebElement webelement=driver.findElement(By.xpath("//a[text()='Adding client-side check on submit']"));
		assertTrue(webelement!=null && webelement.isDisplayed() );
		
		
	}
	

}
