import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTable
{
	static ArrayList<String> names= new ArrayList<String>();
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/tables");
		Thread.sleep(3000);	
		List<WebElement> webelements=driver.findElements(By.xpath("//*[@id='table2']//*/tr"));
		List<WebElement> tdelements=null;

		for(WebElement webelement:webelements)
		{
			tdelements=webelement.findElements(By.xpath("td"));
			if(tdelements.size()>0)
			{
				if(tdelements.get(2).getText().equals("jsmith@gmail.com"))				 
				System.out.println(tdelements.get(4).getText());	
			}
		}
		
		
		ArrayList<String> temp= new ArrayList<String>(names);
		Collections.sort(temp);
		System.out.println(temp);
		if(temp.equals(names))
			System.out.println("Sorted");

	}

}
