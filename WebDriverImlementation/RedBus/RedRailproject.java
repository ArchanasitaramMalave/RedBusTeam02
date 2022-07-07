package RedBus;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.zeromq.ZStar.Set;

import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.google.errorprone.annotations.Var;
import com.graphbuilder.math.func.AbsFunction;

import graphql.Assert;

public class RedRailproject {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ARMALVE\\Desktop\\selenium\\selenum jars\\chromedriver_win32\\chromedriver.exe");

		    WebDriver driver= new ChromeDriver();

		    String baseUrl = "https://www.redbus.in/";

		    driver.get(baseUrl);

		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 String Title=driver.getTitle();

		    System.out.println("The title of the page is "+Title);
             String url=driver.getCurrentUrl();
             System.out.println("The URL of the page is "+url);
             driver.findElement(By.xpath("//a[@id='rYde']")).click();
             WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		    
		    driver.navigate().forward(); 
		    driver.findElement(By.xpath("//body/div[@id='reactContentMount']/div[1]/div[5]/div[1]/div[1]/div[3]/div[1]/div[1]")).click();
		    //String alertMsg = driver.switchTo().outstationtrip().getText();
		    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='OutstationMount']/div[2]")));
		    // click on the compose button as soon as the "compose" button is visible
		    WebElement radio1 = driver.findElement(By.xpath("//div[contains(text(),'One Way Trip')]"));
			
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("//body/div[@id='OutstationMount']/div[2]/div[1]/div[1]")).click();
		    driver.navigate().forward();
		  
		    
		    
		    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[4]/div[1]/div[1]")));
		    // click on the compose button as soon as the "compose" button is visible
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[4]/div[1]/div[1]")).click();
		    driver.navigate().forward();
		  
	}
}
