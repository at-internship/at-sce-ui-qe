package StepsScript;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstNameNull {
	@Given("user is on main page")
	public void user_is_on_main_page() {
		System.out.println("New register was created succesfully");
	}

	@When("user enters all fields correcly execpt firstname must be null")
	public void user_enters_all_fields_correcly_execpt_firstname_must_be_null() throws InterruptedException {
		Fields obj = new Fields();
	    obj.fieldAll("","Hola","El pez #3","guillermo@gmail.com","3320667774","F","Cricket","Android","Albania","1917","January","10","Guillermo44","Guillermo44");
	}

	@Then("Click on Submit")
	public void click_on_submit() throws InterruptedException {
	    System.out.println("New register was created succesfully");
	    Fields obj = new Fields();
	    obj.EndStep();
	}
}
