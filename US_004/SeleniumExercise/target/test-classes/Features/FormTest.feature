Feature: Validate New resgister form

  Background: user is on register form
    Given user open the browser on the page

  @TC_004
  Scenario: Check if a new register created succesfull
    When user enters all fields correcly
    Then Click on Submit button

  Scenario: Error when first name is null
    When user enters all fields correcly execpt firstname must be null
    Then Click on Submit button

  Scenario: Error when last name is null
    When user enters all fields correcly execpt last name must be null
    Then Click on Submit button

  Scenario: Error when email is null
    When user enters all fields correcly execpt email must be null
    Then Click on Submit button

  Scenario: Error when phone is null
    When user enters all fields correcly phone must be null
    Then Click on Submit button

  Scenario: Error when gender is null
    When user enters all fields correcly gender must be null
    Then Click on Submit button

  Scenario: Error when country is null
    When user enters all fields correcly country must be null
    Then Click on Submit button

  Scenario: Error when Date of Birth is null
    When user enters all fields correcly Date of birth must be null
    Then Click on Submit button

  Scenario: Error when password is null
    When user enters all fields correcly password must be null
    Then Click on Submit button

  Scenario: Error when confirm password is null
    When user enters all fields correcly confirm passoword must be null
    Then Click on Submit button
    
	@TC_004
  Scenario: Error when email is an invalid format
    When user enters all fields correcly email is an invalid format
    Then Click on Submit button

  Scenario: Error when phone has more than ten numbers
    When user enters all fields correcly email phone has more than ten numbers
    Then Click on Submit button

  Scenario: Error when phone has less than ten numbers
    When user enters all fields correcly email phone has more than ten numbers
    Then Click on Submit button

  Scenario: Error when phone has less than ten numbers
    When user enters all fields correcly email phone has less than ten numbers
    Then Click on Submit button

  Scenario: Error when phone contains not numbers
    When user enters all fields correcly email phone phone contains not numbers
    Then Click on Submit button

  Scenario: Error when phone contains not numbers
    When user enters all fields correcly email phone phone contains not numbers
    Then Click on Submit button

  Scenario: Error when password contains less six characters
    When user enters all fields correcly password contains less six characters
    Then Click on Submit button
	@TC_004
  Scenario: Error when password contains invalid format
    When user enters all fields correcly password contains invalid format
    Then Click on Submit button
    
	@TC_004
  Scenario: Error when confirm password doesn´t match with password
    When Error when confirm password not match with password
    Then Click on Submit button
    
	@TC_004
  Scenario: Check if not obligatory fields are abligattory
    When Check if not obligatory fields are abligatories fields
    Then Click on Submit button
