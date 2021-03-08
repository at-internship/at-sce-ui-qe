package StepsScript;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/FormTest.feature",glue= {"StepsScript"},
monochrome = true,
tags="@TC_004",
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports/index.html"
		}

		)
public class TestRunnerBackdround {

}
