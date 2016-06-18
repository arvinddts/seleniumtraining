import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelectedComboValue {

	static ChromeDriver driver=null;
	static WebElement webelement=null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
		driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		Thread.sleep(3000);	
		webelement=driver.findElement(By.id("dropdown"));
		selectComboOption(webelement,"1");
		Thread.sleep(3000);
		selectComboOption(webelement,"2");
		
}
	public static void selectComboOption(WebElement webelement,String optionvalue)
	{
		Select combo = new Select(webelement);
		List<WebElement> webelements=combo.getOptions();
		
		for(WebElement comboelement:webelements)
		{
			if(comboelement.getText().contains(optionvalue))
				combo.selectByVisibleText(comboelement.getText());
		}
	}
	
}

	
	