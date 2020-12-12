
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://amz.run/45RJ");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
        
    	
    	
    	
    	driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("kanwar");
    	
    	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kpsmehta@gmail.com");
    	
    	driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("12345678");
    	
    	driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("12345678");
    	
    	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

	}

}





