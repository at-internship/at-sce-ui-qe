@admin
Feature:
  As a user
  I want to be able to sign in to the application

  Background:
    Given user goes to "logInView" page

@regresionGetAllUsers @1
Scenario: get all users
  Given I have a user with "admin@agilethought.com" email
  And password as "4Gil3th0ught"
  When user choose to sign in
  Then should be logged into application
  And user goes to "AdminView" page 
  And click on Users button
  And show all users
