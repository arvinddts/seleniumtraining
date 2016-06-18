package testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class LocalDriverFactory {
    static WebDriver createInstance(String browserName) {
        WebDriver driver = null;
        if (browserName.toLowerCase().contains("firefox")) {
            driver = new FirefoxDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("internet")) {
            driver = new InternetExplorerDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("chrome")) {
        	System.setProperty("webdriver.chrome.driver", "C:/Users/arvind/chromedriver.exe");
            driver = new ChromeDriver();
            return driver;
        }
        return driver;
    }
    
    static WebDriver createInstance(String browserName,String Node,DesiredCapabilities cap) throws MalformedURLException {
        WebDriver driver = null;
        if (browserName.toLowerCase().contains("firefox")) {
        	driver = new RemoteWebDriver(new URL(Node), cap);        	 
            return driver;
        }
        if (browserName.toLowerCase().contains("internet")) {
        	driver = new RemoteWebDriver(new URL(Node), cap);
            return driver;
        }
        if (browserName.toLowerCase().contains("chrome")) {
        	//System.setProperty("webdriver.chrome.driver", "C:/Users/arv/chromedriver.exe");
        	driver = new RemoteWebDriver(new URL(Node), cap);
            return driver;
        }
        return driver;
    }
}
