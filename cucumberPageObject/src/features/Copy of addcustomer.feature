Feature: I want to add new customer

  @AddNewPerson
  Scenario: Add New Person
    Given I am on the CRM website
    When I navigate to registrations page
    And I populate the registration form with valid data
      | Fields       | Value    |
      | Last Name    | Test1223 |
      | First Name   | Tester   |
      | Initials     | Mr       |
      | PreferedName | Test     |

  # | Date Of Birth | 10/09/200     |
  #| Email         | test1@rhs.com |
  #| Phone         | 09707079797   |
  #Then I check that the form has been submitted
  @AddNewOrganisation
  Scenario: Add New Organisation
    Given I am on the CRM website
    When I navigate to Org registrations page
    And I populate the form for Organsation
      | Fields         | Value    |
      | First Name     | Test1223 |
      | Last Name      | Tester   |
      | Preferred Name | SE17 3SF |
    Then I check that the form has been submitted

 
  @BasicSearch
  Scenario: I want to conduct a basic search
    Given I am on the CRM HomePage
    When I navigate to the search bar
    And I search by Person
    And I search by Organisation
    And I search by School
    Then I should get the corresponding result

  @OnlineAccountManagement
  Scenario: I want to management online account
    Given I am update customer page
    When I navigate to online account
    And I associate existing Online Account
    And I Disassociate Online Account
    And I disable Online account
    And I set primary account
    And I enable Online Account

  @EnableCommunicationDetails
  Scenario: I want to enable comm detail
    Given I am on the communication page
    When I navigate to 'email address'
    And I set 'email' to the primary address
    And I set 'Website' to the primary address
    And I set 'Tel' to the primary phone
    And I set 'Social Media' to the Primary address
    Then details should be set.

 
  @CreateNewTemplate
  Scenario: I want to create an Ad Hoc doc template
    Given I am on the RHS CRM Doc Site
    When I navigate to the Doc Creator page
    And I fill out the required feilds
      | Fields   | Value                                      |
      | Doc Name | RHS Ah Hoc Doc Template                    |
      | Doc Note | Tester's Note This is for testing purpose' |
    Then I should be able to create a new doc template

  @CreateNewAdHocDoc
  Scenario: I want to create 'New Ad Hoc Document'
    Given I am RHS CRM Ad Doc Page
    When I navigate to 'Document paeg'
    And I fill the Document details
    Then I should be able to create 'New Ad Hoc Doc'

  @AddNewTrainer
  Scenario: Add New Venue
    Given I am on the HRS CRM website
    When I navigate to trainer's page
    And I populate the form for Trainers
      | Fields                  | Value                                                                               |
      | Trainer                 | Test                                                                                |
      | Name                    | Mrs Andrea Ayre Paster                                                              |
      | Additional Work Details | Trainers testing note and should be for trainers only and not for any other purpose |
      | Note                    | Trainers testing note and should be for trainers only and not for any other purpose |
    Then I new trainer should be added

  @AddNewVenue
  Scenario: Add New Venues
    Given I am on the HRS CRM websites
    When I navigate to Venue pages
    And I populate the form for Venues
    Then I new venue should now be added

  @AddNewCourseVenues
  Scenario Outline: I want to add Venue
    Given I am on HRS CRM
    When I navigate to Venue page
    Then I new venue should be added
    And I populate the form for Venue

    Examples: 
      | Venue Description | Note  | Venue Parking Detils | Public Transport | Venue access Details | Venue Capacity |
      | http://my-url     | 12345 | joe                  | abcd123          | foo                  | 100            |
      | http://my-url     | 12346 | joe                  | abcd123          | bar                  | 100            |

  
  @FiletrVenueDetails
  Scenario: I want to filter venue
    Given I am on the HRS CRM
    When I navigate to the venue page
    And I filter venue
    Then I should get the right venue details

  @FileUpLoad
  Scenario: File Upload
    Given I am on the Trainers page
    When I navigate to Upload seesion
    And I upload a file
    Then I should be able to upload a file
    
    

