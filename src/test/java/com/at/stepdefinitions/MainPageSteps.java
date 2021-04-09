package com.at.stepdefinitions;

import com.at.pageobject.MainPage;


import com.at.enums.Resources;
import com.at.factories.DriverFactory;
import com.at.pageobject.LogInPage;
import com.at.pageobject.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPageSteps extends DriverFactory{
	
	    
	@And("user push clean button")
	public void user_push_clean_button() throws InterruptedException {
		
		new MainPage(driver).clickCleanButton(); 
		
	}
	
	@And("result fileds should be {double}")
	public void result_fileds_should_be(Double value) throws Throwable {
	    
		Assert.assertTrue(new MainPage(driver).getCostEstimation());
	}
	
	@And("complete calculator form")
	public void complete_calculator_form() {
		
		new MainPage(driver).provideRent();
		
	}
	

}
