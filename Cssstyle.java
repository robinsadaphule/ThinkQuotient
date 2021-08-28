package Morning;

import java.awt.Toolkit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssstyle {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
	
		WebElement firstname =driver.findElement(By.cssSelector("input[id='username']"));
		firstname.sendKeys("Robin");
		

		WebElement paswrd =driver.findElement(By.cssSelector("input[id*='password']"));
		paswrd.sendKeys("Robin");
		
		

}
}

