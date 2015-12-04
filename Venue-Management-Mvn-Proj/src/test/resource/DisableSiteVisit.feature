Feature: I want to Disable a site visit from from a venue enquiry

  Background: 
    Given I am on the RHH System
    When I log into to the Venue Planner
    And I navigate to the Venue Planner

   @DisableSiteVisit
  Scenario: I want to create a customer Enquiry
    Given I am Venue Planner Module
    When I log in the VP
    And I selects Hort Halls module
    Then the system displays Venue Planner
    And I selects date and option to create new client enquiry <A1>
    And selects option to specify if an agency is associated with the enquiry <A2>
    Then the system should generates enquiry choice number
    And updates Engagements and Communications History and save
    And I View a Site Visit to the existing Enquiry
    And I disable the site visit
    Then I shoud get a confirmation message "your site visit has been cancelled"