package RedBus;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchBuses {
	

	public static void main(String []args) throws AWTException, InterruptedException, IOException {
		File src= new File("C:\\Users\\ARMALVE\\javaSdet\\WebdriverProject\\Testresources\\Redbus.property");
	      FileInputStream fis = new FileInputStream(src);

	      Properties prop = new Properties();
	      prop.load(fis);
	
		String url="https://www.redbus.in/";
		int it=0;
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARMALVE\\Desktop\\selenium\\selenum jars\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 FileInputStream fis1 = new 
				 FileInputStream("C:\\Users\\ARMALVE\\Desktop\\selenium\\Data source\\RedbusSearch.xlsx");   
				 	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 	      XSSFWorkbook workbook = new XSSFWorkbook(fis1);
				 	      XSSFSheet ws = workbook.getSheetAt(0);	
				 	        XSSFCell From= ws.getRow(1).getCell(0);
				 	        XSSFCell To= ws.getRow(1).getCell(1);
		 driver.get(url);
		 driver.manage().window().maximize();
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("From")).sendKeys(From.toString());
		 Robot r=new Robot();
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 driver.findElement(By.id(prop.getProperty("To"))).sendKeys(To.toString());
		 Thread.sleep(3000);
		 r.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(prop.getProperty("Date"))).click();
		 Thread.sleep(3000);
		 
		 
	
		 
		  
		 
		 WebElement ele4=driver.findElement(By.xpath(prop.getProperty("Button")));
				 WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		 w.until(ExpectedConditions.visibilityOf(ele4));
		 Thread.sleep(5000);
		  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele4);
		  
		// JavascriptExecutor js=(JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)");
		// Thread.sleep(3000);
		 ////li[@class='bannerTiles fl'][1]
		 
		 Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath(prop.getProperty("Before")));
		if(ele.isSelected())
			Thread.sleep(2000);
			ele.click();
		//SEATER
		 
		 driver.findElement(By.xpath(prop.getProperty("After"))).click();
		 
		 //driver.findElement(By.xpath("//li[@class='bannerTiles fl'][1]")).click();
		 driver.findElement(By.className(prop.getProperty("ViewSeat"))).click();
		
		 
       
                  
                 }

	private static void FileInputStream(String string) {
		// TODO Auto-generated method stub
		
	}
             }
