@login
Feature: Users should be able to login

  Background:
    Given the user is on the login page
    And the title contains "Login"

  @driver @setupAndKill
  Scenario: Login as a driver
    When the user enters the driver information
    Then the user should be able to login

  @sales_manager @setupAndKill
  Scenario: Login as a sales manager
    When the user enters the sales manager information
    Then the user should be able to login

  @store_manager @setupAndKill
  Scenario: Login as a store manager
    When the user enters the store manager information
    Then the user should be able to login