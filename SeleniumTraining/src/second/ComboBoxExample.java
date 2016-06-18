package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComboBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		Thread.sleep(3000);	
		WebElement webelement=driver.findElement(By.id("dropdown"));
		selectComboOption(webelement,"2");

	}

	public static void selectComboOption(WebElement webelement,String optionname)
	{
		Select combo = new Select(webelement);
		List<WebElement> webelements=combo.getOptions();

		for(WebElement comboelement:webelements)
		{			 
			if(comboelement.getText().contains(optionname))
			{
				combo.selectByVisibleText(comboelement.getText());
			}
		}
		
	}

}
