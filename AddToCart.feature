Feature: User is on the Add to Cart page

  @tag1
  Scenario: User is on the Add to Cart Page
    Given User is on the Add to Cart Page
    When User click on the Add to Cart button
    And User click on the Checkout button
    And User add billing details
    And User click on the Place Order button
    Then Order should be placed successfully
    

 