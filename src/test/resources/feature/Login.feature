Feature: Login feature
  As user I want to login because I want

  Scenario: Basic login
    Given user is on landing page
    When user enters credentials
    And user clicks login button
    Then user suppose to see welcome message