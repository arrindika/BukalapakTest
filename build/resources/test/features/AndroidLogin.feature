@Android @Login
Feature: Login

  @Positive
  Scenario: User Login with valid username and password
    Given User is on Login Page
    When User input email "boboy@gmail.com" on email text field
    Given User input password "P@ssw0rd" on password text field
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
    |      boboy@gmail.com      |       P@ssw0r       |      Wrong Email or Password     |
    |      boboy@gmail.co       |       P@ssw0rd      |      Wrong Email or Password     |
    |      boboy@gmail.co       |       P@ssw0r       |      Wrong Email or Password     |

  @NegativeEmpty
  Scenario Outline:
    Given User is on Login Page
    When User input email "<email>" on email text field
    Given User input password "<password>" on password text field
    And User click login button on Login page
    Then User see error message field that "<message>"

    Examples:
      |           email           |       password      |           message          |
      |      boboy@gmail.com      |                     |      Enter Valid Email     |
      |                           |       P@ssw0rd      |      Enter Valid Email     |
      |                           |                     |      Enter Valid Email     |