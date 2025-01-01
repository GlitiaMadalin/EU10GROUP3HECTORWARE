Feature: Profile Settings Functionality, if visiable and changeable


  Background: User should see Settings under the profile module
    Given User logs in with valid credential
    And User clicks on Avatar on the rights side of the top
    Then User sees dropdown with Set status,Settings,about,help,Log out inside
    Then User Clicks on Settings button

  @ali @positiveScenario
  Scenario: User enters a valid full name
    When User enters a valid full name Ali Yerligul
    Then user sees Ali Yerligul after refreshing

  @ali @negativeScenario #case of no error it is a bug
  Scenario: User enters an invalid fullname
    When User enters aliyerligulaliyerligulaliyerligul
    Then User should not see the entered invalid full name


   # Then User should see after refreshing the "<expected>" results

