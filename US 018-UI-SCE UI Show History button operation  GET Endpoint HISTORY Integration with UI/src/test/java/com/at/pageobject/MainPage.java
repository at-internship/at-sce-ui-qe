package com.at.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    WebDriver webDriver;

    @FindBy(id="principal")
    WebElement welcomeMessage;


    @FindBy(className ="switch")
    private WebElement buttonhistory;

    public MainPage (WebDriver driver){
        this.webDriver=driver;
        PageFactory.initElements(driver,this);
    }

    public boolean isWelcomeMessageDisplayed()throws Throwable{
        return welcomeMessage.isDisplayed();
    }
    public void history() throws Throwable{
        buttonhistory.click();

    }

}
