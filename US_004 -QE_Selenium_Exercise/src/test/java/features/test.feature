Feature: Test website
  as a user I want to test this web page with different test cases

  Scenario: fill all the fields of the form in a valid format
    Given The user should open the webpage Automation Demo Site
    When the user enters the web page, they must fill in the requested data
    Then Once finished, the submit button will be clicked to send the data and the browser will be closed

Scenario:  only with the required fields
  When the user enters the web page they must fill only with the required fields


    Scenario: The data is invalid
  When Error message when the data is invalid format


  Scenario: last name is invalid format
    When Error message when the last name is invalid format

    Scenario: the first name is invalid format
    When Error message when the first name is invalid format


  Scenario: Email invalid format
  When Error message when the email invalid format


  Scenario: Gender is not selected
  When Error message when the gender is not selected


    Scenario: Date birth is not selected
    When Error message when the date birth is not selected

    Scenario: password is invalid with 3 categories (UpperCase,lowerCase alphabet and a number)
    When Error message when the password is invalid with 3 categories


    Scenario: password is less than 6 characters
    When Error message when password is less than 6 characters

  Scenario: confirm password is invalid
  When Error Message when confirm password is invalid


  Scenario:  phone doesn't contain numbers
    When Error Message when phone doesnt contain numbers



    Scenario: Country is not selected
      When Error Message when country is not selected


  Scenario: Phone contains more than 10 numbers
    When Error Message when phone contains more than 10 numbers

  Scenario: Phone contains less than 10 numbers
    When Error Message when phone contains less than 10 numbers

  Scenario: The address is invalid format
    When The address is invalid format


  Scenario: Don't select any Hobbies options
    When Dont select any Hobbies options


    Scenario: Several options are repeated
    When You select the hobbies option and several options are repeated


  Scenario: Languages is not selected
    When Languages is not selected


  Scenario: The skills is not selected
    When The skills is not selected