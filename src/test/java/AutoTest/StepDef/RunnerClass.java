package AutoTest.StepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber",
		"json:target/cucumber-report.json" },
		features = {"./src/test/resources/"},
				tags = {"~@Regression","@duper"}
        		 )
public class RunnerClass {

}
