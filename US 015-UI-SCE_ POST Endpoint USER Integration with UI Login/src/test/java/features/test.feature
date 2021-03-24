
Feature: Website to test different types of Scenarios
         as a user I want to test this web page with different test cases

  @Probar
  Scenario: Valid email and valid password is entered
    When the user enters the web page AT Software Cost Estimation, they must fill in the requested data

  @Probar
  Scenario: Invalid email and valid password is entered
    When Error message when the email invalid format

  @Probar
  Scenario: Valid email and invalid password is entered
    When Error message when the password invalid format

  @Probar
  Scenario: The user to logout when click in the logout button.
    When the user log in successfully in the web page AT Software Cost Estimation
    Then the user wants to exit the page by clicking on the logout button


    Scenario: invalid email and invalid password is entered
      When the user tries to login


    Scenario: Email and password are left blank
      When message error data was not entered
