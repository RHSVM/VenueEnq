Feature: I want to be able to record and edit Venue Planner records

  Background: 
    Given I am RHH CRM system
    When I log into the CRM System

  @DisplayVenuePlanner
  Scenario: Display Venue Planner Records
    And I select the option to display the Venue Planner
    Then the system should load and display the Venue Planner

  @ViewBookingRecords
  Scenario: Display Venue Planner and View a Booking
    Given I am RHH CRM system
    When I log into the CRM System
    And I select the option to display the Venue Planner
    And I select an existing Booking records
    Then the system should open record

  @DisplayVenueAndViewBooking
  Scenario: I want to View and Display Venue Planner
    Given I am RHH CRM system
    When I log into the CRM System
    And I select the option to display the Venue Planner
    And I select an existing Enquiry records
    Then the system should open record

   
   
    
    
    @Given("^I am RHH CRM system$")
public void I_am_RHH_CRM_system() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I log into the CRM System$")
public void I_log_into_the_CRM_System() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I select the option to display the Venue Planner$")
public void I_select_the_option_to_display_the_Venue_Planner() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^the system should load and display the Venue Planner$")
public void the_system_should_load_and_display_the_Venue_Planner() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I select an existing Booking records$")
public void I_select_an_existing_Booking_records() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^the system should open record$")
public void the_system_should_open_record() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I select an existing Enquiry records$")
public void I_select_an_existing_Enquiry_records() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}