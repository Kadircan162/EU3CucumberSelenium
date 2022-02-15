Feature: Account Types

  @wip @setupAndKill
  Scenario: Driver user
    Given the user logs in as the user type > "Driver"
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"

  @wip @setupAndKill
  Scenario: Sales manager user
    Given the user logs in as the user type > "Sales manager"
    When the user navigates to "Customers" "Accounts"
    Then the title contains "Accounts - Customer"

  @smoke @setupAndKill
  Scenario: Store manager
    Given the user logs in as the user type > "Store manager"
    When the user navigates to "Customers" "Contacts"
    Then the title contains "Contacts - Customer"

############## DDT ###################
  @setupAndKill
  Scenario Outline: Login with different account <userType>
    Given the user logs in as the user type > "<userType>"
    When the user navigates to "<tab>" "<module>"
    Then the title contains "<title>"
    Examples:
      | userType      | tab        | module          | title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | sales manager | Customers  | Accounts        | Accounts - Customer          |
      | store manager | Customers  | Contacts        | Contacts - Customer          |

    