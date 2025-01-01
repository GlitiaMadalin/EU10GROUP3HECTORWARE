Feature: Login functionality

  Scenario: User logs in with valid credentials

    Given user visit Hectorware
    When user enters valid username in username box
    And user enters valid password in password box
    And user clicks the login button
    Then user should see the dashboard


