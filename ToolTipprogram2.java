package Morning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class ToolTipprogram2 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E:\\Selinum\\FireFox Driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bestcssbuttongenerator.com/");
		driver.manage().window().maximize();
		
		WebElement button;
		
		button=driver.findElement(By.xpath("(//div[@class='listPreview'])[1]"));
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(button).build().perform();
		System.out.println("Toolkit Button:  " +button.getText());
		Thread.sleep(3000);
		
		System.out.println("Code Ended");
		driver.quit();
				
		

}
}


