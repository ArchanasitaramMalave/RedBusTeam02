package rYdePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Getbestprice {

		 
		WebDriver driver;
		By gbp = By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]");
		 
		public Getbestprice(WebDriver driver) {
			
			this.driver = driver;
		}
		
			 public void clickGetbestprice(){
		        driver.findElement(gbp).click();
		        }
		 
		 
	}