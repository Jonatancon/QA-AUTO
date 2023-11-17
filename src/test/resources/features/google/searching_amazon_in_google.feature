Feature: Searching Amazon in google.

  Scenario: Searching for amazon in google
    Given Paul wants to search for amazon store on google
    When  he looks up "amazon" in google
    Then  he should see information about "amazon" in google