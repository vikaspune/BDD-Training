Feature: Login Scenarios
	Background:
		Given The user is on the login page

	Scenario: Valid Login Tests
		When The user enters username as "abc"
		And The user enters password as "xyz"
		Then The user should be able to navigate to the HomePage
		
	Scenario Outline: Valid Login Tests
		When The user enters username as "<username>"
		And The user enters password as "<password>"
		Then The user should be able to navigate to the HomePage
		
		Examples:
		|username|password|
		|abc|xyz|