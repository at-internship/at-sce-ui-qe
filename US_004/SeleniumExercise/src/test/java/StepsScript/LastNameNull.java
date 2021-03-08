package StepsScript;

import io.cucumber.java.en.When;

public class LastNameNull {
	@When("user enters all fields correcly execpt last name must be null")
	public void user_enters_all_fields_correcly_execpt_last_name_must_be_null() throws InterruptedException {
		Fields obj = new Fields();
	    obj.fieldAll("Guillermo","","El pez #3","guillermo@gmail.com","3320667774","M","Mobies","Android","Albania","1917","January","10","Guillermo44","Guillermo44");
	}
}
