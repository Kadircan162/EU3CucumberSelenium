Feature: Contacts page

  @db
  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" > "Contacts" module
    Then the page number is 1

   @setupAndKill
  Scenario: login as a given user and verify that the account info is the same with the given info
    Given the user is on the login page
    When the user logs in the following credentials
      | username | user10      |
      | password | UserUser123 |
    And the user should be able to login
    Then verify the firstname and the lastname are correct
      | firstname | John |
      | lastname  | Doe  |


