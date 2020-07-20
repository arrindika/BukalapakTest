@Web
Feature: Bukalapak Website

  @Login
  Scenario: User Login with valid username and password
    Given User open login page bukalapak
    When User input email "fanikim00@gmail.com" on email field
    And User input password "P@ssw0rd" on password field
    And User click Login on login page
    Then User is on Homepage

  @SearchProduct
  Scenario: User Login with valid username and password
    Given User open login page bukalapak
    When User input email "" on email field
    And User input password "" on password field
    And User click Login on login page
    And User is on Homepage
    When User search with keyword "" on search field
    And User click search icon for search the keyword
    Then User got the result of keyword "" on page

  @AddToCart
  Scenario: User Login with valid username and password
    Given User open login page bukalapak
    When User input email "" on email field
    And User input password "" on password field
    And User click Login on login page
    And User is on Homepage
    When User search with keyword "" on search field
    And User click search icon for search the keyword
    And User got the result of keyword "" on page
    When User choose the first item
    And User click add to cart button
    And User click see the cart
    Then User see the item in the cart

