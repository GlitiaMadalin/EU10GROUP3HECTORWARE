Feature: Upload file feature

  User story : As a user, I'd like to be able to add a file so that I can share them with other app users.

  Background: user is expected to be on the login page
    Given user logged in to an account
    Then user should click to plus button


  Scenario: User should see the plus button right next to home button
    Given user should verify the plus button is displayed

  Scenario: User should see the following options after clicking to plus button: Upload file, New folder, New text document
    Then user sees dropdown and confirms required texts are displayed

  Scenario: User should click to upload file button and select a text, img or pdf file with a maximum capacity of 10 mb
    Then user should select a file to upload by clicking to Upload file button


  Scenario: User can verify file is uploaded by confirming it’s displayed in the ‘’All files’’ page.
    Given user should select a file to upload by clicking to Upload file button
    Then user verifies uploaded file is displayed