package Morning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitImplicitload {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
	
	driver.findElement(By.xpath("//h4[contains(text(),'Hello World')]")).click();
	
	System.out.println("End of code");
	
//	driver.findElement(By.)

}
}