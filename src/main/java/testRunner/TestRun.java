package testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//src/main/Features/Login.feature",
        glue = "stepDefinitions",
        dryRun = false,
       // monochrome = true,
        plugin = {"pretty",
        "html:test-output"}

)
public class TestRun {
}
