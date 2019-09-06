package runnerClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	
	@CucumberOptions(
			features="./Features/a.feature",
			glue= {"stepDefinationFiles"},
			tags= {"@validLogin"},
			dryRun = false,
			monochrome	= true,
			strict	= false,
			plugin	= {"pretty", "junit:target/cucumber-reports/Cucumber.xml","html:test-out/Report.html"}
			
			)
	public class TestRunnerClass {
}
