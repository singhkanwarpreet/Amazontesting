import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class clickonwebelement {

	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElementById("nav-hamburger-menu").click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[3]/li[5]/a")).click();

	}

}
