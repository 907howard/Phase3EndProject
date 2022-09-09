package in.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features ="Features"
			, glue = "in.swiggy.testscripts"
			, plugin = {"progress", "html:target/Cucumber.html"}
			//, dryrun = true
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	

}
