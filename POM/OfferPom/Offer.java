package OfferPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Offer {
	WebDriver driver;
	
	public Offer(WebDriver driver) {
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using ="src")
	@CacheLookup
	WebElement src;
	@FindBy(how = How.ID, using ="dest")
	@CacheLookup
	WebElement dest;
	@FindBy(how = How.XPATH, using ="//td[@class='wd day']")
	@CacheLookup
	WebElement dates;
	@FindBy(how = How.XPATH, using ="//span[@class='offer-img'][1]")
	@CacheLookup
	WebElement offs;
	@FindBy(how = How.ID, using ="offerClose")
	@CacheLookup
	WebElement offerclose;
	@FindBy(how = How.XPATH, using ="//span[.=' Save up to Rs 300 on bus tickets']")
	@CacheLookup
	WebElement savetickets;
	

	
	public void custName(String from) {
		src.sendKeys(from);
		
	}
	public void destination(String to) {
		dest.sendKeys(to);
	}
	public void datesselect() {
		dates.click();
	}
	public void offersclick() {
		offs.click();
	}
	public void offerclose() {
		offerclose.click();
	}
	public void saveticket() {
		savetickets.click();
	
	
		
	}

	
	}


