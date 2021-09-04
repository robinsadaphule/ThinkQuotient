package homework;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class PharmEasyMainclass {
	
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
		{
	
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		searchproduct();
		//input string as a parameter 
		clickproduct();
		addtocart(); 
		productTotalprice();
		
		}
		public static void searchproduct() throws InterruptedException
		{
	
			
			Actions act=new Actions(driver);
			
			WebElement txtbox= driver.findElement(By.xpath("//div[@class='_3lNKn _37CeV']"));
			act.moveToElement(txtbox).click().sendKeys("Horlicks Women Plus").build().perform();
			System.out.println("Type Product Name ");
			act.moveToElement(txtbox).build().perform();
			Thread.sleep(2000);

			WebElement selectsearchbar= driver.findElement(By.xpath("//div[@class='_2tdEn _1pXi6 _1gc6o undefined']"));
			act.moveToElement(selectsearchbar).click().build().perform();
			Thread.sleep(2000);
	
	
		}
		public static void clickproduct() throws InterruptedException{
			
			Actions act=new Actions(driver);
			WebElement selectProduct= driver.findElement(By.xpath("(//div[@role='menuitem'])[1]"));
			act.moveToElement(selectProduct).click().build().perform();
			System.out.println("First Product Selected:  "+selectProduct.getText());
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@class='RLf9m']")).click();
}
		public static void addtocart() throws InterruptedException
		{
			
			Actions act=new Actions(driver);
			WebElement addtocart= driver.findElement(By.xpath("(//div[@class='_3C1Hw' ])[1]"));
			act.moveToElement(addtocart).click().build().perform();
			System.out.println("Clicked to Cart ");
		    Thread.sleep(2000);
			
		    WebElement selectquantity= driver.findElement(By.xpath("//ul[@role='listbox']/li[3]"));
		    act.moveToElement(selectquantity).click().build().perform();
		    System.out.println("Quantity Selected Added To Cart");
		    Thread.sleep(4000);
		    
		    WebElement clickcartitem= driver.findElement(By.xpath(" //span[contains(text(),'Cart')]"));
		    act.moveToElement(clickcartitem).click().build().perform();
		    System.out.println("Clicked to Cart");
		    Thread.sleep(3000);
		  
		}
		public static void productTotalprice() throws InterruptedException
		{
			//Actions act=new Actions(driver);
			
			//driver.findElement(By.xpath("//div[@id='content']")).click();
			//WebElement productTotalprice= driver.findElement(By.xpath("(//div/span[@class='_20o4q _2cMvl'])[1]"));
			//act.moveToElement(productTotalprice).build().perform();
			
		//	driver.findElement(By.xpath("(//div[text()='Amount to be paid'])[2]/parent::div/following-sibling::div/span")).getText();
			
			String ih=driver.findElement(By.xpath("//div[text()='Amount to be paid']/parent::div/following-sibling::div/span")).getAttribute("innerHTML");
			System.out.println("Total Amount to be paid:"+ih);
			//div[text()='Amount to be paid']/parent::div/following-sibling::div/span
			
			//String txt = driver.switchTo().alert().getText();
             //	System.out.println("The text is - " +txt);      	
		   
			//System.out.println("Total Amount to be paid:-- " );
			
			//(//div/span[@class='_20o4q _2cMvl'])[1]
			//div[@id='content']
			//(//div[@class='_2shf9 _1PIX0 _2cMvl _3gpQk'])[1]
			//(//span[@class='_20o4q _2cMvl'])[2]
		}
}