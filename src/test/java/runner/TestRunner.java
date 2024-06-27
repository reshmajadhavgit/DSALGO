package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    

@CucumberOptions(features = {"C:/Users/reshm/DSALGO-Final/DSALGO/src/test/resources/features/Login.feature"}, 
                 glue = {"stepdefinitions", "hooks"},
                 plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})    
public class TestRunner extends AbstractTestNGCucumberTests {
    
}			