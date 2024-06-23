package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    

@CucumberOptions(features = {".src/test/resources/features/Tree.feature"}, 
                 glue = {"stepdefinitions", "hooks"})    
public class TestRunner extends AbstractTestNGCucumberTests {
    
}			