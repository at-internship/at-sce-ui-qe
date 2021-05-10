package com.at.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AdminPage {
    WebDriver webDriver;

    @FindBy(id = "principal")
    WebElement welcomeMessage;

    @FindBy(xpath = "//*[@id=\"principal\"]/div/section[1]/div/table/tbody/tr/td[2]/a")
    private WebElement ButtonNewUser;

    @FindBy(id = "user_type")
    private WebElement typeList;

    @FindBy(id = "user_firstName")
    private WebElement firstnameTextBox;

    @FindBy(id = "user_lastName")
    private WebElement lastnameTextBox;

    @FindBy(id = "user_email")
    private WebElement emailTextBox;

    @FindBy(id = "user_password")
    private WebElement passwordTextBox;

    @FindBy(id = "user_status")
    private WebElement statusList;

    @FindBy(xpath = "//*[@id=\"passwordHelpBlock\"]/small/div[2]/button")
    private WebElement ButtonSave;

    @FindBy(xpath = "//*[@id=\"usersTable\"]/tbody/tr/td[7]/a[1]/i")
    private WebElement ButtonEdit;

    @FindBy(xpath = "//*[@id=\"usersTable\"]/tbody/tr/td[7]/a[2]/i")
    private WebElement ButtonDelete;

    @FindBy(xpath = "//*[@id=\"usersTable_filter\"]/label/input")
    private WebElement userfilter;


    @FindBy(xpath = "/html/body/div/div[1]")
    private WebElement UserCreate;

    @FindBy(xpath = "/html/body/div/div[1]")
    private WebElement DeleteUser;

    @FindBy(xpath = "/html/body/div/div[1]")
    private WebElement UpdateUser;

    @FindBy(xpath = "/html/body/div/div[1]")
    private WebElement ErrorUser;

    public boolean isWelcomeMessageDisplayed() throws Throwable {
        return welcomeMessage.isDisplayed();
    }

    public AdminPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void user() throws Throwable {

        ButtonNewUser.click();

    }

    public void types(String user_type) throws Throwable {
        Thread.sleep(500);

         typeList.sendKeys(user_type);


    }

    public void firstname(String user_firstName) throws Throwable {

        WebDriverWait wait = new WebDriverWait(webDriver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_firstName")));
        firstnameTextBox.sendKeys(user_firstName);

    }

    public void lastname(String user_lastName) throws Throwable {
        WebDriverWait wait = new WebDriverWait(webDriver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_lastName")));
        lastnameTextBox.sendKeys(user_lastName);
    }

    public void Email(String user_email) throws Throwable {
        emailTextBox.sendKeys(user_email);

    }

    public void Password(String user_password) throws Throwable {
        passwordTextBox.sendKeys(user_password);
    }

    public void status(String user_status) throws Throwable {
        statusList.sendKeys(user_status);
    }

    public void save() throws Throwable {

        ButtonSave.click();
    }

    public void edit() throws Throwable {
        ButtonEdit.click();
    }

    public void delete() throws Throwable {
        ButtonDelete.click();
    }

    public boolean SaveDisplayed(String messageSave) throws Throwable {
        return UserCreate.getText().trim().contains(messageSave);
    }

    public boolean DeleteDisplayed(String messageDelete) throws Throwable{
        return DeleteUser.getText().trim().contains(messageDelete);
    }

    public boolean UpdateDisplayed(String messageUpdate) throws Throwable{
        return UpdateUser.getText().trim().contains(messageUpdate);

    }
    public boolean ErrorDisplayed(String messageError) throws Throwable{
        return ErrorUser.getText().trim().contains(messageError);

    }

    public void search(String usersTable_filter) throws Throwable {

        userfilter.click();
        userfilter.sendKeys(usersTable_filter);
    }
}







