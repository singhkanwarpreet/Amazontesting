import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Add_Wishlist {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("apple airpods pro");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/span/a/div/img")).click();
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, 500)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"wishListMainButton-announce\"]")).click();

	}

}
