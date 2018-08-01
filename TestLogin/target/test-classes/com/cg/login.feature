Feature: I want to login
Scenario: I enter the wrong username
	Given I enter the username as abc
	And I enter the password as Shiwani@123
	When I click on sign in
	Then I get a message as wrong username
	
	
Scenario: I enter the wrong password
	Given I enter the username as shiwani
	And I enter the password as shcn
	When I click on sign in
	Then I get a message as wrong password
	
Scenario: I enter the correct username and password
	Given I enter the username as shiwani
	And I enter the password as Shiwani@123
	When I click on sign in
	Then I get the success page
	
	