package StepsScript;

import io.cucumber.java.en.When;

public class ErrorPasswordLess {
	@When("user enters all fields correcly password contains less six characters")
	public void user_enters_all_fields_correcly_execpt_email_must_be_null() throws InterruptedException {
		Fields obj = new Fields();
	    obj.fieldAll("Guillermo","Campos","El pez #3","guillermo@hotmial.com","3320667774","F","Cricket","Android","Albania","1917","January","10","Guil5","Guillermo44");
	}
}

