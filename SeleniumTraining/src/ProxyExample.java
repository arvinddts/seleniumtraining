import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ProxyExample {
	
	
	public static DesiredCapabilities addProxyCapabilities(DesiredCapabilities capability, String httpProxy, String sslProxy,
            String ftpProxy) {
        Proxy proxy = new Proxy();
        proxy.setProxyType(ProxyType.MANUAL);
        proxy.setHttpProxy(httpProxy);
        proxy.setSslProxy(sslProxy);
        proxy.setFtpProxy(ftpProxy);
 
        capability.setCapability(CapabilityType.PROXY, proxy);
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return capability;
    }

	public static void main(String[] args) {
		 String httpProxy = "10.10.1.3:8080";
	        String sslProxy = "10.10.1.3:8080";
	        String ftpProxy = "10.10.1.3:8080";
	 
	        DesiredCapabilities capability = new DesiredCapabilities();
	        addProxyCapabilities(capability, httpProxy, sslProxy, ftpProxy);
	        WebDriver driver = new FirefoxDriver(capability);
            driver.get("https://news.google.com");
            driver.close();

	}

}
