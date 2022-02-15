package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports",
                  "rerun:target/rerun.txt"},

        //jason is another type of storing information, we use it to store report info in a key-
        //and-value structure (like Maps interface). It's just like an XML file which is full of Jason values.
        //With the plugin = "json:target/cucumber.json" code, we want cucumber to create an execution report jason file.
        //when we run our cukesrunner with this plugin, cucumber.jason file is created under the target file in red.
        //Our responsibility is that we're gonno be sure if this file is created or not.
        //Jason will need cucumber.jason file to create the report for us.
        //cucumber.jason contains executions of the steps of our scenarios

        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {

}
