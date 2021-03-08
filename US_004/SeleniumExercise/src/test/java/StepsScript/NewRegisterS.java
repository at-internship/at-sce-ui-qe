package StepsScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewRegisterS {
	public WebDriver driver = null;
	
	@Given("user is on page")
	public void user_is_on_page() {
	    /*System.out.println("User is on page");
	    String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("http://demo.automationtesting.in/Register.html");
	    */
	}

	@When("user enters all fields correcly")
	public void user_enters_all_fields_correcly() throws InterruptedException {
		System.out.println("User enter all fields complete and correctly");
		Fields obj = new Fields();
	    obj.fieldAll("guillermo","Espinosa","La paz #3","gullermo@hotmail.com","1234567890","M","Hoockey","Android","Australia","1916","January","5","Guillermo44","Guillermo44");
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() throws InterruptedException {
	    System.out.println("New register was created succesfully");
	    Fields obj = new Fields();
	    obj.EndStep();
	}
}
