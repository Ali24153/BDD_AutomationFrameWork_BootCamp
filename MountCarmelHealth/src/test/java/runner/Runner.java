package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;





@RunWith(Cucumber.class)

@CucumberOptions(
// single feature file will only run HomePage.feature file
        // features = {"src/test/java/features/HomePage.feature"

        // will run all the file under feature
        features = {"src/test/java/features"},
        //the path of stepDefinitions file
        glue = "stepDefinitions",
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports/cucumber.html",
                "pretty:target/cucumber-reports/cucumber-pretty.txt","usage:target/cucumber-reports/cucumber-usage.json",
                "junit:target/cucumber-reports/cucumber-result.xml"
        },
        //it will check if any steps is not defined in step definition
        strict = true,
        // display the console output in proper readable format
        monochrome = true,
        // to check the mapping is proper between the feature file and step definition file
        dryRun = false,
        // it will publish our report
        publish = true,
        // will chose which tag we want to run
        //tags="(@smokeTesting)or(@test) or(@regressionTesting)or(not @pending)"
        tags="(@integrationTesting) "
)

public class Runner {
}
