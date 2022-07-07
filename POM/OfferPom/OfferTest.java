package OfferPom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OfferTest {

	 public static void main(String[] args) throws AWTException, InterruptedException {
		 String driverPath = "C:\\Users\\ARMALVE\\Desktop\\selenium\\selenum jars\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", driverPath);
	      
			
			WebDriver driver;
			
			// TODO Auto-generated method stub
			
			
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://www.redbus.in/");
	Offer o=new Offer(driver);
	o.custName("shivamogga");
	Robot r=new Robot();
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	o.destination("bengaluru");
	 r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_TAB);
	o.datesselect();
	o.offersclick();
	String oldTab = driver.getWindowHandle();
	ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	newTab.remove(oldTab);
	// change focus to new tab
	driver.switchTo().window(newTab.get(0));
	o.offerclose();
	Actions act=new Actions(driver);
	WebElement ele2=driver.findElement(By.xpath("//span[.=' Save up to Rs 300 on bus tickets']"));
	act.moveToElement(ele2).build().perform();
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(oldTab);






		}

	}

