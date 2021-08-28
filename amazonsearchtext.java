package Morning;
//amamzon move to element code 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonsearchtext {

	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	driver.get("https://amazon.in");
	driver.manage().window().maximize();
	
	
	Actions act = new Actions(driver);
	//webelement defined for readability
	WebElement move = driver.findElement(By.xpath("//*[@id='nav-link-prime']/span[1]"));
	//moves the mouse over try prime
	//Build and perform are required, in actions since composite steps can be performed
	act.moveToElement(move).build().perform();
	//act.moveToElement(move).contextClick().build().perform();
	Thread.sleep(3000);
	WebElement txtbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	//Entering Hello in capital letters in search text box
	//This is example of composite step - click - hold shift key down and then send keys
	//after all these steps build and perform
	act.moveToElement(txtbox).click().keyDown(Keys.SHIFT).sendKeys("Samsung").build().perform();
	Thread.sleep(2000);
	act.moveToElement(txtbox).doubleClick().build().perform();
	
	
	
	System.out.println("End of Code");
	Thread.sleep(3000);
	driver.close();
	}
	
	
}
