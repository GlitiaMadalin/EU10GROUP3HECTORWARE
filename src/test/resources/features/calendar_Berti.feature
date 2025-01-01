Feature: calendar functionality

  Background:
    Given that you are in hectorWare
    When you click calendar button

  Scenario: Creating new calendar and getting the names for all calendars
    Then you should print all new calendars name

  Scenario: Select one calendar from pre created calendars
    When you give "Week3" here and I should click on the three dots on the left

  Scenario: Click one options from three dots of calendars
    When you give "Week3" here and I should click on that calendar


  Scenario: Click one options from three dots of calendars
    When you give "Week3" here and I should click on the three dots on the left
    And you give "Edit name" I should click on that calendar and rename it to "Week11"


  Scenario: Checking
    When Checking