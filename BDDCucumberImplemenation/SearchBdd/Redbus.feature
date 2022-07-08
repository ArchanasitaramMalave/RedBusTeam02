Feature: Search in Red Bus

@RegressionTest
Scenario: Successful Search red bus 
    Given User have search bus on red bus home page
    When source  User search for a bus withname and destination name and date

    Then User able to see buses
   | Pune | Mumbai | Tue, 5 July |
    
 Scenario: Successful apply filters
    Given User can apply filters in sort and filter option
    When  User is select AC filter 
    Then  User is able to see AC buses
    
 Scenario: Successful view seat
    Given User can select available seat
    When  User click on available seat
    Then User navigate to boarding point and dropping point page
    
Scenario: Successfully proceed to book
    Given User have to select boarding point and dropping point
    When User click on procced to book button 
    Then User is able to navigate passanger details page and proceed to pay button
