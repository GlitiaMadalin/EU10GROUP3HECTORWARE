Feature: Login function by Meri

  Scenario: User log in with valid credentials
    Given User go to the url
    When User enter valid username
    And User enter valid password
    And  User clicks on login button
    Then User user should verify home page
