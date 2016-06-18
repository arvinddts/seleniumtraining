import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableexample {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		 WebDriver webDriver = new ChromeDriver();
		 webDriver.get("http://the-internet.herokuapp.com/tables");
		 Thread.sleep(3000);		 
		
		 List<WebElement> list=webDriver.findElements(By.xpath("//table[@id='table1']/thead/tr/th/span"));
		 
		 int i=0;
	/*	 for(WebElement tableHeader : tableHeaders)
		 {	
			 if(tableHeader.getText().equals("Email"))
			 {				 
				break;
			 }
		 i++; 
		 } 
		 
		 List<WebElement> tableRows=webDriver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));		 
		 for(WebElement tableRow : tableRows)
		 {
			 List<WebElement> tableValues=tableRow.findElements(By.xpath("td"));			  
			 System.out.println(tableValues.get(i).getText());
		 }  */
	}
	public static void getColumns(String headers) throws InterruptedException
	{	 

	}
}
