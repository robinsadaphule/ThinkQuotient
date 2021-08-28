package Morning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmailpage {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		
		
		
		WebElement password =driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]"));
		password.sendKeys("Robin123");
		
		WebElement retypepassword =driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]"));
		retypepassword.sendKeys("Robin123");
		
		WebElement email =driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]"));
		email.sendKeys("Robin@xyz.com");
		
		WebElement mobno =driver.findElement(By.xpath("//input[starts-with(@name,'mobno')]"));
		mobno.sendKeys("915645658585");
		
		//driver.findElement(By.xpath("//input[starts-with(@name, 'gender') and @value='m']")).click();
		driver.findElement(By.xpath("//input[starts-with(@name, 'gender') and @value='f']")).click(); 


		
	
	}

	}
	