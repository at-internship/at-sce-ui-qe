package com.at.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
	 WebDriver webDriver;
	 
	 @FindBy(xpath = "//a[contains(text(),'» Users')]")
	    private WebElement userButton;
	 
	 @FindBy(name = "usersTable_length")
	    private WebElement usersTable;
	 
	 public AdminPage(WebDriver driver){
	        this.webDriver = driver;
	        PageFactory.initElements(driver,this);
	    }
	 
	 public void clickOnUserButton() throws Throwable{
		 userButton.click();
	    }
	 
	 public void scrollDown() throws Throwable{
		 JavascriptExecutor js = ((JavascriptExecutor) webDriver);
	     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    }
	 public void setShowNumber(String s) {
		 Select selC = new Select(usersTable);
		 selC.selectByValue(s);
	 }
	 
}
