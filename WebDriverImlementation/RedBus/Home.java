package RedBus;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Home {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://www.redbus.in/");
				Thread.sleep(2000);
		   JavascriptExecutor jse = (JavascriptExecutor) driver;
			WebElement location = driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']"));
			jse.executeScript("arguments[0].click()", location);
			Thread.sleep(6000);
			jse.executeScript("window.scrollBy(0,300)");
			//driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();

		}

	}

