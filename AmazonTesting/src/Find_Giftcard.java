import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Giftcard {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://amz.run/45RR");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kpsmehta2@gmail.com");
		
		Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("@Kanwar123");
    	
    	Thread.sleep(1000);
    	
    	
    	
    	driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    	Thread.sleep(1000);    	
    	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
    	driver.findElement(By.xpath("//*[@id=\"contentGrid_414299\"]/div/div/div[2]/div/div/a/img")).click();
    	
    	driver.findElement(By.xpath("//*[@id=\"gc-customization-type-button-Designs\"]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"gc-order-form-recipients\"]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.id("gc-buy-box-bn")).click();

	}

}
