import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Repository {

	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca/wedding/home?ref_=nav_ListFlyout_wr");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/input[1]")).sendKeys("wedding");
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/button/div/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"wr_search_result_record_0-owner\"]/div/a")).click();

	}

}
