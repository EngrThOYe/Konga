package com.konga.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/com/konga/features"},
        glue = {"com/konga/hooks", "com/konga/stepDefinitions"},
        publish = true
)

public class TestRunner {
}
