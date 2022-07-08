package RedBusBDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(plugin = {"pretty", "html:target/Destination"})
features = { "/BDDAutomationPractice/src/test/java/RedBusBDD/Search.feature" },
		glue = "SearchStepDef",
		monochrome = true, dryRun = false,
		tags = "@RegressionTest")
		



public class SearchRunner {

}

