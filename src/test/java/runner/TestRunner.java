package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(features = {"/Users/parikshit/workspace/DSALGO/src/test/resources/features"}, 
                 glue = {"stepdefinitions", "hooks"})
    
public class TestRunner extends AbstractTestNGCucumberTests {
    
}			