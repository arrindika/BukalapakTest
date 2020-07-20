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
    Then User register complete with messagge "Registration Successful"

  Scenario: User register with registered data
    Given User is on Register Page
    When User input new name "cekcek" on name text field
    And User input new email "cekcek@gmail.com" on name text field
    And User input new password "password" on new password text field
    And User input confirmation password "password" on confirmation password text field
    And User click Register button
    Then User register uncomplete with message "Email Already Exists"

  Scenario Outline: User register with invalid data
    Given User is on Register Page
    When User input new name "<name>" on name text field
    And User input new email "<email>" on name text field
    And User input new password "<password>" on new password text field
    And User input confirmation password "<confirm password>" on confirmation password text field
    And User click Register button
    Then User see error message "<message>"

    Examples:
      |     name      |         email         |       password      |   confirm password  |  message   |
      |               |   cekcek@gmail.com    |       password      |       password      |     1      |
      |     cekcek    |   cekcekgmail.com     |       password      |       password      |     2      |
      |     cekcek    |                       |       password      |       password      |     2      |
      |     cekcek    |   cekcek@gmail.com    |                     |       password      |     3      |
      |     cekcek    |   cekcek@gmail.com    |       password      |       passwor       |     4      |
      |     cekcek    |   cekcek@gmail.com    |       password      |                     |     4      |