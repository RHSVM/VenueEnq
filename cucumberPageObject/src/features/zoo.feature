Feature: Test Page Headings

  Scenario Outline: Test Contact page Heading
    Given I am on the zoo site
    When I click on <link>
    Then I check I am on  <Title>
    And I close the browser

    Examples: 
      | Link          | Title    |
      | adoption_link | Adoption |
      | about_link    | About    |
      | contact_link  | Contact  |
      | home_link     | Home     |

  @AddNewCourseVenues
  Scenario Outline: I want to add Venue
    Given I am on HRS CRM
    When I navigate to Venue page
    Then I new venue should be added
    And I populate the form for Venue

    Examples: 
      | Venue Description | Note   | Venue Parking Detils   | Public Transport | Venue access Details | Venue Capacity |
      | Venue Desc 1      | Note 1 | Park on the left lane  | abcd123          | foo                  | 100            |
      | Venue Desc 2      | Note 2 | Park on the right lane | abcd123          | bar                  | 100            |

  Scenario Outline: Open practiceselenium.com website and fill multiple values
    When I open practiceselenium website
    And I fill "<firstname>" "<lastname>" "<sex>" "<yrs>" "<date_stopped>"
    And I fill "<tea>" "<excited_about>" "<continent>" and "<selenium_commands>"
    And I hit submit button
    Then I go back to Welcome page and verify title

    Examples: 
      | firstname | lastname | sex    | yrs | date_stopped | tea        | excited_about      | continent | selenium_commands   |
      | Pradeep   | kumar    | Male   | 2   | 1/1/2000     | Red Tea    | Break              | Europe    | Navigation Commands |
      | Greg      | Mont     | Male   | 1   | 1/1/2001     | Black Tea  | Harmless Addiction | Asia      | Browser Commands    |
      | Rex       | Morg     | Male   | 3   | 3/1/2010     | oolong tea | Harmless Addiction | USA       | Wait Commands       |
      | Captain   | Cook     | Male   | 5   | 5/2/2010     | Red Tea    | Harmless Addiction | USA       | Switch Commands     |
      | Michele   | Bing     | Female | 5   | 5/2/2011     | Black Tea  | Harmless Addiction | USA       | Switch Commands     |

  @Add/EditPersonPsyuedonymns
  Scenario: I want to Add and Edit Person Psyuedonymns
    Given I am on the CRM User page
    When I add and edit Person Psyuedonymns
    Then I should be able to hide celebrity/vip known people by a collection of departments or users

  @Practice
  Scenario Outline: Open practiceselenium.com website and fill multiple valuess
    Given I open practiceselenium websites
    When I fill "<firstname>" "<lastname>" "<sex>" "<yrs>" "<date_stopped>"
    And I fill "<tea>" "<excited_about>" "<continent>" and "<selenium_commands>"
    And I hit submit button
    Then I go back to Welcome page and verify title

    Examples: 
      | firstname | lastname | sex    | yrs | date_stopped | tea        | excited_about      | continent | selenium_commands   |
      | Pradeep   | kumar    | Male   | 2   | 1/1/2000     | Red Tea    | Break              | Europe    | Navigation Commands |
      | Greg      | Mont     | Male   | 1   | 1/1/2001     | Black Tea  | Harmless Addiction | Asia      | Browser Commands    |
      | Rex       | Morg     | Male   | 3   | 3/1/2010     | oolong tea | Harmless Addiction | USA       | Wait Commands       |
      | Captain   | Cook     | Male   | 5   | 5/2/2010     | Red Tea    | Harmless Addiction | USA       | Switch Commands     |
      | Michele   | Bing     | Female | 5   | 5/2/2011     | Black Tea  | Harmless Addiction | USA       | Switch Commands     |
