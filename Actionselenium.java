package Morning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionselenium {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		Thread.sleep(2000);
		
		Actions act =  new Actions(driver);
		WebElement src= driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement trgt = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(1000);
		
		WebElement droptext = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		act.doubleClick(droptext).build().perform();   //used for double click
		Thread.sleep(2000);
		
		
	act.dragAndDrop(src, trgt).build().perform(); //used for drag n drop
	Thread.sleep(2000);
	
	act.contextClick(src).build().perform(); // used for right click
	
	System.out.println("End of Prog" );
	Thread.sleep(3000);
	driver.close();
		
		
}
}

