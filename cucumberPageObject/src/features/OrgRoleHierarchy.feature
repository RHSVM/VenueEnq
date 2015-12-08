Feature: Setup Organisation Roles and Organisation Hierarchy
  
  
  Backgroung:
  Given I am on CRM Home Page
  When I navigate to Organisation record
  And I click on the Connection's tab

  @AddOrgHierarchy
  Scenario: I want to be able to add a new connection to Org Hierarchy
    And click on Hierarchy tab
    Then I should be able to add a new connection

  @AddOrgRoles
  Scenario: I want to be able to add new connection to the Org Role
    And click on Roles tab
    Then I should be able to a roles connection
