package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags ="", features = {"src/test/resources/features"},
glue = {"com.stepdefinations"}, plugin = {"pretty","html:target/htmlreport.html","json:target/jsonReports/report.json"}

)

public class Runner {


}
