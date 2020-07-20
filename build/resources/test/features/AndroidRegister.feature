@Android @Register
Feature: Register

  Background:
    Given User is on Login Page
    When User click register button on Login page

  @Positive
  Scenario: User register with valid data
    Given User is on Register Page
    When User input new name "cekcek" on name text field
    And User input new email "cekcek@gmail.com" on name text field
    And User input new password "password" on new password text field
    And User input confirmation password "password" on confirmation password text field
    And User click Register button
    Then User register complete with messagge ""

  Scenario: User register with registered data
    Given User is on Register Page
    When User input new name "cekcek" on name text field
    And User input new email "cekcek@gmail.com" on name text field
    And User input new password "password" on new password text field
    And User input confirmation password "password" on confirmation password text field
    And User click Register button
    Then User register uncomplete with message ""

  Scenario Outline: User register with invalid data
    Given User is on Register Page
    When User input new name "<name>" on name text field
    And User input new email "<email>" on name text field
    And User input new password "<password>" on new password text field
    And User input confirmation password "<confirm password>" on confirmation password text field
    And User click Register button
    Then User see error message "<message>"

    Examples:
      |     name      |           email           |       password      |       confirm password      |             message              |
      |          |           cekcek@gmail.com           |       password      |       password      |             message              |
      |     cekcek      |           cekcekgmail.com           |       password      |       password      |             message              |
      |     cekcek      |                      |       password      |       password      |             message              |
      |     cekcek      |           cekcek@gmail.com           |             |       password      |             message              |
      |     cekcek      |           cekcek@gmail.com           |       password      |       passwor      |             message              |
      |     cekcek      |           cekcek@gmail.com           |       password      |             |             message              |