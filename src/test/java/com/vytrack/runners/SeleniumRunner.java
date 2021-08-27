package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue="com/vtrack/step_definition",
        tags = "@LoginAs",
        dryRun=true,
        plugin = {
        "json:target/cucumber.json"

}



)
public class SeleniumRunner {

}
