package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
     (
    		 features="Feature",
    		 tags= {"@Login"}
    		 ,glue= {"stepDefinition"}
    		 
		)
public class TestRunner {

}
