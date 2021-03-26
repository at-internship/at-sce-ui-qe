@LogIn
Feature:
  As a user
  I want to be able to sign in to the application

  Background:
    Given user goes to "logInView" page

@1
Scenario: Sign in using valid credentials
  Given I have a user with "example@email.com" email
  And password as "examplePassword"
  When user choose to sign in
  Then should be logged into application

@2
Scenario: Sign in using invalid credentials
  Given I have a user with "example@email.com" email
  And password as "examplePassword"
  When user choose to sign in
  Then "Not User found." message should be displayed