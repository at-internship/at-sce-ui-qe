package com.at.pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    WebDriver webDriver;

    @FindBy(name = "email")
    private WebElement emailTextBox;

    @FindBy(name = "password")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    private WebElement signInButtn;

    @FindBy(xpath = "//body/div[1]/div[1]")
    private WebElement notFoundDiv;

    public LogInPage(WebDriver driver){
        this.webDriver = driver;
        PageFactory.initElements(driver,this);
    }

    public void provideEmail(String email) throws Throwable{
        emailTextBox.sendKeys(email);
    }

    public void providePassword(String password)throws Throwable{
        passwordTextBox.sendKeys(password);
    }

    public void signUp() throws Throwable{
        signInButtn.click();
    }

    public boolean notFoundDivisDisplayed(String message) throws Throwable{
        return notFoundDiv.getText().trim().contains(message);
    }
}
