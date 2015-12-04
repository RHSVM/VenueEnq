Feature: I want to be able to do a search on an existing Venue so I can edit or amend the venue details

  Background: 
    Given I am RHH CRM system
    When I log into the CRM System
    And I select the option to display the Venue Planner
    Then the system should load and display the Venue Planner

  @VenueSearch
  Scenario: Display venue planner in order to do a Venue Search
    When I enter a search criteria for a venue
    And I do a search base on the criteria I have entered
    Then I should get the desired result

  @DisplayBookingRecord
  Scenario: I want to display a list of bookings
    Given I am RHH CRM system
    When I log into the CRM System
    And I select the option to display the Venue Planner
    And I select an existing Booking records
    Then the system should open record

  @ViewBookingRecords
  Scenario: I want to view a list of bookings
    Given I am RHH CRM system
    When I log into the CRM System
    And I select the option to display the Venue Planner
    And I select an existing Enquiry records
    Then the system should open record
