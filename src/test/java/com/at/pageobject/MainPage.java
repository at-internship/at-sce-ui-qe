package com.at.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MainPage {
    WebDriver webDriver;
    
    
    
    @FindBy(xpath = "//*[@id=\"navbarNav\"]/ul[2]/li[1]/a")
    private WebElement welcomeMessage;
    
    @FindBy(id = "projectWillCostYou")
    private WebElement projectWillCostYou;
    
    @FindBy(id = "taxesIVAandISR")
    private WebElement taxesIVAandISR;
    
    @FindBy(id = "charge")
    private WebElement charge;
    
    @FindBy(id = "revenue")
    private WebElement revenue;
    
    @FindBy(id = "costPerDay")
    private WebElement costPerDay;
    
    @FindBy(id = "costPerHour")
    private WebElement costPerHour;
    
    @FindBy(xpath = "/html/body/div/div/div/section/form/div[3]/button[1]")
    private WebElement calculateButton;
    
    @FindBy(xpath = "/html/body/div/div/div/section/form/div[3]/button[2]")
    private WebElement cleanButton;
    
    @FindBy(id = "rent")
    private WebElement rent;
    
    @FindBy(id = "transport")
    private WebElement transport;
    
    @FindBy(id = "telephone")
    private WebElement telephone;
    
    @FindBy(id = "feeding")
    private WebElement feeding;
    
    @FindBy(id = "others")
    private WebElement others;
    
    @FindBy(id = "hours")
    private WebElement hours;
    
    @FindBy(id = "days")
    private WebElement days;
    
    @FindBy(id = "projectCost")
    private WebElement projectCost;
    
    @FindBy(id = "projectType")
    private WebElement projectType;
    
   
    public MainPage (WebDriver driver){
        this.webDriver=driver;
        PageFactory.initElements(driver,this);
    }

    public boolean isWelcomeMessageDisplayed()throws Throwable{
        return welcomeMessage.isDisplayed();
    }
    
    public boolean getCostEstimation() throws Throwable{
    	
    	double valores[];
    	valores = new double[10];
    	int cont = 0;
    	valores[0]= Double.parseDouble(projectWillCostYou.getText().trim());
    	valores[1]= Double.parseDouble(taxesIVAandISR.getText().trim());
    	valores[2]= Double.parseDouble(charge.getText().trim());
    	valores[3]= Double.parseDouble(revenue.getText().trim());
    	valores[4]= Double.parseDouble(costPerDay.getText().trim());
    	valores[5]= Double.parseDouble(costPerHour.getText().trim());
    	
        for(int i = 0; i < 6;i++) {
        	if(valores[i] == 0.00) {
        		cont++;
        	}
        }
      if(cont == 6) {
    	  return true;
      }else {
    	  return false;
      }
        
    }
    
    public void clickCleanButton() throws InterruptedException {
    	System.out.println("Hola que tal");
    	
    	cleanButton.click();
    	
    }
    
    public String randomNumber(int x, int y) {
    	int numeroAleatorio = (int) (Math.random()*x+y);
		String result = Integer.toString(numeroAleatorio);
    	return result;
    }
    
    public void provideRent() {
    	
    	rent.sendKeys(randomNumber(25,1));
    	transport.sendKeys(randomNumber(25,1));
    	telephone.sendKeys(randomNumber(25,1));
    	feeding.sendKeys(randomNumber(25,1));
    	others.sendKeys(randomNumber(25,1));
    	hours.sendKeys(randomNumber(25,1));
    	days.sendKeys(randomNumber(25,1));
    	projectCost.sendKeys(randomNumber(25,1));
    	
    	Select selC = new Select(projectType);
		selC.selectByValue(randomNumber(4,1));
		
		calculateButton.click();
    }
}
