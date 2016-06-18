import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ActionChainExecutor;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		Thread.sleep(5000);	  
		String filePath = "C:\\Users\\arv\\draganddrop.js";		 
		String source = "#column-a";
		String target = "#column-b";
		StringBuffer buffer = new StringBuffer();
		String line=null;
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		while((line = br.readLine())!=null)
			buffer.append(line);
		br.close();
		String javaScript = buffer.toString();
		String javaScriptAtoB = javaScript + "$('" + source + "').simulateDragDrop({ dropTarget: '" + target + "'});";
		((JavascriptExecutor)driver).executeScript(javaScriptAtoB);
		Thread.sleep(5000);
		String javaScriptBtoA = javaScript + "$('" + target + "').simulateDragDrop({ dropTarget: '" + source + "'});";		 
		((JavascriptExecutor)driver).executeScript(javaScriptBtoA);
		  
 
	     
}
}
