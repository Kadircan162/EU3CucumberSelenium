Feature: Contacts page

   @setupAndKill
  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    And the user should be able to login
    When the user navigates to "Customers" "Contacts"
    Then the page number is 1

   @setupAndKill
  Scenario Outline: login as a given user <userName> and verify that the account info is the same with the given info
    Given the user is on the login page
    When the user logs in the following credentials
      | userName  | <userName>  |
      | password  | <password>  |
      | firstName | <firstName> |
      | lastName  | <lastName>  |
    And the user should be able to login
    Then verify the "<firstName>" and the "<lastName>" are correct

    Examples:
      | userName        | password    | firstName | lastName |
      | user10          | UserUser123 | John      | Doe      |
      | salesmanager101 | UserUser123 | John      | Doe      |
      | storemanager86  | UserUser123 | John      | Doe      |




