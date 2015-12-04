Feature: I want to add a and View Chat List to an exisiting Enquiry

  Background: 
    Given I am on the RHH System
    When I log into to the Venue Planner
    And I navigate to the Venue Planner

  @CreateCustomerEnquiry
  Scenario: I want to create a customer Enquiry
    Given I am on the Venue Planner Module
    When I log in the VP
    And I selects Hort Halls module
    Then the system displays Venue Planner
    And I selects date and option to create new client enquiry <A1>
    And selects option to specify if an agency is associated with the enquiry <A2>
    Then the system should generates enquiry choice number
    And updates Engagements and Communications History and save
    And I add a Site Visit to the existing Enquiry
    Then the system should update audit trail

  @ViewChatList
  Scenario: I want to view chat that has been made on an existing enquiry
    Given I have an existing enquiry
    And I have an existing chat with the sales team
    And I log into the sytem to see the list of chat thats has been done in the past
    Then I should be able to retrieve the list of all the chat made on an enquiry
    
    @Testing
    Scenerio: I want to test GitHub
    Given I made changes to my local file
    When I commit to my local ditory
    And I pull and commit to my repository
    Then my file should be saved in my Repository
    
