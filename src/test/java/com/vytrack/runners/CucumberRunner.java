package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/bookit/step_definitions",
        features = "src/test/resources/features",
        plugin = {
                "json:target/cucumber.json"

        },
//        tags = "@ui",
        dryRun = false

)
public class CucumberRunner {
}
