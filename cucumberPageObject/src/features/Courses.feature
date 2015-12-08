Feature: I want to add and amend courses information

  @CreateNewCourse
  Scenario: I want to create a new Course
    Given I am RHS CRM
    When I navigate to 'Course' Session
    And I fill the course Main details
      | Fields           | Value                                                                                     |
      | Code Name        | RHS Ah Hoc Doc Template                                                                   |
      | Course Title     | Tester's Note This is for testing purpose'                                                |
      | Course Summary   | This Course is for the RHS student and yes                                                |
      | Web Image Url    | /getmedia/d9dd6b6b-b359-4485-86fd-869f7e1d8889/Growing-and-Cooking-with-Maths-and-Science |
      | Learning Outcome | RHS Ah Hoc Doc Template                                                                   |
      | Addictional Info | Tester's Note This is for testing purpose'                                                |
    And I fill Out Date/Location
      | Fields             | Value                                      |
      | Website Venue Desc | Tester's Note This is for testing purpose' |
    And I fill Out Session
      | Fields                     | Value                                |
      | Title                      | RHS Ah Hoc Doc Session TitleTemplate |
      | Max Paid Bookings          | 10                                   |
      | Max Complimentary Bookings | 10                                   |
    And I fill Out Ticket TicketPrice
      | Fields                   | Value                                      |
      | Desc                     | Tester's Note This is for testing purpose' |
      | Price                    | 10                                         |
      | Early Bird               | 5                                          |
      | Multi-Booking Discount   | 0                                          |
      | Multi-Booking Threadhold | 0                                          |
    Then I should be able to Create a Course


  @AddCourseCatering
  Scenario: I want to add Course Catering
    Given I am on the RHS CRM 
    When I navigate to the Course Catering
    And I Add Course Catering
    Then I should see new Course created

  @EditCourseCatering
  Scenario: I want to edit Course Catering details
    Given I am on the RHS CRM
    When I navigate to the Course Catering
    And I edit Course Catering
    Then I should see new Course created

  @EidtCourseSession
  Scenario: I want to edit course session
    Given I am on the RHS CRM
    When I navigate to the Course session
    And I edit Course Session
    Then I should get a  confirmation nmessage

  @FilterCourse
  Scenario: I want to filter course by sevaral criterials
    Given I am on the RHS CRM
    When I navigate the to the 'Course' page
    And I do a search by 'Course' 'Title' 'Trainers' 'Venue' 'Region'

  @EditCourseDetails
  Scenario: I want 'Edit Course' details
    Given I am on the RHS CRM
    When I navigate to 'Course page'
    And I edit some details
    Then I should get the desired result

  @EditCourseTicketPrices
  Scenario: I want to edit Course Ticket Prize
    Given am on the RHS CM
    When I navigate to the Course Ticket page
    And I amend some details
    Then I should get the right tickets
  