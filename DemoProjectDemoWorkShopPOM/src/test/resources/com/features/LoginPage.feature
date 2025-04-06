@ShoppingComputer
Feature: Add Computer to Cart and Proceed to Checkout  
  I want to use this template for my feature file

  @DemoWebShopLogin
  Scenario: Login to the DemoWebshop website  
    Given the user is on the DemoWebshop home page "https://demowebshop.tricentis.com/"
    When the user clicks the login button  
    And the user enters a valid email and password  
    And clicks the login button  
    Then the user should be logged into the DemoWebshop website