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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Order {
	public static void main(String[] args) throws InterruptedException, AWTException  { 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91877\\eclipse-workspace\\Mini_Project\\Mini driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
	
		/*driver.findElement(By.xpath("//button[text()='Sign in']")).click();//SIGN IN
		driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']")).click();//SIGN IN WITH MOBILE NUMBER
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    WebElement emailid=driver.findElement(By.name("emailMobile"));
		emailid.click();
		emailid.sendKeys("yamuna0031@gmail.com");
		driver.findElement(By.id("submitVerification")).click();
		WebElement OTP =driver.findElement(By.xpath("//button[text()='send otp to email']"));
	    OTP.click();
	    Thread.sleep(1000);*/
	    //driver.findElement(By.xpath("//a[text()='nykaa fashion']")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    WebElement sw = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='nykaa fashion']")));
	    sw.click();
	    
		
	    
	    WebElement element= driver.findElement(By.xpath("//a[text()='Toys & Games']"));//Mouse over
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		element.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement  search =driver.findElement(By.xpath("//input[@placeholder='Search for products, styles, brands']"));
		search.sendKeys("kids clan");
		Thread.sleep(1000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor) driver;//add to cast for convert its size
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[text()='Outdoor and Indoor White Unicorn Tent with Baby Pink Mat']")).click();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  JavascriptExecutor ss =(JavascriptExecutor) driver;
	  ss.executeScript("window.scrollBy(0,1000)");
	  Thread.sleep(3000);
	  System.out.println("hi git Hub");
	  /*WebElement w =driver.findElement(By.xpath("//input[@placeholder='122001']"));
	  w.click();
	  w.sendKeys("600099");
	  
	  driver.findElement(By.xpath("//button[text()='Apply']")).click();
	  

	  
	    //driver.findElement(By.xpath("//button[text()='Add to Bag']"));
	    WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to Bag']")));
	  el.click();*/
		
	    
	     

}
	}
