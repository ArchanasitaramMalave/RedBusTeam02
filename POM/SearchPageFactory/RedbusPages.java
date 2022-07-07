package pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import framework.ReusableLibrary;
import framework.SuiteUtil;

public class RedbusPages extends ReusableLibrary {

	@FindBy(xpath = "//input[@data-message='Please enter a source city']")
	private WebElement txt_SourceCity;
	
	@FindBy(xpath = "//input[@data-message='Please enter a destination city']")
	private WebElement txt_DestinationCity;

	@FindBy(xpath = "//label[normalize-space(text())='Onward Date']")
	private WebElement fld_OnwardDate;

	@FindBy(xpath = "//tr[@class='rb-monthHeader']/following-sibling::tr/td[text()='8']")
	private List<WebElement> fld_SelectDate;
	
	@FindBy(xpath = "//button[normalize-space(text())='Search Buses']")
	private WebElement btn_SearchBuses;

	@FindBy(css = ".close-primo")
	private WebElement btn_ClosePrimoPopUp;

	@FindBy(css = ".close-primo")
	private List<WebElement> btn_ClosePrimoPopUp_Presence;

	@FindBy(xpath = "//label[normalize-space(text())='AC']")
	private WebElement cbx_AC;
	
	@FindBy(xpath = "//canvas[@data-type='lower']")
	private WebElement canvas_SelectSeats;
	
	@FindBy(xpath = "//div[normalize-space(text())='View Seats']")
	private WebElement btn_ViewSeats;
	
	@FindBy(xpath = "//ul[@data-value='bp']/li")
	private List<WebElement> rbn_PickUpBtn;
	
	@FindBy(xpath = "//ul[@data-value='dp']/li")
	private List<WebElement> rbn_DropBtn;
	
	@FindBy(xpath = "//button[normalize-space(text())='Proceed to book']")
	private WebElement btn_ProceedToBook;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement txt_Name;
	
	@FindBy(xpath = "//input[@placeholder='Age']")
	private WebElement txt_Age;
	
	@FindBy(xpath = "//input[@placeholder='Email ID']")
	private WebElement txt_EmailID;
	
	@FindBy(xpath = "//input[@placeholder='Phone']")
	private WebElement txt_PhoneNumber;
	
	@FindBy(xpath = "//div[normalize-space(@class)='gender_position_rel']")
	private List<WebElement> rbn_Genders;
	
	/**********************************************************************************************/
	
	public void enterSourceCity(String sourceCity) throws Exception
	{
		actionsUtil.enterText(txt_SourceCity, sourceCity);
	}
	
	public void enterDestinationCity(String destinationCity) throws Exception
	{
		actionsUtil.enterText(txt_DestinationCity, destinationCity);
		actionsUtil.pressEnterKey(txt_DestinationCity);
	}
	
	public void selectJourneyDate() throws Exception
	{
		actionsUtil.applySleep(2);
		actionsUtil.clickOnElement(fld_SelectDate.get(fld_SelectDate.size()-1));
	}
	
	public void clickOnSearchBuses() throws Exception
	{
		actionsUtil.clickOnElement(btn_SearchBuses); 
	}
	
	public void closePrimoPopUp() throws Exception
	{
		actionsUtil.applySleep(3);
		
		while(actionsUtil.getTotalListOfElements(btn_ClosePrimoPopUp_Presence)==0)
		{
			actionsUtil.applySleep(5);
		}
		
		if(actionsUtil.getTotalListOfElements(btn_ClosePrimoPopUp_Presence)!=0)
		actionsUtil.clickOnElement(btn_ClosePrimoPopUp);
	}
	
	public void clickOnViewSeats() throws Exception
	{
		actionsUtil.clickOnElement(btn_ViewSeats);
	}
	
	public void selectSeats() throws Exception
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(canvas_SelectSeats,150,200).click().build().perform();
	}
	
	public void selectPickUpPoint() throws Exception
	{
		int size=actionsUtil.getTotalListOfElements(rbn_PickUpBtn);
		
		actionsUtil.clickOnElement(rbn_PickUpBtn.get(ThreadLocalRandom.current().nextInt(size-1)));
	}
	
	public void selectDropPoint() throws Exception
	{
		int size=actionsUtil.getTotalListOfElements(rbn_DropBtn);
		
		actionsUtil.clickOnElement(rbn_DropBtn.get(ThreadLocalRandom.current().nextInt(size-1)));
	}
	
	public void clickOnProceedToBook() throws Exception
	{
		actionsUtil.clickOnElement(btn_ProceedToBook);
	}
	
	public void enterName() throws Exception
	{
		actionsUtil.enterText(txt_Name, faker.name().firstName());
	}
	
	public void enterAge() throws Exception
	{
		actionsUtil.enterText(txt_Age, "26");
	}
	
	public void enterPhoneNumber() throws Exception
	{
		actionsUtil.enterText(txt_PhoneNumber, SuiteUtil.getRandomNumbers(10));
	}
	
	public void enterEmailID() throws Exception
	{
		actionsUtil.enterText(txt_EmailID, faker.name().firstName()+"@gmail.com");
	}
	
	public void selectGender() throws Exception
	{
		actionsUtil.clickOnElement(rbn_Genders.get(ThreadLocalRandom.current().nextInt(rbn_Genders.size()-1)));
	}
	
}
