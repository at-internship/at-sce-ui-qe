package com.at.stepdefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "com.at.stepdefinitions",
tags = "@MainPage and @1",
plugin={"de.monochromata.cucumber.report.PrettyReports:target/cucumber"})
public class RunCakeTest {
}
