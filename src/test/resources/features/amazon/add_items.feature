Feature: Add items in the shopping cart

  Scenario: Add a new items to shopping cart
    Given Paul wants to add a television to the shopping cart
    When  he search for "TV" and add it to the shopping cart
    Then  he should see a "1" in the shopping cart