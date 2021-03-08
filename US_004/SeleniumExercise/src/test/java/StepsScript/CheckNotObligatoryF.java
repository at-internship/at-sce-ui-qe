package StepsScript;

import io.cucumber.java.en.When;

public class CheckNotObligatoryF {
	@When("Check if not obligatory fields are abligatories fields")
	public void user_enters_all_fields_correcly_execpt_email_must_be_null() throws InterruptedException {
		Fields obj = new Fields();
	    obj.fieldAll("Guillermo","Campos","","guillermo@hotmial.com","3320667774","M","","","Afghanistan","1917","January","10","Guillermo44","Guillermo44");
	}
}
