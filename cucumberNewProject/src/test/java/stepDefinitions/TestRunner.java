package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/Login.feature",		
		glue= "stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"junit:target/cucumber-reports/cucumber.xml",
				"json:target/cucumber-reports/cucumber.json",
				"html:target/cucumber-reports/cucumber.html",
				}
				)
public class TestRunner {

}