Feature: I want to amend or Add Commication for a Person


Background
	Given I am on the RHS CRM Home Page
	When I navigate to a Person Communication page
	Then I should be able to amend their record

@AddPersonCommunication
  Scenario: I want to add communication for a person
    Given I am on the CRM website
    When I navigate to communications
    And I Add an eamil for a person
    And I add a website for a person
    And I add a Tel for a person
    And I add a social media for a person
    And I add Address for a person
    Then I should be able to save person conmunications
    
    