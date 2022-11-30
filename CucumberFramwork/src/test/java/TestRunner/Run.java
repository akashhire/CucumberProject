package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/LoginFeature.feature",
glue="stepdefination", 
dryRun = false,
monochrome= true,
plugin= {"pretty", "html:target/Reports/reposrts.html"}
		)


public class Run {
	
	
}
