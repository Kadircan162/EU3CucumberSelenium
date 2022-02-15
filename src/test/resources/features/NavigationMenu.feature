@navigate
Feature: Logged in sales managers should be able to navigate to pages using the top menu. Once in the expected page,
  user should see correct page Title.

  @TC-1
  Scenario: Navigate to Fleet > Vehicles using the top menu
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Fleet, Vehicle page
    Then the title should be Vehicles

  @TC-2 @db  @test2
  Scenario: Navigate to Marketing > Campaigns using the top menu
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Marketing, Campaigns page
    Then the title should be Campaigns

  @TC-3
  Scenario: Navigate to Activities > Calendar Events
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Activities, Calendar Events page
    Then the title should be Calendar Events


  Scenario: Navigate to given modules and verify it by page subtitle
    Given the user is on the login page
    And the user logs in as the user type > "driver"
    When the user navigates to "Activities" > "Calendar Events" module
    Then the subtitle is "Calendar Events"


  Scenario: Navigate to given modules and verify it by Page title
    Given the user is on the login page
    And the user logs in as the user type > "store manager"
    When the user navigates to "Fleet" > "Vehicles Model" module
    Then the title contains "Vehicles Model"

   @setupAndKill
  Scenario: Menu options list
    Given the user is on the login page
    And the user logs in as the user type > "driver"
    Then the user should see the following menuOptions
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |
