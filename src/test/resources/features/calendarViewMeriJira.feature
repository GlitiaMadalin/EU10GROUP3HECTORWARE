Feature: Default

	#US:
	#
	#As a user, I should be able to view the Calendar module so that I can use the app
	#
	#AC:
	#User can see the Calendar module
	@HEC10-142
	Scenario: User can see the Calendar module
		Given User is on home page
		 Then User should see calendar module