Feature: Default

	# 
	#
	#US: As a user, I should be able to set a status message
	#
	# 
	#
	# 
	#
	#AC1: Under the "Online status" options, user should see "Status message" at the middle of the box.

  Background:
    Given user navigates to the URL "HECTORWARE-QA"
    When user click to the avatar
    When user click to the Set status link text.
    Then user view Online status box.
    When User see Online status text.
    And User see Online option  at the left top
    And User see Away option at the right top
    And User see Do not disturb Mute all notifications option at the left bottom
    And User see Invisible Appear offline option at the right bottom
  @HEC10-216
  Scenario: verify under the "Online status" options, user should see "Status message" at the middle of the box.

    Then verify user see Status message text under Online status options

     #AC2: Under the "Status message" text, user should see the input box with the "What's your status?" text.
  @HEC10-217
  Scenario: verify under the "Status message" text, user should see the input box with the "What's your status?" text.
    Then verify  under the Status message text, user should see the input box with the What's your status?text.

    #AC3: Under the input box there are 5 dropdown options that user can choose as "Status message". Options are in this order: "In a meeting", "Commuting", "Working remotely", "Out sick", "Vacationing".
  @HEC10-218
  Scenario: verify under the input box there is In a meeting option

    Then verify under input box there is In a meeting set status option

    #AC3 A)user should see In a meeting option in input box after clicking the option.
  @HEC10-219
  Scenario: verify user should see In a meeting option in input box after clicking the option.
    When user click In a meeting
    Then verify user see In a meeting at input box

    #AC4: Under Status message’s dropdown options, user should see "Clear status after" message at the left side.
  @HEC10-228
  Scenario: verify under Status message’s dropdown options, user should see "Clear status after" message at the left side.
    Then verify user se Clear status after text after dropdown menu

    #AC5:After "Clear status after" user should click the box that is writing "Select option" where the dropdown menu appears.
  @HEC10-229
  Scenario: verify after "Clear status after" user should click the box that is writing "Select option" where the dropdown menu appears.
    Then verify after Clear status after text there is input with select option message

#AC6: a)User should choose one of the 6 options at the dropdown menu where the text options are by this order: "Don't clear", "30 minutes", "1 hour", "4 hours", "Today", "This week".
  @HEC10-231
  Scenario Outline:verify user should choose one of the 6 options at the dropdown menu where the text options are by this order: "Don't clear", "30 minutes", "1 hour", "4 hours", "Today", "This week".


    When user click "<currentOption>"
    And user click "<afterOption>"
    Then verify "<currentOption>" changed.


    Examples:

      | currentOption | afterOption |
      | an hour       | 30 minutes  |
      | 30 minutes    | Today       |
      | Today         | 4 hours     |
      | 4 hours       | This week   |

   # @TestingM
    #Scenario: verify user should choose one of the 6 options at the dropdown menu

      #When verify  under the Status message text, user should see the input box with the What's your status?text.
     # And user click In a meeting
      #Then verify user choose from clear after  dropdown menu Today option and it is displayed near In a meeting text

      #AC9: When the user click "Clear status message", under the avatar dropdown menu will be seen just one of the 4 option that are chosen at Online status part.
  @HEC10-238
  Scenario: verify when the user click "Clear status message", status message won't be changed
    When user click clear status message
    Then verify status message will not change at the profile module dropdown menu




	#AC10: When the user click "Set status message" under the avatar dropdown menu will be seen the status message that is chosen by user.
  @HEC10-240
  Scenario: verify when user click "Set status message, status message will be changed
    When user click In a meeting
    When user click Set status message
    Then verify status message will be changed at the profile module dropdown menu

#AC11
	#
	#b)At input box with the "What's your status?" text, user can not write on the input box more than 80 char letters
  @HEC10-242
  Scenario: verify that at input box with the "What's your status?" text, user can not write on the input box more than 80 char letters
    Then verify user can not write on the input box more than 80 char letters and user can't use special char.