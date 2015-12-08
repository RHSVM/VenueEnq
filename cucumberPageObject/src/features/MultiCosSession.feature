Feature: Add Multi Session to a Course

  @AddMultipleSessions
  Scenario Outline: I want to add multiple session to a courses
    Given I am on the RHS CRM Course Session Page
    When click my Course button
    And I navigate to Course sessions
    And I enter <coursetitle> in coursetitle fields
    And I enter <maxpaidBooking> in max fields
    And I enter <maxcompBooking> in maxComp fields
    Then I should be able to add multiple sessions

    Examples: 
      | coursetitle | maxpaidBooking | maxcompBooking |
      | session 1   | 5              | 8              |
      | session 2   | 6              | 3              |
      | session 3   | 4              | 9              |

  @AddMultiCosBookings
  Scenario: I want to add multiple session to a course
    When I navigate to Course session
    And I enter course booking information
    And I click add button
    Then I should see confirmation message
