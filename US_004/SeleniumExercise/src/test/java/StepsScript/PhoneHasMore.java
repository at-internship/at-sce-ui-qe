package StepsScript;

import io.cucumber.java.en.When;

public class PhoneHasMore {
	@When("user enters all fields correcly email phone has more than ten numbers")
	public void user_enters_all_fields_correcly_country_must_be_null() throws InterruptedException {
		Fields obj = new Fields();
	    obj.fieldAll("Guillermo","Campos","El pez #3","guillermo@hotmail.com","13245678906","F","Cricket","Android","Albania","1917","January","10","Guillermo44","Guillermo44"); 
	}
}
