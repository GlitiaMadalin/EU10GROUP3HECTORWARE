
Feature: Online status

  User Story: User can change Online Status

  Background:

    Given user navigates to the URL HECTORWARE-QA
    When  user verifies login page is displayed
    And   user enters valid username
    And   user enter valid password
    And   user clicks on login buttonn
    And   user hover the profile name
    And   user click on profile name


  @Glitia
  Scenario: User should be able to Display Profile Name and Status Menu

    Then  user verifies to see profile name and Status menu

  @Glitia
  Scenario:User should be able to change "Online Status"

    And  user verifies to see profile name and Status menu
    And  user click on status menu
    And  user Click on Online option
    And  user click Set status messages
    Then  user verifies to see status is changed Online.

  @Glitia
   Scenario: User should be able to change "Status messages"

    And user verifies to see profile name and Status menu
    And user click on Status menu
    And user verifies to see  status  with  input box
    And user verifies to see all the 5 options
    And user verifies to see Clear status message and Set status message tabs
    And user enter a text in input box
    And user Click on Set status messages
    And user verify if is displayed
    And  user lick one of the 5 options
    And user click on Set status message
    And user click on Clear status message
    Then can user verify to see Status is changed