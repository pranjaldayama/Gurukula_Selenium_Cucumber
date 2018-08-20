package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//To run features Create New Branch and Create New Staff in order
//features ={"src/test/java/features/CreateNewBranch.feature","src/test/java/features/CreateNewStaff.feature"}

//To run feature Create New Branch and Delete Branch Created
features ={"src/test/java/features/CreateNewBranch.feature","src/test/java/features/DeleteBranchesCreated.feature"}

//features = "src/test/java/features"
,glue = "stepDefinitions"
,plugin = {
        "html:target/Report", "json:target/cucumber.json",
        "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" }
)
public class testRunner {

}
