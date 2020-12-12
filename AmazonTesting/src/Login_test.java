import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login_test {
    public static void main(String[] arg) throws InterruptedException{
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		
    	ChromeDriver driver=new ChromeDriver();
    	
    	driver.get("https://amz.run/45RR");
    	
    	String url=driver.getCurrentUrl();
    	
    	System.out.println("Current URL:" +url);
    	
    	String PageTitle= driver.getTitle();
    	
    	if("Amazon - log in or sign up".equals(PageTitle)) {
    		
    	       System.out.println("Test Case Passed");       
    	}
    	
    	else {
    		
    		System.out.println("Test Case Failed");
    	
    	}
    	
    	
    	
    	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kpsmehta@gmail.com");
    	
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    	
    	Thread.sleep(1000);
    	 	
    	driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("12345678");
    	
    	//Thread.sleep(1000);
    	
    	//driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div/div/div/div[2]/form/div[5]/div/label")).click();
    	
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    	
	}
}
