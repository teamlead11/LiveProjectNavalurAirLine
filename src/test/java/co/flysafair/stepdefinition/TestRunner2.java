package co.flysafair.stepdefinition;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/HomeOneWayFlightSearch.feature", glue = { "co.flysafair.stepdefinition" }, plugin = {
		 }, tags = {}, monochrome = true, dryRun = false, strict = true)

public class TestRunner2 {

}
