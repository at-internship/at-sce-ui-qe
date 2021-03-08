$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test website",
  "description": "as a user I want to test this web page with different test cases",
  "id": "test-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9546657500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "fill all the fields of the form in a valid format",
  "description": "",
  "id": "test-website;fill-all-the-fields-of-the-form-in-a-valid-format",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "The user should open the webpage Automation Demo Site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user enters the web page, they must fill in the requested data",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Once finished, the submit button will be clicked to send the data and the browser will be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.the_user_should_open_the_webpage_Automation_Demo_Site()"
});
formatter.result({
  "duration": 179091900,
  "status": "passed"
});
formatter.match({
  "location": "Test.the_user_enters_the_web_page_they_must_fill_in_the_requested_data()"
});
formatter.result({
  "duration": 14315641900,
  "status": "passed"
});
formatter.match({
  "location": "Test.once_finished_the_submit_button_will_be_clicked_to_send_the_data_and_the_browser_will_be_closed()"
});
formatter.result({
  "duration": 1574080400,
  "status": "passed"
});
formatter.after({
  "duration": 700264200,
  "status": "passed"
});
formatter.before({
  "duration": 7104977000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "only with the required fields",
  "description": "",
  "id": "test-website;only-with-the-required-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "the user enters the web page they must fill only with the required fields",
  "keyword": "When "
});
formatter.match({
  "location": "required_fields.the_user_enters_the_web_page_they_must_fill_only_with_the_required_fields()"
});
formatter.result({
  "duration": 11024101600,
  "status": "passed"
});
formatter.after({
  "duration": 683732600,
  "status": "passed"
});
formatter.before({
  "duration": 7364155300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "The data is invalid",
  "description": "",
  "id": "test-website;the-data-is-invalid",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Error message when the data is invalid format",
  "keyword": "When "
});
formatter.match({
  "location": "The_data_is_invalid.Error_message_when_the_data_is_invalid_format()"
});
formatter.result({
  "duration": 14653702300,
  "status": "passed"
});
formatter.after({
  "duration": 683509400,
  "status": "passed"
});
formatter.before({
  "duration": 5838949800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "last name is invalid format",
  "description": "",
  "id": "test-website;last-name-is-invalid-format",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Error message when the last name is invalid format",
  "keyword": "When "
});
formatter.match({
  "location": "last_name_is_invalid_format.error_message_when_the_last_name_is_invalid_format()"
});
formatter.result({
  "duration": 15695437700,
  "status": "passed"
});
formatter.after({
  "duration": 703425400,
  "status": "passed"
});
formatter.before({
  "duration": 8731489200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "the first name is invalid format",
  "description": "",
  "id": "test-website;the-first-name-is-invalid-format",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "Error message when the first name is invalid format",
  "keyword": "When "
});
formatter.match({
  "location": "First_name_is_invalid_format.error_message_when_the_first_name_is_invalid_format()"
});
formatter.result({
  "duration": 15816658500,
  "status": "passed"
});
formatter.after({
  "duration": 694562500,
  "status": "passed"
});
formatter.before({
  "duration": 7208618300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Email invalid format",
  "description": "",
  "id": "test-website;email-invalid-format",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "Error message when the email invalid format",
  "keyword": "When "
});
formatter.match({
  "location": "Email_invalid_format.Error_message_when_the_email_invalid_format()"
});
formatter.result({
  "duration": 15713186000,
  "status": "passed"
});
formatter.after({
  "duration": 679650100,
  "status": "passed"
});
formatter.before({
  "duration": 7704533000,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Gender is not selected",
  "description": "",
  "id": "test-website;gender-is-not-selected",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "Error message when the gender is not selected",
  "keyword": "When "
});
formatter.match({
  "location": "Gender_is_not_selected.Error_message_when_the_gender_is_not_selected()"
});
formatter.result({
  "duration": 15596428900,
  "status": "passed"
});
formatter.after({
  "duration": 684423600,
  "status": "passed"
});
formatter.before({
  "duration": 7176552500,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Date birth is not selected",
  "description": "",
  "id": "test-website;date-birth-is-not-selected",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "Error message when the date birth is not selected",
  "keyword": "When "
});
formatter.match({
  "location": "Date_birth_is_not_selected.Error_message_when_the_date_birth_is_not_selected()"
});
formatter.result({
  "duration": 15512121600,
  "status": "passed"
});
formatter.after({
  "duration": 679169300,
  "status": "passed"
});
formatter.before({
  "duration": 8809773500,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "password is invalid with 3 categories (UpperCase,lowerCase alphabet and a number)",
  "description": "",
  "id": "test-website;password-is-invalid-with-3-categories-(uppercase,lowercase-alphabet-and-a-number)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "Error message when the password is invalid with 3 categories",
  "keyword": "When "
});
formatter.match({
  "location": "password_is_invalid_with_3_categories.Error_message_when_the_password_is_invalid_with_3_categories()"
});
formatter.result({
  "duration": 15598841800,
  "status": "passed"
});
formatter.after({
  "duration": 682318700,
  "status": "passed"
});
formatter.before({
  "duration": 6911016800,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "password is less than 6 characters",
  "description": "",
  "id": "test-website;password-is-less-than-6-characters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "Error message when password is less than 6 characters",
  "keyword": "When "
});
formatter.match({
  "location": "password_is_less_than_6_characters.Error_message_when_the_password_is_less_than_6_characters()"
});
formatter.result({
  "duration": 15816811400,
  "status": "passed"
});
formatter.after({
  "duration": 672982200,
  "status": "passed"
});
formatter.before({
  "duration": 9424098800,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "confirm password is invalid",
  "description": "",
  "id": "test-website;confirm-password-is-invalid",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "Error Message when confirm password is invalid",
  "keyword": "When "
});
formatter.match({
  "location": "confirm_password_is_invalid.Error_message_when_confirm_password_is_invalid()"
});
formatter.result({
  "duration": 15687883100,
  "status": "passed"
});
formatter.after({
  "duration": 682484100,
  "status": "passed"
});
formatter.before({
  "duration": 7645368000,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "phone doesn\u0027t contain numbers",
  "description": "",
  "id": "test-website;phone-doesn\u0027t-contain-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "Error Message when phone doesnt contain numbers",
  "keyword": "When "
});
formatter.match({
  "location": "phone_doesnt_contain_numbers.error_Message_when_phone_doesnt_contain_numbers()"
});
formatter.result({
  "duration": 15609798300,
  "status": "passed"
});
formatter.after({
  "duration": 690572300,
  "status": "passed"
});
formatter.before({
  "duration": 7413125900,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Country is not selected",
  "description": "",
  "id": "test-website;country-is-not-selected",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 52,
  "name": "Error Message when country is not selected",
  "keyword": "When "
});
formatter.match({
  "location": "Country_is_not_selected.Error_message_when_country_is_not_selected()"
});
formatter.result({
  "duration": 14774404700,
  "status": "passed"
});
formatter.after({
  "duration": 701129800,
  "status": "passed"
});
formatter.before({
  "duration": 7991964400,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Phone contains more than 10 numbers",
  "description": "",
  "id": "test-website;phone-contains-more-than-10-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "Error Message when phone contains more than 10 numbers",
  "keyword": "When "
});
formatter.match({
  "location": "Phone_contains_more_than_10_numbers.Error_message_when_phone_contains_more_than_10_numbers()"
});
formatter.result({
  "duration": 15659043000,
  "status": "passed"
});
formatter.after({
  "duration": 673780200,
  "status": "passed"
});
formatter.before({
  "duration": 7547766900,
  "status": "passed"
});
formatter.scenario({
  "line": 58,
  "name": "Phone contains less than 10 numbers",
  "description": "",
  "id": "test-website;phone-contains-less-than-10-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 59,
  "name": "Error Message when phone contains less than 10 numbers",
  "keyword": "When "
});
formatter.match({
  "location": "Phone_contains_less_than_10_numbers.Error_message_when_phone_contains_less_than_10_numbers()"
});
formatter.result({
  "duration": 15582307800,
  "status": "passed"
});
formatter.after({
  "duration": 674913000,
  "status": "passed"
});
formatter.before({
  "duration": 7280165900,
  "status": "passed"
});
formatter.scenario({
  "line": 61,
  "name": "The address is invalid format",
  "description": "",
  "id": "test-website;the-address-is-invalid-format",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 62,
  "name": "The address is invalid format",
  "keyword": "When "
});
formatter.match({
  "location": "Address_is_invalid.the_address_is_invalid_format()"
});
formatter.result({
  "duration": 15704503700,
  "status": "passed"
});
formatter.after({
  "duration": 700870700,
  "status": "passed"
});
formatter.before({
  "duration": 6899287000,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "Don\u0027t select any Hobbies options",
  "description": "",
  "id": "test-website;don\u0027t-select-any-hobbies-options",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 66,
  "name": "Dont select any Hobbies options",
  "keyword": "When "
});
formatter.match({
  "location": "Dont_select_any_Hobbies_options.Dont_select_any_Hobbies_options()"
});
formatter.result({
  "duration": 15554116200,
  "status": "passed"
});
formatter.after({
  "duration": 669184800,
  "status": "passed"
});
formatter.before({
  "duration": 10239977600,
  "status": "passed"
});
formatter.scenario({
  "line": 69,
  "name": "Several options are repeated",
  "description": "",
  "id": "test-website;several-options-are-repeated",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 70,
  "name": "You select the hobbies option and several options are repeated",
  "keyword": "When "
});
formatter.match({
  "location": "Hobbies_several_options_are_repeated.You_select_the_hobbies_option_and_several_options_are_repeated()"
});
formatter.result({
  "duration": 15685148900,
  "status": "passed"
});
formatter.after({
  "duration": 701245300,
  "status": "passed"
});
formatter.before({
  "duration": 6570784800,
  "status": "passed"
});
formatter.scenario({
  "line": 73,
  "name": "Languages is not selected",
  "description": "",
  "id": "test-website;languages-is-not-selected",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 74,
  "name": "Languages is not selected",
  "keyword": "When "
});
formatter.match({
  "location": "Languages_is_not_selected.Languages_is_not_selected()"
});
formatter.result({
  "duration": 15616040000,
  "status": "passed"
});
formatter.after({
  "duration": 679252300,
  "status": "passed"
});
formatter.before({
  "duration": 7553529600,
  "status": "passed"
});
formatter.scenario({
  "line": 77,
  "name": "The skills is not selected",
  "description": "",
  "id": "test-website;the-skills-is-not-selected",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 78,
  "name": "The skills is not selected",
  "keyword": "When "
});
formatter.match({
  "location": "The_skills_is_not_selected.The_skills_is_not_selected()"
});
formatter.result({
  "duration": 15485870000,
  "status": "passed"
});
formatter.after({
  "duration": 685544200,
  "status": "passed"
});
});