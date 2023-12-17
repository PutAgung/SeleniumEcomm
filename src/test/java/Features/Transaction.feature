Feature: Transaction functionality
  Scenario Outline: Check if the order is successfully created
    Given I am on the product details page for "<product>"
    When I add the product to the cart
    And I proceed to checkout
    And I enter shipping details
    And I complete the purchase
    Then I should see a confirmation message
    Examples:
    | product |
    | Radiant Tee |