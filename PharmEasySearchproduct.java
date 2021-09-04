package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PharmEasySearchproduct {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		WebElement txtbox= driver.findElement(By.xpath("//div[@class='_3lNKn _37CeV']"));
		act.moveToElement(txtbox).click().sendKeys("Horlicks Women Plus").build().perform();
		System.out.println("Type Product Name ");
		act.moveToElement(txtbox).build().perform();
		
		
		WebElement selectsearchbar= driver.findElement(By.xpath("//div[@class='_2tdEn _1pXi6 _1gc6o undefined']"));
		act.moveToElement(selectsearchbar).click().build().perform();
		Thread.sleep(2000);
		
		WebElement selectProduct= driver.findElement(By.xpath("(//div[@role='menuitem'])[1]"));
		act.moveToElement(selectProduct).click().build().perform();
		System.out.println("First Product Selected:  "+selectProduct.getText());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='RLf9m']")).click();
		//Thread.sleep(2000);
		 
		WebElement addtocart= driver.findElement(By.xpath("(//div[@class='_3C1Hw' ])[1]"));
		act.moveToElement(addtocart).click().build().perform();
		System.out.println("Clicked to Cart ");
	    Thread.sleep(2000);
		
	    WebElement selectquantity= driver.findElement(By.xpath("//ul[@role='listbox']/li[3]"));
	    act.moveToElement(selectquantity).click().build().perform();
	    System.out.println("Quantity Selected Added To Cart");
	    Thread.sleep(4000);
	    
	    
	    
	  //  WebElement TotalAmount= driver.findElement(By.xpath("//div[@class='_1JkCV']"));
	  //  act.moveToElement(TotalAmount).build().perform();
	 //   System.out.println("Total Amount of Product:-- ");
	  //div[@class='_1JkCV']

		driver.close();
		
		
		
		
	
	}
	

}
