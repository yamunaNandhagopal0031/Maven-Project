package nykaaOrders;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Perfume {
public static void main(String[] args) throws InterruptedException, AWTException  { 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91877\\eclipse-workspace\\Mini_Project\\Mini driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
	    Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();//SIGN IN
		driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']")).click();//SIGN IN WITH mail NUMBER
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    WebElement emailid=driver.findElement(By.name("emailMobile"));
		emailid.click();
		Thread.sleep(1000);
		emailid.sendKeys("yamuna0031@gmail.com");
		driver.findElement(By.id("submitVerification")).click();
		WebElement OTP =driver.findElement(By.xpath("//button[text()='send otp to email']"));
	    OTP.click();
	    
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    WebElement w =driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
	    w.click();
	    Thread.sleep(1000);
	    w.sendKeys("Renee Cosmetics Bloom Perfume");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(1000);
	  
	    driver.findElement(By.xpath("//div[text()='Renee Cosmetics Bloom Perfume']")).click();
	    String winHandle=driver.getWindowHandle();
	    for(String Windhand :driver.getWindowHandles()) {
	    	driver.switchTo().window(Windhand);
	    	
	    }
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	
	    JavascriptExecutor jj =(JavascriptExecutor) driver;
	    jj.executeScript("window.scrollBy(0,300)");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
	    String WH =driver.getWindowHandle();
	    for(String Winhand :driver.getWindowHandles()) {
	    	driver.switchTo().window(Winhand);
	    }
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[text()='1']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
       String WHw =driver.getWindowHandle();
	    for(String Winhand :driver.getWindowHandles()) {	
	    	driver.switchTo().window(Winhand);
	    }
      driver.switchTo().frame(0);
    		   driver.findElement(By.xpath("//span[text()='Proceed']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("(//button[text()='Deliver here'])[1]")).click();
      
        jj.executeScript("window.scrollBy(0,300)");
    
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//p[text()='Google Pay, PhonePe, Paytm & more']")).click();
        WebElement e =driver.findElement(By.xpath("//input[@placeholder='Enter UPI ID']"));
        e.click();
        e.sendKeys("yamuna000okokicici");
}      
}
