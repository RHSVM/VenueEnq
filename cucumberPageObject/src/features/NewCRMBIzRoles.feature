Feature: CRH Core Functionalities

  Background: 
    Given I am on the CRM Home page
    When I want to be able to perform core functionalities
    Then should see successful message afterwards

  @RegPersonWithAddress
  Scenario: Should be able to register a person with Address alone
    When I enter a person main details
    And I enter their address
    And I click submit button
    Then I should be able to register the person

  @RegPersonWithTel
  Scenario: Should be able to register a person with Address alone
    When I enter a person main details
    And I enter their person Tel details
    And I click submit button
    Then I should be able to register the person

    
   @RegPersonWithEmail
  Scenario: Should be able to register a person with Address alone
    When I enter a person main details
    And I enter their person Email details
    And I click submit button
    Then I should be able to register the person
    

     