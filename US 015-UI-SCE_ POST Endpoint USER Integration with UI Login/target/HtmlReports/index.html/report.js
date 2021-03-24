$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 2,
  "name": "Website to test different types of Scenarios",
  "description": "       as a user I want to test this web page with different test cases",
  "id": "website-to-test-different-types-of-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5732343700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Valid email and valid password is entered",
  "description": "",
  "id": "website-to-test-different-types-of-scenarios;valid-email-and-valid-password-is-entered",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Probar"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user enters the web page AT Software Cost Estimation, they must fill in the requested data",
  "keyword": "When "
});
formatter.match({
  "location": "Verify_webpage_behavior_when_valid_email_and_valid_password_is_entered.the_user_enters_the_web_page_AT_Software_Cost_Estimationthey_must_fill_in_the_requested_data()"
});
formatter.result({
  "duration": 6695741400,
  "status": "passed"
});
formatter.after({
  "duration": 706339900,
  "status": "passed"
});
formatter.before({
  "duration": 4017802900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Invalid email and valid password is entered",
  "description": "",
  "id": "website-to-test-different-types-of-scenarios;invalid-email-and-valid-password-is-entered",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Probar"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Error message when the email invalid format",
  "keyword": "When "
});
formatter.match({
  "location": "Verify_webpage_behavior_when_invalid_email_and_valid_password_is_entered.error_message_when_the_email_invalid_format()"
});
formatter.result({
  "duration": 4391292300,
  "status": "passed"
});
formatter.after({
  "duration": 879757300,
  "status": "passed"
});
formatter.before({
  "duration": 4391181200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Valid email and invalid password is entered",
  "description": "",
  "id": "website-to-test-different-types-of-scenarios;valid-email-and-invalid-password-is-entered",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Probar"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Error message when the password invalid format",
  "keyword": "When "
});
formatter.match({
  "location": "verify_webpage_behavior_when_valid_email_and_invalid_password_is_entered.error_message_when_the_password_invalid_format()"
});
formatter.result({
  "duration": 5449086800,
  "status": "passed"
});
formatter.after({
  "duration": 716653400,
  "status": "passed"
});
formatter.before({
  "duration": 3666175300,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "The user to logout when click in the logout button.",
  "description": "",
  "id": "website-to-test-different-types-of-scenarios;the-user-to-logout-when-click-in-the-logout-button.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Probar"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "the user log in successfully in the web page AT Software Cost Estimation",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "the user wants to exit the page by clicking on the logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "Verify_the_webpage_allows_the_user_to_logout_when_click_in_the_logout_button.the_user_log_in_successfully_in_the_web_page_AT_Software_Cost_Estimation()"
});
formatter.result({
  "duration": 3363880100,
  "status": "passed"
});
formatter.match({
  "location": "Verify_the_webpage_allows_the_user_to_logout_when_click_in_the_logout_button.the_user_wants_to_exit_the_page_by_clicking_on_the_logout_button()"
});
formatter.result({
  "duration": 2901663100,
  "status": "passed"
});
formatter.after({
  "duration": 686520200,
  "status": "passed"
});
});