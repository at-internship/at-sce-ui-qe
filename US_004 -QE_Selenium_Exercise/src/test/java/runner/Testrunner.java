package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "src/test/java/features",
    glue = ("seleniumcode"),
        monochrome = true,
        plugin = {"pretty","junit:target/JUnitReports/report.xml",
        "json:target/JSONReports/report.json",
        "html:target/HtmlReports/index.html"
}
)
public class Testrunner {
}
