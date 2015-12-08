Feature: amending some core funtionalities



Background: 
	Given I am on the CRM Home Page
	When I navigate to a Person's record
	Then I should be able to amend its record
	
	@CoreFuncationality
	Scenario: I want to perform some core functionality
		Given I set non-primary address record to inactive
		When I set the address type
		And I set website/emails to Inactive
		And I verify that dial code returns the right the value
		And I verify that the first telephone number is set to primary
		And I verify that department appears when adding salutaion
		And I verify that Opt-Ins have a valid to is set when an opt-in value of Active is set to false
		Then I shuold be able to get the desired result



