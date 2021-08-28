package Morning;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;


public class BowserChrome {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		
		/*
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		System.out.println("Page URL is :"+driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		
		driver.navigate().to("https://www.yatra.com/");
		driver.navigate().to("https://youtube.com/");
		driver.navigate().back();
		driver.navigate().forward();
		//driver.close();
		
		
		Thread.sleep(1000);
		System.out.println("navigated to -- Title of Page is:"+driver.getTitle());
		System.out.println("Back - Title of  page is"+driver.getTitle());
		System.out.println("Forward - Title of  page is"+driver.getTitle());
		Thread.sleep(3000);
		System.out.println("Forward -- Title of Page is:"+driver.getTitle());
		*/
			//driver.get("")	;
		/*
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Robin Sadaphule");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("robin1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
				*/
		
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("robin");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("sadaphule");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("robinsadaphule@xyz.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Zensar");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("915565656565");
		

		WebElement jt=driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select jobtitle=new Select(jt);
		jobtitle.selectByVisibleText("Sales Manager");
			System.out.println(jt.getText());
		
			WebElement emp=driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
			Select employee=new Select(emp);
			employee.selectByIndex(1);
			Thread.sleep(2000);
			WebElement selectedemp=employee.getFirstSelectedOption();
			System.out.println(selectedemp.getText());
				//System.out.println(emp.getText());
		
			List<WebElement> eopt=employee.getOptions();
			
			for(WebElement el:eopt)
			{
				System.out.println(el.getText());
				System.out.println("Class :"+el.getClass());
				System.out.println("Tag name:"+el.getTagName());
			}
			
			
			
		
		
		System.out.println("Sign Up Page  -- Title of Page is:"+driver.getTitle());
		//driver.findElement(By.xpath("//button[@name='start my free trial']")).click();
			
		driver.close();
	}
	
}
