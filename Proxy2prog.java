package Morning;


import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

//import com.mysql.cj.jdbc.Driver;

// https://stackoverflow.com/questions/45288842/how-to-set-proxy-for-chrome-browser-in-selenium-using-java-code

public class Proxy2prog {

	
	
public static void main(String[] args) {
	//System.setProperty("webdriver.gecko.driver","c://worksoft//gd//geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","c://worksoft//chromedriver//chromedriver.exe");	


String proxy = "127.0.0.1:5000";
ChromeOptions options = new ChromeOptions().addArguments("--proxy-server=http://" + proxy);
WebDriver driver = new ChromeDriver(options);
//WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in/");

}


}
