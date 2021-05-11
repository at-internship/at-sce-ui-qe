@Admin
Feature:
  As a user I want to be able to create a user in the admin form

  Background:
    Given user goes to "logInView" page
    Given I have a user with "ulises.santiago@gmail.com" email
    And password as "ulisesSantiago1"
    When user choose to sign in
    Then should be logged into application
    When goes to the webpage of Admin for create a user

    @3
  Scenario: login and access the administrator view to create a user
  Then click in the button Add new user
  And the type is "User"
  And the FirstName is "prueba"
  And the LastName is "testeo"
  And the Email is "prueba123@gmail.com"
  And the password is "Sandia123456"
  And the Status is "Active"
  And User click in the save button
  Then The following message "User created successfully" should be displayed


@4
  Scenario: login and access the administrator view to update a user
  And find the user "prueba"
  Then click in the button the edit
  And the type is "Admin"
  And the FirstName is " segundo 2"
  And the LastName is " segundo 2"
  And the Email is "hola"
  And the password is "Sandia1234567"
  And the Status is "Inactive"
  And User click in the save button
  Then show the following message "User Updated Successfully"




@5
  Scenario: login and access the administrator view to delete a user
  And find the user "prueba"
  And click in the delete button
  And it will show the following message "User Deleted Successfully"


@6
  Scenario: error message Type field is missing
  Then click in the button Add new user
  And the type is ""
  And the FirstName is "prueba"
  And the LastName is "testeo"
  And the Email is "prueba123@gmail.com"
  And the password is "Sandia123456"
  And the Status is "Active"
  And User click in the save button
  Then Message of error "Please Enter a Type." should be displayed


  @7
  Scenario: error message FirstName field is missing
    Then click in the button Add new user
    And the type is "User"
    And the FirstName is ""
    And the LastName is "testeo"
    And the Email is "prueba123@gmail.com"
    And the password is "Sandia123456"
    And the Status is "Active"
    And User click in the save button

  @8
  Scenario: error message LastName field is missing
    Then click in the button Add new user
    And the type is "User"
    And the FirstName is "prueba"
    And the LastName is ""
    And the Email is "prueba123@gmail.com"
    And the password is "Sandia123456"
    And the Status is "Active"
    And User click in the save button

  @9
  Scenario: error message Email field is missing
    Then click in the button Add new user
    And the type is "User"
    And the FirstName is "prueba"
    And the LastName is "testeo"
    And the Email is ""
    And the password is "Sandia123456"
    And the Status is "Active"
    And User click in the save button



  @10
  Scenario: error message Password field is missing
    Then click in the button Add new user
    And the type is ""
    And the FirstName is "prueba"
    And the LastName is "testeo"
    And the Email is "prueba123@gmail.com"
    And the password is ""
    And the Status is "Active"
    And User click in the save button
    Then Message of error "Please Type a Password." should be displayed

  @11
  Scenario: error message Status field is missing
    Then click in the button Add new user
    And the type is "User"
    And the FirstName is "prueba"
    And the LastName is "testeo"
    And the Email is "prueba123@gmail.com"
    And the password is "Sandia123456"
    And the Status is ""
    And User click in the save button