package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
<<<<<<< HEAD
@CucumberOptions(features = {"src/test/resources/features/Tree.feature"}, 
=======
@CucumberOptions(features = {"/Users/parikshit/workspace/DSALGO/src/test/resources/features"}, 
>>>>>>> 1ccb3c61f147bd8f39e1d0da09d587232e00a9ae
                 glue = {"stepdefinitions", "hooks"})
    
public class TestRunner extends AbstractTestNGCucumberTests {
    
}			