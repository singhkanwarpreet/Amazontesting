import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Update_Profile {

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
		
		
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a/div/div/div/div[2]/h2")).click();
		driver.findElement(By.xpath("//*[@id=\"auth-cnep-edit-name-button\"]")).click();
		driver.findElement(By.id("ap_customer_name")).clear();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Kanwarpreet");
		driver.findElement(By.id("cnep_1C_submit_button")).click();

	}

}
