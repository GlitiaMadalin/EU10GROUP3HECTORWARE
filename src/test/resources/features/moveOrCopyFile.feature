Feature: Move or Copy file feature

  User story: As a user, I'd like to be able to edit, move or copy a file so that I can share them with other app users.

  Background: user is expected to be on the login page
    Given user logged in to an account


  Scenario: User copies a file
    When user right clicks to a targeted file
    And user sees a dropdown
    And user clicks to Move or copy button
    And user sees target folders are displayed
    And user clicks to desired target folder
    And user sees two options on the right bottom of the segment Copy to "notes" Move to "notes"
    And user clicks to Copy to "notes" button
    Then user confirms file is copied to folder

  Scenario: User copies a file
    When user right clicks to a targeted file
    And user sees a dropdown
    And user clicks to Move or copy button
    And user sees target folders are displayed
    And user clicks to desired target folder
    And user sees two options on the right bottom of the segment Copy to "notes" Move to "notes"
    And user clicks to Move to "notes" button
    Then user confirms file has moved to folder

    @yzg
  Scenario: User moves file to home page
    When user clicks to desired target folder
    And user confirms file is displayed
    And user right clicks to a targeted file
    And user clicks to Move or copy button
    And user clicks to Home button that is displayed on top left
    And user clicks to move button that is displayed on right bottom corner
    Then user confirms file is displayed on the All files page