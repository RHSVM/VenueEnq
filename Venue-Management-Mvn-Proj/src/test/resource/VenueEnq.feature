Feature: I want to be able to complete an RHH Venue Enquiry

  Background: 
    Given I am on the RHS CRM
    When I navigate to the Venue Management Home Page

  @VenueEnq
  Scenario: I want to make a booking for an venue for my birthday
    And I login to the RHH Venue Planner
    And I select an available dates
    And I enter enquiry information
    Then I should be able to make an enquiry

  @CreateCustomerEnquiry
  Scenario: I want to create a customer enq
    Given I am Venue Planner Module
    When I log in the VP
    And I selects Hort Halls module
    Then the system displays Venue Planner
    And I selects date and option to create new client enquiry <A1>
    And selects option to specify if an agency is associated with the enquiry <A2>
    Then the system should generates enquiry choice number
    And updates Engagements and Communications History and save
    Then the system should update audit trail

  @CreateCustomerEnquiryAlternativeFlow
  Scenario: I want to create a customer enquiry and also to verify that the agency is associated with the enquiry
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
  Scenario: I want to create an Enq and associate an Agency to the enquiry
    Given I am on the Venue Planner Module
    When I log in the Venue Planner
    And I selects Hort Halls module
    Then the system displays Venue Planner
    And I selects date and option to create new client enquiry <A1>
    And selects option to specify if an agency is associated with the enquiry <A2>
    And select option to link an agency to the enquiry
    And I enter agency name
    Then system should search for agency
    And I selects agency from list or alternatively invokes use case CRM.UC.HH.009 to create a new agency record, and associates that record with the enquiry
    
    
   
