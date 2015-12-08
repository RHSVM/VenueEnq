
Feature: I want to manage Business sector


	@BusinessSector
	Scenario: I want to add and amend Business Sector iformation
		Given I am on the HRS CRM 
		When I navigate to a Organisation record
		And I add a Business Sector 
		And I amend a Business record
		Then I should get a successfull message 