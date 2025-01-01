Feature: calendar functionality

  Scenario: User can see the Calendar module and create new event
    Given User is on home page
    When User click on calendar button
    Then User should see  new event
    When User click to new event button
    Then User should see in right side Event title field
    And User enters random text in title field
    And  User  fills date "03/29/2023" and time "10.00" and "11.00" in both fields
    And User fill other fields and click save button
    Then User should see  event date "2023-03-29" and time "10:00 AM - 11:00 AM" on the calendar

  @HEC10-143
    Scenario: User can see the Calendar module and
               change the view by day, week, month

      Given User is on home page
      When User click on calendar button
      Then User should see view button
      And User should be able to change by day,week,month

  @meri
    Scenario: Verify that in view list page appears in English
        Given User is on home page
        When User click on calendar button
        Then User should see view button
        And User click on list option
        Then User should see days of the week in english

          | Wednesday, Sunday, Monday, Tuesday, Thursday, Thursday, Friday, Saturday, Sunday, Wednesday, Friday|


  @HEC10-203
  Scenario: Update calendar event
    Given User is on home page
    When User click on calendar button
    Then User should see  new event
    When User click to new event button
    Then User should see in right side Event title field
    And User enters random text in title field
    And  User  fills date "04/09/2023" and time "10.00" and "11.00" in both fields
    And User fill other fields and click save button
    Then User should see  event date "2023-04-09" and time "10:00 AM - 11:00 AM" on the calendar
    And User click on that event
    And User  changes title in title field
    Then User clicks update button
    Then user clicks on that event and delete it









