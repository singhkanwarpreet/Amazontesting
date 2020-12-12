import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class typingInTextBox {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		
    	ChromeDriver driver=new ChromeDriver();
    	
    	driver.get("https://amz.run/45Wq");
    	
    	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
    	   	    	
    	driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/input[1]")).sendKeys("wedding");
    	
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/button")).click();
    	Thread.sleep(1000);
    	
    	driver.get("https://amz.run/45Wq");
    	
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/input[1]")).sendKeys("bridal");
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/button")).click();


	}

}
