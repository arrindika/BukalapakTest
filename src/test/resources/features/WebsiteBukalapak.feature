@Web
Feature: Bukalapak Website

  @Login
  Scenario: User Login with valid username and password
    Given User open login page bukalapak
    When User input email "" on email field
    And User input password "" on password field
    And User click Login on login page
    Then User Login successfull