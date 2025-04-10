@SearchingProduct
Feature: To search for a product on the homepage

  @ValidSearch
  Scenario: Search for an available product after login
    Given the user is on the DemoWebshop home page "https://demowebshop.tricentis.com/"
    When the user clicks the login button  
    And the user enters a valid email and password  
    And clicks the login button  
    And the user enters a product name products in the search bar
      |Camcorder|
      #|Music|  
    Then the matching products should be displayed
    When the user sorts the products by price low to high "Price: Low to High"
    Then the products should be listed with price low to high
    
    
  @InvalidSearch
  Scenario: Search for an unavailable product after login
    Given the user is on the DemoWebshop home page "https://demowebshop.tricentis.com/"
    When the user clicks the login button  
    And the user enters a valid email and password  
    And clicks the login button  
    And the user enters a product name products in the search bar
    |Iphone|
    |mobile|
    Then the message "No products were found that matched your criteria." should be displayed
    
          