package com.at.stepdefinitions;

import com.at.factories.DriverFactory;
import com.at.pageobject.AdminPage;
import com.at.pageobject.LogInPage;

import io.cucumber.java.en.And;

public class AdminSteps extends DriverFactory {
	
	@And("click on Users button")
	public void click_on_users_button() throws Throwable {
		
		new AdminPage(driver).clickOnUserButton();
		
	}
	@And("show all users {string}")
	public void show_all_users(String s) throws Throwable {

		Thread.sleep(5000);
		new AdminPage(driver).setShowNumber(s);
		Thread.sleep(5000);
		new AdminPage(driver).scrollDown();
		Thread.sleep(5000);
	}
}
