Feature: Delete file feature

  User story:
  As a user, I'd like to be able to delete any selected file

  Background: user is expected to be on the login page
    Given user logged in to an account


  Scenario: User deletes a file
    Given user should be able to right click to a targeted file
    And user should see the dropdown
    And user should click to delete file button
    And user should click to Deleted files button
    Then user should confirm deleted file is displayed in Deleted files page