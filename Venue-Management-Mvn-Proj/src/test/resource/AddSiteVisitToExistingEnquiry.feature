Feature: I want to add a site visit to an exisiting Enquiry

  @CreateCustomerEnquiry
  Scenario: I want to create a customer Enquiry
    Given I am Venue Planner Module
    When I log in the VP
    And I selects Hort Halls module
    Then the system displays Venue Planner
    And I selects date and option to create new client enquiry <A1>
    And selects option to specify if an agency is associated with the enquiry <A2>
    Then the system should generates enquiry choice number
    And updates Engagements and Communications History and save
    And I add a Site Visit to the existing Enquiry
    And I set a date for the site visit
    Then the system should update audit trail
    And confirmation message should be displayed

  @CreateCustomerEnquiryEditExistingEnquiryAlternativeFlow
  Scenario: I want to create a customer Enquiry and updates Engagements and Communications History and save
    Given I am on the Venue Planner Module
    When I log in the VP
    And I select Hort Halls module
    Then the system displays Venue Planner
    And I selects date and option to create new client enquiry <A1>
    And search for enquiry via enquiry reference number or other criteria
    Then system should executes search and displays results
    And I selects record from results list
    Then system should system displays enquiry record
    And I make updates to enquiry record
    And selects option to specify if an agency is associated with the enquiry <A2>
    Then the system should generates enquiry choice number
    And updates Engagements and Communications History and save
    Then the system should update audit trail

  @CreateCustomerEnquiryAssociateAgencyWithEnquiry
  Scenario: I want to create a customer Enquiry
    Given I am on the Venue Planner Module
    When I log in the VP
    And I selects Hort Halls module
    Then the system displays Venue Planner
    And I selects date and option to create new client enquiry <A1>
    And selects option to specify if an agency is associated with the enquiry <A2>
    And select option to link an agency to the enquiry
    And I enters agency name
    Then system should search for agency
    And I selects agency from list or alternatively invokes use case CRM.UC.HH.009    to create a new agency record, and associates that record with the enquiry
