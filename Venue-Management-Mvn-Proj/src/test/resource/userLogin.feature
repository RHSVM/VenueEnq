Feature:  UserLogin

  Background: 
    Given I am on the Home page
    When click my Account button
    Then I see a welcome message

  @signin
  Scenario Outline: User should log in successfully
    When I enter <username> in email field
    And I enter <password> in password field
    And I click Login button
    Then I am logged in
    And I log out

    Examples: 
      | username             | password    |
      | maxwell174@gmail.com | password123 |
