package rYdePOM;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver;
	By ryde = By.xpath("//a[@id='rYde']");
	 
	public Home(WebDriver driver) {
		
		this.driver = driver;
	}
	
	 public void clickHome(){
	        driver.findElement(ryde).click();
	        }
	 
	
}
