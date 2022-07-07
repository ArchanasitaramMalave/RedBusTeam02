package RedBus;



import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Offer {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ARMALVE\\Desktop\\selenium\\selenum jars\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://www.redbus.in/");
			driver.findElement(By.id("src")).sendKeys("Shivamogha");
			driver.findElement(By.id("dest")).sendKeys("Bengaluru");
			driver.findElement(By.id("onward_cal")).click();
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,400)");
			 Thread.sleep(3000);
			driver.findElement(By.xpath("//td[text()='7']")).click();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			driver.findElement(By.xpath("//span[@class='offer-img'][1]")).click();
			 Thread.sleep(3000);
			 String oldTab = driver.getWindowHandle();
			 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			    newTab.remove(oldTab);
			    // change focus to new tab
			    driver.switchTo().window(newTab.get(0));
			    driver.findElement(By.id("offerClose")).click();
			   

			    // Do what you want here, you are in the new tab

			  
			    // change focus back to old tab
			    
			    Actions act=new Actions(driver);

			////span[.=' Save up to Rs 300 on bus tickets']
			 WebElement ele2=driver.findElement(By.xpath("//span[.=' Save up to Rs 300 on bus tickets']"));
			 act.moveToElement(ele2).build().perform();
			 Thread.sleep(2000);
			 driver.close();
			 driver.switchTo().window(oldTab);
			 Thread.sleep(2000);
			 
			 /*driver.findElement(By.id("search_btn")).click();
			 Thread.sleep(3000);
			// JavascriptExecutor js=(JavascriptExecutor) driver;
			// js.executeScript("window.scrollBy(0,1000)");
			// Thread.sleep(3000);
			 ////li[@class='bannerTiles fl'][1]
			 driver.manage().window().maximize();
			 Thread.sleep(3000);
			
			WebElement ele = driver.findElement(By.xpath("//label[@title='Before 6 am']"));
			if(ele.isSelected())
				Thread.sleep(2000);
				ele.click();
			//SEATER
			 
			 driver.findElement(By.xpath("//label[@title='After 6 pm']")).click();*/
			 
			// driver.findElement(By.xpath("//li[@class='bannerTiles fl'][1]")).click();
	        // driver.findElement(By.xpath("//div[.='View Seats'][1]")).click();
			 

	      //label[.='Before 6 am']
			
		}

	}