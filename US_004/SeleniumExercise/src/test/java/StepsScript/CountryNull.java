package StepsScript;

import io.cucumber.java.en.When;

public class CountryNull {

@When("user enters all fields correcly country must be null")
public void user_enters_all_fields_correcly_country_must_be_null() throws InterruptedException {
	Fields obj = new Fields();
    obj.fieldAll("Guillermo","Campos","El pez #3","guillermo@hotmail.com","1324567890","F","Cricket","Android","","1917","January","10","Guillermo44","Guillermo44"); 
}
}
