package com.BriteERP.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/BriteERP/step_definitions",
        dryRun = false,
        tags = "@login"

    )


public class BitrixRunner {
}
