package StepsScript;

import io.cucumber.java.en.When;

public class PhoneNotNumbers {
	@When("user enters all fields correcly email phone phone contains not numbers")
	public void user_enters_all_fields_correcly_country_must_be_null() throws InterruptedException {
		Fields obj = new Fields();
	    obj.fieldAll("Guillermo","Campos","El pez #3","guillermo@hotmail.com","132456a89","F","Cricket","Android","Albania","1917","January","10","Guillermo44","Guillermo44"); 
	}
}
