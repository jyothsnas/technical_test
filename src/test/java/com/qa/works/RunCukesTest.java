package com.qa.works;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", plugin = "json:target/cucumber.json", strict = true)
public class RunCukesTest {
}
