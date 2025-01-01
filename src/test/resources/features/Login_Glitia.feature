Feature: Default
@Glitia
	# User Story:                                                                                                                              As a user, I should be able to login in with valid credentials                                             Ac2: No one should log in with invalid credentials 
	#
	#  AC2-1:     Login with Invalid Username and Valid Password                                                    
	@HEC10-189
	Scenario: Ac2-1cuc Login with Valid Username and Valid Password
		Given the user navigates to the URL
		When Verify login page is displayed
		And Enter invalid Username in username field
		And Enter valid password in password field
		And Click on login button
		Then Verify the home page