package com.at.stepdefinitions;

import com.at.enums.Resources;
import com.at.factories.DriverFactory;
import com.at.pageobject.LogInPage;
import com.at.pageobject.MainPage;
import com.at.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInSteps extends DriverFactory {

    @Before
    public void beforeScenario(){
        driver = new DriverFactory().getDriver();
    }
    @After
    public void afterScenario(Scenario scenario){
    	String screen = new PropertyReader().readProperty("screenShot");
    	
    	if(screen.equals("yes")) {
    		if (scenario.isFailed()) {
                TakesScreenshot ts = (TakesScreenshot) driver;
                byte[] src = ts.getScreenshotAs(OutputType.BYTES);  
                scenario.attach(src, "image/png", "screenshot");
                System.out.println("ScrrenShoot"+screen);
    		}
    	}
    	 
   
        new DriverFactory().destroyDriver();
    }
    

    @Given("user goes to {string} page")
    public void user_goes_to_log_in_page(String view) throws Exception {
    	
        boolean validView = false;
        for(Resources r:Resources.values()){
            if(r.toString().equals(view)){
                driver.get(r.getPath());
                validView=true;
            }
        }
        if(!validView){
            throw new IllegalArgumentException("Provide view in step does not exist");
        }
        


        	
        	
        	
    }

    @Given("I have a user with {string} email")
    public void iHaveAUserWithEmail(String email) throws Throwable {
        new LogInPage(driver).provideEmail(email);
    }
    @Given("password as {string}")
    public void password_as(String password) throws Throwable {
        new LogInPage(driver).providePassword(password);
    }

    @When("user choose to sign in")
    public void user_choose_to_sign_in() throws Throwable {
        new LogInPage(driver).signUp();
    }

    @Then("should be logged into application")
    public void should_be_logged_into_application() throws Throwable {
        Assert.assertTrue(new MainPage(driver).isWelcomeMessageDisplayed());
    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String message)throws Throwable {
        Assert.assertTrue(new LogInPage(driver).notFoundDivisDisplayed(message));
    }
}
