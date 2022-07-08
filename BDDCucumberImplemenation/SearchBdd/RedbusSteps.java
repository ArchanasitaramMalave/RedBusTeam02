package RedBusBDD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef {

	WebDriver driver;
	

    @Given("^User have search bus on red bus home page$")
    public void User_have_search_bus_on_red_bus_home_page() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARMALVE\\Desktop\\Selenium\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");}
    
 
    @When("^source  User search for a bus withname and destination name and date$")
    public void source_User_search_for_a_bus_withname_and_destination_name_and_date() {
        //driver.get("https://www.redbus.in");
        driver.findElement(By.linkText("D120_search_btn searchBuses ")).click();
    }
 
    @Then("^User able to see buses$")
    public void User_able_to_see_buses() {
        if(driver.getTitle().equalsIgnoreCase(
                 "view buses page")){ 
                    System.out.println("Navigated to view buses page"); 
              } else { 
                 System.out.println("Not on view buses Page :("); 
              } 
    }
        
        
        @Given("^User can apply filters in sort and filter option$")
        public void  User_can_apply_filter_in_sort_and_filter_option() {

           System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKANHE\\Desktop\\Selenium\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
          driver=new ChromeDriver();
            driver.get("https://www.redbus.in/apply filter /");}
     
        @When("^User is select AC filter$")
        public void User_is_select_AC_filter () {
            //driver.get("https://www.redbus.in/view sests/");
            driver.findElement(By.linkText("button view-seats ")).click();
        }
     
        @Then("^User is able to see AC buses$")
        public void User_is_able_to_see_AC_buses() {
            if(driver.getTitle().equalsIgnoreCase(
                     "view seats")){ 
                        System.out.println("Navigated to available seat page"); 
                  } else { 
                     System.out.println("Not on available seat Page :("); 
                  } 
        }
            
            @Given("^User can select available seat$")
            public void User_can_select_available_seat() {

               System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKANHE\\Desktop\\Selenium\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
               driver=new ChromeDriver();
                driver.get("https://www.redbus.in/available seats/");}
         
            @When("^User click on available seat$")
            public void User_click_on_available_seat() {
                //driver.get("https://www.redbus.in/available seats/");
                driver.findElement(By.linkText("clearfix SeatsSelector MB")).click();
            }
         
            @Then("^User navigate to boarding point and dropping point page$")
            public void User_navigate_to_boarding_point_and_dropping_point_page() {
                if(driver.getTitle().equalsIgnoreCase(
                         "select a seat")){ 
                            System.out.println("Navigated to proceed to book"); 
                      } else { 
                         System.out.println("Not on proceed to book  :("); 
                      } 
            }
                @Given("^User have to select boarding point and dropping point$")
                public void User_have_to_select_boarding_point_and_dropping_point() {

                  //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\bdomala\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
                  //  driver=new ChromeDriver();
                    driver.get("https://www.redbus.in/passanger details/");}
             
                @When("^User click on procced to book button$")
                public void User_click_on_procced_to_book_button() {
                    //driver.get("https://www.redbus.in/passanger details/");
                    driver.findElement(By.linkText("bpDpAddr")).click();
                }
             
                @Then("^User is able to navigate passanger details page and proceed to pay button$")
                public void void_User_is_able_to_navigate_passanger_details_page_and_proceed_to_pay_button() {
                    if(driver.getTitle().equalsIgnoreCase(
                             "proceed to book")){ 
                                System.out.println("Navigated to proceed to pay"); 
                          } else { 
                             System.out.println("Not on proceed to pay  :("); 
                          } 
        driver.close();
    }
	

	}
