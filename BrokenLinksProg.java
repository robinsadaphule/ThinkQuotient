package Morning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksProg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selinum\\\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.lightning-systems.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("No of Links:  " +links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement Element1=links.get(i);
			String url=Element1.getAttribute("href");
			verifyLinks(url);
			
		}
		driver.quit();
	}
	public static void verifyLinks(String linkUrl) 
    {
        try
        {
            URL url = new URL(linkUrl);

            
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
           // System.out.println("Before if loop");
            if(httpURLConnect.getResponseCode()>=400)
            {
            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }    
       
            else
            {
            	//System.out.println("Inside  else");
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }
        catch(IOException e) 
        {
        	System.out.println("Inside  Esception "+linkUrl);
        }
    }    
}

	
	