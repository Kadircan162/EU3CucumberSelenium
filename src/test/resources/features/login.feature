@regression
Feature: Users should be able to login

  @execute_driver @smoke
  Scenario: Login as a driver
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login

  @execute_sales-manager
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login

  @execute_store-manager @smoke
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login

  @execute_stock-manager @smoke
  Scenario: Login as a stock manager
    Given the user is on the login page
    When the user enters the stock manager information
    Then the user should be able to login

  @execute_transportation-manager @execute_driver @smoke
  Scenario: Login as a transportation manager
    Given the user is on the login page
    When the user enters the transportation manager information
    Then the user should be able to login

  @execute_product-manager @execute_driver @smoke
  Scenario: Login as a product qualifier
    Given the user is on the login page
    When the user enters the product qualifier information
    Then the user should be able to login
