import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTable1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/tables");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[text()='Last Name']")).click();
		Thread.sleep(2000);
		List<WebElement> webelements=driver.findElements(By.xpath("//table[@id='table1']/descendant::tr"));		 
		ArrayList<String> name = new ArrayList<String>();
		for(WebElement webelement:webelements)
		{
			List<WebElement> childwebelements = webelement.findElements(By.xpath("td"));			
			if(childwebelements.size()>0)		
			{
			 System.out.println(childwebelements.get(0).getText());	
			 name.add(childwebelements.get(0).getText());		
			}
		}
		System.out.println(name);
 		ArrayList<String> temp= new ArrayList<String>(name);
		Collections.sort(temp);
		System.out.println(temp);
		if(temp.equals(name))
			System.out.println("Sorted");
		else
			System.out.println("Not Sorted");	 
	}

}
