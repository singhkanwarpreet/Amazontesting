import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cash_locator {

	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
        driver.get("https://amz.run/465w");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
       
        
        driver.findElement(By.xpath("//*[@id=\"postal_code\"]")).sendKeys("Montreal");
        driver.findElement(By.xpath("//*[@id=\"ml_form_wrapper11031\"]/div[6]/input[2]")).click();
        

	}

}
