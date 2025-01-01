Feature: Default

	# 
	#
	#User story: 
	#
	#Online Status functionality - "View and Change Online Status"
	#
	# 
	#
	# 
	#
	#AC1:User can view "Set status" text link at the second row of the dropdown menu when they click the avatar which is at the top right side of the page.
  @HEC10-185
  Scenario:  verify user can view "Set status" text link at the second row of the dropdown menu when they click the avatar which is at the top right side of the page.
    Given user navigates to the URL "HECTORWARE-QA"
    When user click to the avatar
    Then verify user view Set status message at second row of  dropdown menu




	#AC2: User should click the "Set status" link text on the dropdown menu, than the "Online status" box need to appeare at the middle of the page.
  @HEC10-187
  Scenario: verify user should click the "Set status" link text on the dropdown menu, than the "Online status" box need to appeare at the middle of the page.
    Given user navigates to the URL "HECTORWARE-QA"
    When user click to the avatar
    When Click to the Set status link text.
    Then verify user view Online status box.

		#AC3: User should see 4 options under the "Online status" text to change the "Online status" by clicking the options. "Online" option need to be at the left top,
	# "Away" option need to be at the right top, "Do not disturp" option at the left bottom under the "Online" options, "Invisible" option at the right bottom under the "Away" option.
  @HEC10-197
  Scenario: verify user should see 4 options under the "Online status" text to change the "Online status" by clicking the options.

    Given user navigates to the URL "HECTORWARE-QA"
    When user click to the avatar
    Then verify user view Set status message at second row of  dropdown menu
    When Click to the Set status link text.
    Then verify user view Online status box.
    When User see Online status text.
    And User see Online option need to be at the left top
    And User see Away option need to be at the right top
    And User see Do not disturb Mute all notifications option need to be at the left bottom
    And User see Invisible Appear offline option need to be at the right bottom
    Then verify user click the Online option.
    Then verify user see Online text under drop down menu
    Then verify user click the Away option.
    Then verify user see Away text under drop down menu
    Then verify user click the Do not disturb option.
    Then verify user see Do not disturb text under drop down menu
    Then verify user click the Invisible option.
    Then verify user see Invisible text under drop down menu


  Scenario: verify Online status


    Given user navigates to the URL "HECTORWARE-QA"
    When user click to the avatar
    Then user should see Online status
  @wipM
  Scenario: verify Online status is changed
    Given user navigates to the URL "HECTORWARE-QA"
    When user click to the avatar
    And user click on Online status
    And user click on Away option
    Then user should see Online status is changed
    Then verify user click the Do not disturb option.
    Then user should see Online status is changed
    When verify user click the Invisible option.
    Then user should see Online status is changed
@wipM2
  Scenario Outline:verify Online status
    Examples:

    Given user navigates to the URL "HECTORWARE-QA"
    When user click to the avatar
    Then verify user view Set status message at second row of  dropdown menu
    And user click on <currentStatus>
    And user click on <afterStatus> option
    Then verify user should see <currentStatus> is changed


      | currentStatus  | afterStatus    |
      | Set status     | Online         |
      | Online         | Away           |
      | Away           | Do not disturb |
      | Do not disturb | Invisible      |












