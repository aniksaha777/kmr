package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\SAMMSALAPTOP1\\Desktop\\Automation\\MyGitHub\\CucumberTest\\src\\test\\java\\Features\\AFMOnlineJoin.feature",
		glue={"StepDefinations"},
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/cucumber.xml"},
		dryRun= false,
		monochrome= true,
		tags = {"@AFM"}
		)
public class testrunner {
 
}
