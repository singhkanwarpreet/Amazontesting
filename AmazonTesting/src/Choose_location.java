import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Choose_location {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		
    	ChromeDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.amazon.ca/");
    	
    	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")).click();
    	
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput_0\"]")).sendKeys("H4L3N1");
    	
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input")).click();

	}

}
