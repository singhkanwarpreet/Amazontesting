import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_wishlist {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca/hz/wishlist/friends/ref=cm_wl_your_friends_redirect_from_gurupa");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kpsmehta2@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("@Kanwar123");
    	
    	Thread.sleep(1000);
    	
    	
    	
    	driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    	
    	
    	
    	

	}

}
