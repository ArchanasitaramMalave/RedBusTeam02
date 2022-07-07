package stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import framework.ReusableLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.RedbusPages;

public class RedbusSteps extends ReusableLibrary {

	RedbusPages rPages=PageFactory.initElements(driver, RedbusPages.class);
	
	@Given("Launch the Redbus Application")
	public void launchRedbusApplication() throws Exception
	{
		actionsUtil.launchApplication(properties.getApplicationURL());
	}
	
	@Then("Enter From City as {string}")
	public void enterFromCity(String fromCity) throws Exception
	{
		rPages.enterSourceCity(fromCity);
	}
	
	@Then("Enter To City as {string}")
	public void enterToCity(String toCity) throws Exception
	{
		rPages.enterDestinationCity(toCity);
	}
	
	@Then("Search for the Buses")
	public void searchForBuses() throws Exception
	{
		rPages.selectJourneyDate();
		rPages.clickOnSearchBuses();
	}
	
	@Then("Select The Seats")
	public void selectSeats() throws Exception
	{
		rPages.closePrimoPopUp();
		rPages.clickOnViewSeats();
		rPages.selectSeats();
	}
	
	@Then("Select the PickUp Point")
	public void selectPickUpPoint() throws Exception
	{
		rPages.selectPickUpPoint();
	}
	
	@Then("Select the Drop Point")
	public void selectDropPoint() throws Exception
	{
		rPages.selectDropPoint();
	}
	
	@Then("Proceed To Booking and enter the Details")
	public void proceedToBooking() throws Exception
	{
		rPages.clickOnProceedToBook();
		rPages.enterName();
		rPages.enterAge();
		rPages.enterEmailID();
		rPages.enterPhoneNumber();
	}
	
}
