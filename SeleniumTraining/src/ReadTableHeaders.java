import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTableHeaders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/arvind/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/tables");
		Thread.sleep(3000);	
		WebElement webElement=driver.findElement(By.xpath("//table[@id='table1']"));
		List<WebElement> tableHeaders=webElement.findElements(By.xpath(".//th"));
		System.out.println(tableHeaders.size());
		for(WebElement header: tableHeaders)
		{
			System.out.println(header.getText());
		}

	}

}
