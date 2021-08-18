package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\ASS1\\Assignments\\selinium\\src\\test\\resources\\FeatureFolder\\login.feature",
		glue= {"stepdefinition"},
		plugin= {"json:target\\report.json"}
		)
public class RunnerClass {

}
