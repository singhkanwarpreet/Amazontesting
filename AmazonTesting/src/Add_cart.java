import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_cart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("apple airpods pro");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/span/a/div/img")).click();
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage-announce\"]")).click();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		

	}

}
