package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\14388\\eclipse-workspace\\mystoreecommerce_cucumber\\src\\main\\java\\com\\features\\searchproduct.feature",
glue= {"com.stepdefinations"},
format= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
	monochrome=true,
	strict=true,
    dryRun=false)
public class Testrunner {
}
