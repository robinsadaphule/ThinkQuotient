package Morning;

import java.awt.Toolkit;
import java.util.List;
import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayy {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
List<WebElement> all_elements = driver.findElements(By.xpath("//ul[@id='menu-footer-menu']"));
		
		for(WebElement element:all_elements)
			System.out.println(element.getText());
		Toolkit.getDefaultToolkit().beep();
}
}

