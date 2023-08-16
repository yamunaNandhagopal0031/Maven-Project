package nykaaOrders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HairOil {
	//static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException  { 
		//static private void BrowserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91877\\eclipse-workspace\\Mini_Project\\Mini driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(1000);
		WebElement element= driver.findElement(By.xpath("//a[text()='nykaa fashion']"));//Mouse over
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Toys & Games']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		JavascriptExecutor js =(JavascriptExecutor) driver;//add to cast for convert its size
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Motorcycle Stem Toy']")).click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[text()='Add to Bag']")).click();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[text()='Fast Fun Blokus']")).click();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[text()='Add to Bag']")).click();
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//WebElement elementInsideIframe = driver.findElement(By.xpath("//button[text()='Add to Bag']")); // Locate the desired element inside the iframe
		//elementInsideIframe.click();
		Thread.sleep(3000);
		WebElement sw = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to Bag']")));
		//WebElement sw =driver.findElement(By.xpath("//button[text()='Add to Bag']"));
		//driver.switchTo().frame(sw);
		sw.click();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*Alert alert=driver.switchTo().alert();
		
		String textonalert=alert.getText();
		System.out.println(textonalert);
		alert.dismiss();*/
		
		//driver.findElement(By.xpath("//a[@aria-label='tip tile']")).click();
		
		//Thread.sleep(1000);
		
		
		//js.executeScript("argument[0].scrollIntoView();",unitilThisscroll);//
		//Thread.sleep(1000);
		
      
		
		
		
		//driver.findElement(By.xpath("//button[text()='Add to Bag']")).click();
		//driver.findElement(By.xpath("//button[text()='View bag']")).click();
		//js.executeScript("window.scrollBy(0,900)");
		//driver.findElement(By.xpath("//button[text()='Proceed to Buy']")).click();
		
		
		
		
		
//		driver.findElement(By.xpath("//button[text()='Sign in']")).click();//SIGN IN
//		driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']")).click();//SIGN IN WITH MOBILE NUMBER
//	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement emailid=driver.findElement(By.name("emailMobile"));
//		emailid.click();
//		
//		 emailid.sendKeys("yamuna0031@gmail.com");
//		 driver.findElement(By.id("submitVerification")).click();
//		 WebElement OTP =driver.findElement(By.xpath("//button[text()='send otp to email']"));
//	     OTP.click();
//	     
//	    
		/*public static void main(String[] args) throws InterruptedException { 
			BrowserLaunch();
			 confirmalert();*/
		
		
		
		
}
	

}
