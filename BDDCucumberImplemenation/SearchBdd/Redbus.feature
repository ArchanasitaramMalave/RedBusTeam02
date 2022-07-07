Feature: Performing Actions on Redbus Application
  I want to use this template for my feature file

  @FirstCase
  Scenario Outline: Selecting a product from Sauce Demo Application
    Given Launch the Redbus Application
    Then Enter From City as "<From City>"
    Then Enter To City as "<To City>"
    Then Search for the Buses
    Then Select The Seats
    Then Select the PickUp Point
    Then Select the Drop Point
    Then Proceed To Booking and enter the Details

    Examples: 
      | From City | To City |
      | Bangalore | Chennai |
