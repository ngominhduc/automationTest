Feature: Check login functionality
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters valid username and password
    And user click on login button
    Then user is navigated to the home page