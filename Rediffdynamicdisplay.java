package Morning;

//for fisssplaying hole list we getText()
//rediff program for displaying movie hole lists 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdynamicdisplay {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
	driver.manage().window().maximize();
	WebElement movie = driver.findElement(By.xpath("//div[@class='secstorybox movies']"));
	List<WebElement> links= movie.findElements(By.tagName("a"));
	for(int i=0; i< links.size(); i++)
	{
		System.out.println(links.get(i).getText());
		

	}
	movie.getText();
	
	
Thread.sleep(2000);
	
driver.close();
	}
}
