package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PharmEasySearchproduct {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		WebElement txtbox= driver.findElement(By.xpath("//div[@class='_3lNKn _37CeV']"));
		act.moveToElement(txtbox).click().sendKeys("protinex").build().perform();
		
		
		driver.findElement(By.xpath("//div[@class='_2tdEn _1pXi6 _1gc6o undefined']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//h1[@xpath='2']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		act.moveToElement(txtbox).build().perform();
		
		
		
		
	
	}
	

}
