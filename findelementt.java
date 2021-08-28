package Morning;

import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementt {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		/*
		System.out.println("List of all the image link in the page");
		List<WebElement> all_links = driver.findElements(By.tagName("input"));
		
		int j=all_links.size();
		System.out.println("Total items:"+j);
		
	
		for(WebElement element:all_links)
			System.out.println(element.getText()+"-"+element.getAttribute("outerHTML"));
		
		*/
		
        List<WebElement> all_elements = driver.findElements(By.xpath("//*")); //label
		
		for(WebElement element:all_elements)
			System.out.println(element.getTagName()+" | "+element.getText()+" | "+element.getAttribute("innerHTML"));
		Toolkit.getDefaultToolkit().beep();
		
		
		
		
	}

}
