package rYdeBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RideStepDef {

	WebDriver driver;

    @Given("^User navigates to Home page$")
    public void User_navigates_to_Home_page() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARMALVE\\Desktop\\selenium\\selenum jars\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");}
 
    @When("^User clicks on rYde$")
    public void User_clicks_on_rYde() {
        //driver.get("https://www.redbus.in");
        driver.findElement(By.linkText("rYde")).click();
    }
 
    @Then("^User should be redirected to rYde page$")
    public void User_should_be_redirected_to_rYde_page1() {
        if(driver.getTitle().equalsIgnoreCase(
                 "rYde page")){ 
                    System.out.println("Navigated to rYde Page"); 
              } else { 
                 System.out.println("Not on rYde Page :("); 
              } 
    }
        
        
        @Given("^User navigates to rYde page$")
        public void User_navigated_to_rYde_page() {
       

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\bdomala\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.get("https://www.redbus.in/ryde/");}
     
        @When("^User clicks on SUVs$")
        public void User_clicks_on_SUVs() {
            //driver.get("https://www.redbus.in/ryde/");
            driver.findElement(By.linkText("SUVs")).click();
            
        }
     
        @Then("^User should be redirected to carrental page$")
        public void User_should_be_redirected_to_carrental_page() {
            if(driver.getTitle().equalsIgnoreCase(
                     "car-rental")){ 
                        System.out.println("Navigated to carrental Page"); 
                  } else { 
                     System.out.println("Not on carrental Page :("); 
                  } 
        }
            
            @Given("^User navigates to carrental page$")
            public void User_navigated_to_carrental_page() {

                System.setProperty("webdriver.chrome.driver", "C:\\Users\\bdomala\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
                driver=new ChromeDriver();
                driver.get("https://www.redbus.in/car-rental/");}
         
            @When("^User clicks on Get best price$")
            public void User_clicks_on_Get_the_best_price() {
                //driver.get("https://www.redbus.in/car-rental/");
                driver.findElement(By.linkText("Get best price")).click();
            }
         
            @Then("^User should be able to see Hire a Vehicle dialogue box$")
            public void User_should_be_redirected_to_Hire_a_Vehicle_dialogue_box() {
                if(driver.getTitle().equalsIgnoreCase(
                         "Hire a Vehicle")){ 
                            System.out.println("Navigated to Hire a Vehicle dialogue box"); 
                      } else { 
                         System.out.println("Not on Hire a Vehicle dialogue box  :("); 
                      } 
        driver.close();
    }
		// TODO Auto-generated method stub

	}