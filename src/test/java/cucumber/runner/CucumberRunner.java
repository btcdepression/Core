package cucumber.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html"},
        features = {"src/test/resources"},
        glue = {"cucumber.runner", "cucumber.hooks", "cucumber.stepdefs"}
//        tags = ("@Smoke and @negative")
)
public class CucumberRunner {
}