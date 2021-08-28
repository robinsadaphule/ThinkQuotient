package Morning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	List<WebElement> allrows = table.findElements(By.tagName("tr"));
	System.out.println("Totals no of rows: "+ allrows.size());
	int i =0;
	for(WebElement element: allrows) {
		
		List<WebElement> eachcolumn = element.findElements(By.tagName("td"));
		i++;
		System.out.println("no of columns in rows no:" +i+ " are:" + eachcolumn.size());
		for(WebElement column: eachcolumn) {
			System.out.println("|" +column.getText());
			
		}
			System.out.println(" ");
			
	}
	}
}
	
	
	
	
