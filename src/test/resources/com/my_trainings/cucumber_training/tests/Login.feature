Feature: Login Scenarios
	Background:
		Given The user is on the login page

	Scenario: Valid Login Tests
		When The "USER" logs in with "VALID_CREDENTIALS"
		Then The user should be able to navigate to the HomePage
		And The user should be able to validate the following
		|WELCOME_SCREEN|
		|ABC_LINK|
		|LOGOUT_BTN|
		
	Scenario Outline: Valid Login Tests
		When The user enters username as "<username>"
		And The user enters password as "<password>"
		Then The user should be able to navigate to the HomePage
		
		Examples:
		|username|password|
		|abc|xyz|