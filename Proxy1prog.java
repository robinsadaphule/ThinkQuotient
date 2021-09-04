package Morning;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Proxy1prog {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Selinum\\FireFox Driver\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
	Proxy proxy = new Proxy();
	//Adding the desired host and port for the http, ssl, and ftp Proxy Servers respectively
	proxy.setHttpProxy("127.0.0.1:5000");
	proxy.setSslProxy("127.0.0.1:5001");
	//proxy.setSslProxy("127.0.0.1:5002");
	//proxy.setFtpProxy("127.0.0.1:5003");
	FirefoxOptions options = new FirefoxOptions();
	options.setCapability("proxy", proxy);
	//Calling new Firefox profile for test
	WebDriver driver = new FirefoxDriver(options);
	driver.get("https://www.browserstack.com/");
	driver.manage().window().maximize();
	//driver.quit();
	}
	}
