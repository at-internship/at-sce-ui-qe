package com.at.stepdefinitions;

import com.at.factories.DriverFactory;
import com.at.pageobject.AdminPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AdminSteps extends DriverFactory {


        @When("goes to the webpage of Admin for create a user")
        public void goes_to_the_webpage_of_Admin_for_create_a_user () throws Throwable {
            driver.get("https://at-sce-ui-qa.herokuapp.com/admin/user");
        }


        @When("click in the button Add new user")
        public void click_in_the_button_Add_new_user () throws Throwable {
            new AdminPage(driver).user();
        }

        @Given("the type is {string}")
        public void the_type_is (String user_type) throws Throwable {
            new AdminPage(driver).types(user_type);

        }


        @Given("the FirstName is {string}")
        public void the_FirstName_is (String user_firstName) throws Throwable {
            new AdminPage(driver).firstname(user_firstName);
        }

        @Given("the LastName is {string}")
        public void the_LastName_is (String user_lastName) throws Throwable {
            new AdminPage(driver).lastname(user_lastName);
        }

        @Given("the Email is {string}")
        public void the_Email_is (String user_email) throws Throwable {
            new AdminPage(driver).Email(user_email);
        }

        @Given("the password is {string}")
        public void the_password_is (String user_password) throws Throwable {
            new AdminPage(driver).Password(user_password);
        }

        @Given("the Status is {string}")
        public void the_status_is (String user_status) throws Throwable {
            new AdminPage(driver).status(user_status);
        }

        @When("User click in the save button")
        public void User_click_in_the_save_button () throws Throwable {
            new AdminPage(driver).save();

        }

        @Then("The following message {string} should be displayed")
        public void the_following_message_should_be_displayed (String messageSave)throws Throwable {
            Assert.assertTrue(new AdminPage(driver).SaveDisplayed(messageSave));

        }

        @Then("it will show the following message {string}")
        public void it_will_show_the_following_message (String messageDelete)throws Throwable {
            Assert.assertTrue(new AdminPage(driver).DeleteDisplayed(messageDelete));
        }

        @Then("show the following message {string}")
        public void show_the_following_message (String messageUpdate)throws Throwable {
            Assert.assertTrue(new AdminPage(driver).UpdateDisplayed(messageUpdate));
        }

        @Then("Message of error {string} should be displayed")
        public void Message_of_error_should_be_displayed (String messageError)throws Throwable {
            Assert.assertTrue(new AdminPage(driver).ErrorDisplayed(messageError));
        }

        @When("click in the edit button")
        public void click_in_the_edit_button () throws Throwable {
            new AdminPage(driver).edit();
        }
        @When("click in the delete button")
        public void click_in_the_delete_button () throws Throwable {
            new AdminPage(driver).delete();
        }
        @Given("find the user {string}")
        public void find_the_user (String usersTable_filter) throws Throwable {
            new AdminPage(driver).search(usersTable_filter);
        }

        @Then("click in the button the edit")
        public void click_in_the_button_the_edit () throws Throwable {
            new AdminPage(driver).edit();
        }
    }

