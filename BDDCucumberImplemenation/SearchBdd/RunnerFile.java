package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = { "./src/test/resources/features" },
		glue = "stepdefinitions",
		monochrome = true, dryRun = false,
		tags = "@FirstCase",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},publish=true
)

public class RunnerFile extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
