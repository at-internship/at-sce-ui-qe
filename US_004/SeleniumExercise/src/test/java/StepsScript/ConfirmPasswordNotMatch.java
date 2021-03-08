package StepsScript;

import io.cucumber.java.en.When;

public class ConfirmPasswordNotMatch {
	@When("Error when confirm password not match with password")
	public void user_enters_all_fields_correcly_execpt_email_must_be_null() throws InterruptedException {
		Fields obj = new Fields();
	    obj.fieldAll("Guillermo","Campos","El pez #3","guillermo@hotmial.com","3320667774","F","Cricket","Android","Angola","1917","January","10","Guillermo44","Guillermo4");
	}
}
