@Android @Login
Feature: Login

  @Positive
  Scenario: User Login with valid username and password
    Given User is on Login Page
    When User input email "boyiki@mail.com" on email text field
    Given User input password "password" on password text field
    And User click login button on Login page
    Then User login success

  @NegativeInvalid
  Scenario Outline: User Login with invalid username or password
    Given User is on Login Page
    When User input email "<email>" on email text field
    Given User input password "<password>" on password text field
    And User click login button on Login page
    Then User see error that "<message>"

    Examples:
    |           email           |       password      |             message              |
    |      boyiki@mail.com      |       passwor       |      Wrong Email or Password     |
    |      boyiki@mail.co       |       password      |      Wrong Email or Password     |
    |      boyiki@mail.co       |       passwor       |      Wrong Email or Password     |

  @NegativeEmpty
  Scenario Outline:
    Given User is on Login Page
    When User input email "<email>" on email text field
    Given User input password "<password>" on password text field
    And User click login button on Login page
    Then User see error message field that "<message>"

    Examples:
      |           email           |       password      |   message  |
      |      boyiki@mail.com      |                     |      2     |
      |                           |       password      |      1     |
      |                           |                     |      1     |