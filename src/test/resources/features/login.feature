Feature: Login feature
@wip
#As a user I should be able to login with valid credentials
  @HEC10-178
  Scenario: Login with valid credentials
    Given user navigates to the URL
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then any user should verify the home page