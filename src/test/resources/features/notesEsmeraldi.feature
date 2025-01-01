Feature: Notes Functionality

  User Story:
  As a user, I should be able to verify functionality of notes module

  Background: As , user is expected to create, rename, edit and delete any text file
    Given user login with valid credentials
    When user verify and click notes icon



  Scenario: User can create a new note text file
    And user click to create new note text file
    Then user verify new note file is created

  @Esmeraldi
  Scenario: User is able to rename new created and before created text file
    And user is able to click the three dots
    And user is able click at the option of file rename
    And user can delete old file name
    And user is able to type new file name
    Then use can save the name of file




