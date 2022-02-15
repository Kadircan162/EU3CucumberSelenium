Feature: Login as a different user

  @smoke @db
  Scenario: login as a driver user
    Given the user is on the login page
    When the user login using "user10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"

    #homework (driver, storemanager, salesmanager, )

  Scenario: login as any user
    Given the user is on the login page
    When the user logs in as the user type > "Sales manager"
    Then the title contains "Dashboards"



