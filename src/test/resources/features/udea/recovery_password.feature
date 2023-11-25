Feature: Recovery password

  Scenario: Recover password
    Given client forgot his password
    When  he enter your email address 'jhonatanlora2011@gmail.com'
    And   he enters the code sent to the email '123'
    Then  he should enter a new password '1234'
    And   he should see the home page