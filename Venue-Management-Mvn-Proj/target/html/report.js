$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("VenueEnq.feature");
formatter.feature({
  "id": "i-want-to-be-able-to-complete-an-rhh-venue-enquiry",
  "description": "",
  "name": "I want to be able to complete an RHH Venue Enquiry",
  "keyword": "Feature",
  "line": 1
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 3,
  "type": "background"
});
formatter.step({
  "name": "I am on the RHS CRM",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I navigate to the Venue Management Home Page",
  "keyword": "When ",
  "line": 5
});
formatter.match({
  "location": "commonStep.I_am_on_the_RHS_CRM()"
});
formatter.result({
  "duration": 14058587062,
  "status": "passed"
});
formatter.match({
  "location": "VenueEnqStepDef.I_navigate_to_the_Venue_Management_Home_Page()"
});
formatter.result({
  "duration": 5472566628,
  "status": "passed"
});
formatter.scenario({
  "id": "i-want-to-be-able-to-complete-an-rhh-venue-enquiry;i-want-to-make-a-booking-for-an-venue-for-my-birthday",
  "tags": [
    {
      "name": "@VenueEnq",
      "line": 7
    }
  ],
  "description": "",
  "name": "I want to make a booking for an venue for my birthday",
  "keyword": "Scenario",
  "line": 8,
  "type": "scenario"
});
formatter.step({
  "name": "I login to the RHH Venue Planner",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "I select an available dates",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "I enter enquiry information",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "I should be able to make an enquiry",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "location": "VenueEnqStepDef.I_login_to_the_RHH_Venue_Planner()"
});
formatter.result({
  "duration": 26627,
  "status": "passed"
});
formatter.match({
  "location": "VenueEnqStepDef.I_select_an_available_dates()"
});
formatter.result({
  "duration": 34647,
  "status": "passed"
});
formatter.match({
  "location": "VenueEnqStepDef.I_enter_enquiry_information()"
});
formatter.result({
  "duration": 32400,
  "status": "passed"
});
formatter.match({
  "location": "VenueEnqStepDef.I_should_be_able_to_make_an_enquiry()"
});
formatter.result({
  "duration": 979675074,
  "status": "passed"
});
});