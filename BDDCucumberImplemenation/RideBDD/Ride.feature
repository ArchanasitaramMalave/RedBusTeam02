Feature: rYde
Scenario: Successful navigation to Home page
    Given User navigates to Home page
    When User clicks on rYde
    Then User should be redirected to rYde page
    
    Scenario: Successful navigation to rYde page
    Given User navigates to rYde page
    When User clicks on SUVs
    Then User should be redirected to carrental page
    
    Scenario: Successful navigation to Get best price
    Given User navigates to carrental page
    When User clicks on Get best price
    Then User should be able to see Hire a Vehicle dialogue box