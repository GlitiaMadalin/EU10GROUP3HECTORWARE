Feature: Logout function
  @wip
  Scenario: User logout from home page
    Given User is on home page
    When user click on Account dropdown button
    And user clicks on logout action
    Then user go to the login page