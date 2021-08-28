package Morning;

// Print table div - class="hmnseindicestable" https://money.rediff.com/index.html

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffdivtable {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		
	WebElement table = driver.findElement(By.xpath("//div[@class='hmnseindicestable']"));

	List<WebElement> allrows = table.findElements(By.xpath("//div[@class='hmnseindicestable']"));
	System.out.println("Totals no of rows: "+ allrows.size());
	int i =0;
	for(WebElement element: allrows)
		
		System.out.println("|" +element.getText());
	
			
			
			driver.close();
	}
	}
