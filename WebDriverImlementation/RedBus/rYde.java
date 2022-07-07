package RedBus;


	import java.time.Duration;
	import java.util.ArrayList;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class rYde {

		
			
			public static void main(String[] args) throws InterruptedException {
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\ARMALVE\\Desktop\\selenium\\selenum jars\\chromedriver_win32\\chromedriver.exe");

				    WebDriver driver= new ChromeDriver();

				    String baseUrl = "https://www.redbus.in";
	      
				    driver.get(baseUrl);
	                driver.manage().window().maximize();
				    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				 String Title=driver.getTitle();

				    driver.findElement(By.xpath("//a[@id='rYde']")).click();
				    Thread.sleep(5000);
				    
				    JavascriptExecutor js = (JavascriptExecutor) driver;
				    js.executeScript("window.scrollBy(0,1000)");
				    Thread.sleep(3000);
				    
				    driver.findElement(By.xpath("//div[@class='pxN9k9aJQ1YpCFHwut4K'][2]")).click();
				    String oldTab = driver.getWindowHandle();
					 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
					    newTab.remove(oldTab);
					    // change focus to new tab
					    driver.switchTo().window(newTab.get(0));
					    Thread.sleep(3000);
					    
					    JavascriptExecutor js1 = (JavascriptExecutor) driver;
					    js1.executeScript("window.scrollBy(0,700)");
					    Thread.sleep(3000);
					    driver.findElement(By.xpath("//div[@class='hireButtonText'][1]")).click();	
					    
			}
	}


