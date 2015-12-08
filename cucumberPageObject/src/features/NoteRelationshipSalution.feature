Feature: I want to manage GE Notes, Relationship and Salutions


@AddGENote
  Scenario: Organisation Basic Search
    Given I am on the CRM page
    When I enter navigate to Advance Search
    And I search with City/Town
    And I search with Address Line 1
    And I search with Address Lines 2
    And search with country
    And I search with eamil
    And I search with Social Media
    And I search with Telephone
    And I search with Display name
    And I search with CustomerID
	Then 
    
    
     @RelationshipManagement
  Scenario: I want manage relationship
    Given I am on the Crm Home Page
    When I navigate to Customer page
    And I add a 'Relationship'
    And I edit a 'Relationship'
    And I cancel a 'Relatioship'
    Then I should be get a confirmation mesage
    
    
     @Salutaion
  Scenario: I want manage Salutaion
    Given I am on the Crm Home Page
    When I navigate to Customer page
    And I add a 'Salutaion'
    And I edit a 'salution'
    And I cancel a 'salutation'
    Then I should be get a confirmation mesage
    
     