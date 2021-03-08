package StepsScript;

import io.cucumber.java.en.When;

public class Password {
	@When("user enters all fields correcly password must be null")
	public void user_enters_all_fields_correcly_gender_must_be_null() throws InterruptedException {
		Fields obj = new Fields();
	    obj.fieldAll("Guillermo","Campos","El pez #3","guillermo@hotmail.com","1324567890","F","Cricket","Android","Albania","1917","January","10","","Guillermo44"); 
	}

}
