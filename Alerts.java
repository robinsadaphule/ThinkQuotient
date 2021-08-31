package Morning;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Firefox statements below:
	//	System.setProperty("webdriver.gecko.driver","c://worksoft//gd//geckodriver.exe");
	//	WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		String alerttxt;

		alerttxt = driver.switchTo().alert().getText();
		System.out.println(alerttxt);
		//to press the ok button or yes button
		driver.switchTo().alert().accept();
		//for the cancel button or no button
		//driver.switchTo().alert().dismiss();
		
		
		
	}

}
