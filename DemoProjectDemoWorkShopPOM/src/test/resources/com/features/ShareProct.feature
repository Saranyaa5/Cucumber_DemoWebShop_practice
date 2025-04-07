@ProductSharing
Feature: To share the product to the friend

  @ValidEmail
  Scenario Outline: Share the searched product to the friend
    Given the user is on the DemoWebshop home page "https://demowebshop.tricentis.com/"
    When the user clicks the login button  
    And the user enters a valid email and password  
    And clicks the login button  
    And the user enters a product name products in the search bar
      |Camcorder|
    Then the matching products should be displayed
    When the user sorts the products by price low to high "Price: High to Low"
    And the user clicks the first product in the sorted list
    And the user clicks the email a friend button
    And the user enters friend details from <rowNumber>
    And clicks the Send email button
    Then the user should see the email send successfull message
    Examples:
      | rowNumber |
      | 1         |
      | 2         |