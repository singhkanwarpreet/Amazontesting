import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchWebsite {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://amazon.ca/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.close();

	}

}
