package Morning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolsDemoWebsite {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoqa.com/tool-tips/");
		driver.manage().window().maximize();
		
		WebElement button;
		
		button=driver.findElement(By.id("toolTipButton"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(button).build().perform();
		System.out.println("Toolkit Button " +button.getText());
		Thread.sleep(2000);
		
	WebElement textfiled=driver.findElement(By.xpath("//input[@type='text']"));
		act.moveToElement(textfiled).click().sendKeys("Hello world").build().perform();
			act.moveToElement(textfiled).build().perform();
			System.out.println("Code Ended");
				
		

}
}