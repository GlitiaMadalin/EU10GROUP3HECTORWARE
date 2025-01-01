Feature: Talk Functionality

  User story: Talk functionality- Create a new conversation.

  Scenario: Verify that In order to create a new conversation
  user is able to click the plus sign which is in the left part of the window,
  immediately under the talk module.

   Given login to the hectorware
    And navigate to talk module
    And click the talk module
   Then Click plus sign in order to create a new conversation


    Scenario:  Verify that user is able to type type valid conversation name
    which is no longer than 20 characters,and it can be as many words as he wants.
    User can put in conversation name box special characters and numbers.

    Given login to the hectorware
    And navigate to talk module
    And click the talk module
    And  Click plus sign in order to create a new conversation
    And Click the conversation name box
   And Write a conversation name
  Then verify conversation name is same as the input


  Scenario:  Verify that user is able to see “Incorrect conversation length”
  with red color if he enters invalid credentials,
  immediately after conversation name input box
    Given login to the hectorware
    And navigate to talk module
    And click the talk module
    And  Click plus sign in order to create a new conversation
    And Click the conversation name box
    And write an invalid conversation name
    Then verify that the message-Incorrect conversation length- is appeared in the table
