Feature: Talk Functionality
#|User Story: Talk Functionality - "Create a new conversation"
	@HEC10-182
	Scenario: 1. Verify that In order to create a new conversation user is able to click the plus sign
	which is in the left part of the window, immediately under the talk module
		Given login to the hectorware
		And navigate to talk module
		And click the talk module
		Then Click plus sign in order to create a new conversation




	@HEC10-176

	Scenario:  Verify that user is able to type type valid conversation name
	which is no longer than 20 characters,and it can be as many words as he wants.
	User can put in conversation name box special characters and numbers.

		Given login to the hectorware
		And navigate to talk module
		And click the talk module
		And  Click plus sign in order to create a new conversation
		And Click the conversation name box
		Then Write a conversation name


	@HEC10-177
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



#|User Story: Talk Functionality - "Delete any selected conversation"

	@HEC10-184
	Scenario: Verify that in order to delete a conversation user should select the conversation titles "Andas Conversation" by clicking the three dots button (...)
		Given login to the hectorware
		And navigate to talk module
		And click the talk module
		Then Click the three dots button in the conversation named Andas Conversation



	@HEC10-192
	Scenario: Verify that user  see a box with some options, the last one should be "Delete a conversation" option
		Given login to the hectorware
		And navigate to talk module
		And click the talk module
		And Click the three dots button in the conversation named Andas Conversation
		Then verify that  Delete a conversation option is displayed



	@HEC10-194
	Scenario:  Verify that user can click "Delete a conversation" option
		Given login to the hectorware
		And navigate to talk module
		And click the talk module
		And Click the three dots button in the conversation named Andas Conversation
		And verify that  Delete a conversation option is displayed
		And Click delete conversation button
		Then  user  click the yes button to confirm that he wants to delete the conversation


