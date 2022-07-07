package rYdePOM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	


	public class TestrYde{
		String driverPath = "C:\\Users\\ARMALVE\\Desktop\\selenium\\selenum jars\\chromedriver_win32\\chromedriver.exe";
	    WebDriver driver;
	    Home objryde;
	    SUV objSUV;
	    Getbestprice objgbp;
	   
	 

	    @BeforeTest
	    public void setup(){
	    System.setProperty("webdriver.chrome.driver", driverPath);
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://www.redbus.in/");
	        System.out.println(driver.getTitle());
	    }

	    @Test
	    public void test_Correct() throws Throwable{
	    	
	    
	    	//Create Object Of Home
	    	objryde = new Home(driver);
	    	objryde.clickHome();	
	    	Thread.sleep(2000);
	   
	    //	WebElement.element = driver.findElement(By.xpath("//div[contains(text(),'Vehicles you can book')]"));
	    //	Point loc = Element.getLocation();
	    //	JavascriptExecutor js = (JavascriptExecutor) driver;
	    //	js.executeScript("window.scrollBy" + loc);
	    //	((JavascriptExecutor)driver).executeAsyncScript("window.scrollBy(0,100)");
	    //	((JavascriptExecutor)driver).executeAsyncScript("window.scrollBy(1000,1000)");
	    	
	      //Create Object Of SUV
	    	objSUV = new SUV(driver);
	    	objSUV.clickSUV();
	    	  JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("window.scrollBy(0,1000)");
	    	Thread.sleep(2000);
	    
	     //Create Object of Get best price
	    objgbp = new Getbestprice(driver);
	    objgbp.clickGetbestprice();
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
	    	
	    }
	}
