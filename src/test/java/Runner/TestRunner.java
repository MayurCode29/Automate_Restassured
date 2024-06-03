package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  
		
		features ="src/test/resources/Feature",
		glue="APIStepDefinition",
		dryRun=true,
		plugin={ "pretty", "json:target/cucumber-reports/Cucumber.json",
	             "junit:target/cucumber-reports/Cucumber.xml",
	             "html:target/cucumber-reports.html"},
		tags="@test"
		
		
		)

public class TestRunner {

}
