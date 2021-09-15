package com.ea.SpringBasic.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"src/test/java/com/ea/SpringBasic/features"},
        //tags = {"@currentTest"},
        // Below plugin is create json report and later it will be parsed into html by maven-cucumber-reporting plugin
        plugin = {"json:target/cucumber.json", "pretty"},
        glue = "com.ea.SpringBasic.steps"
        //monochrome = true
)

// Cucumber runner with extending TestNG cucumber Tests class
public class TestRunner extends AbstractTestNGCucumberTests {
    // Allows to execute cucumber tests scenarios in parallel
    // In case of false - it will show error NoSuchSession Session ID is null
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}