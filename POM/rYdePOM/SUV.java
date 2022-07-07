package rYdePOM;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class SUV {

		 
			WebDriver driver;
			By SUV = By.xpath(" //div[contains(text(),'SUVs')]");
			 
			public SUV(WebDriver driver) {
				
				this.driver = driver;
			}
			
				 public void clickSUV(){
			        driver.findElement(SUV).click();
			        }
			 
			 
		}


