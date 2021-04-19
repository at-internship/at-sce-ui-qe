@MainPage

Feature: As a user I want to be able to clean estimacion costs

  Background: 
    Given user goes to "logInView" page

  @1
  Scenario: Clean button 
    Given I have a user with "admin@agilethought.com" email
    And password as "4Gil3th0ught"
    When user choose to sign in
    Then should be logged into application
    And complete calculator form 
    And user push clean button 
    And result fileds should be 0.00
    
