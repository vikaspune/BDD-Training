Feature: Login Scenarios
	Background:
		Given The user is on the login page

		
	Scenario Outline: Valid Login Tests
		When The user logs in as "<usertype>"
		Then The user should be able to navigate to the HomePage
		
		Examples:
		|usertype|
		|VALID_CREDENTIALS|