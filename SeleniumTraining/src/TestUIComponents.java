import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUIComponents {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		 WebDriver webDriver = new ChromeDriver();
		/* webDriver.get("http://www.hsbc.com");	
		 webDriver.manage().window().maximize();
		 Thread.sleep(3000);
		 WebElement webElement=webDriver.findElement(By.xpath("//a[contains(@data-linktype,'Retail') and @href]/descendant::span[text()='Select country']"));
		 webElement.click(); */
		 webDriver.get("http://the-internet.herokuapp.com/checkboxes");
		 Thread.sleep(3000);
		 List<WebElement> list=webDriver.findElements(By.xpath("//input"));
		 int i=0;
		 for(WebElement webelement:list)
		 {			 
			 if(i==1)
				 webelement.click();
			 i++;
		 }
	//	 System.out.println(list);
	//	 WebElement webElement=list.get(1);
		/* System.out.println(list.size());
		 
		 for(WebElement webelement:list)
		 {
			 Thread.sleep(1000);
			 webelement.click();
		 } */
		// webElement.click();

	}

}
