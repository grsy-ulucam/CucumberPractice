package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/02_SeleniumTasks.feature"},
        glue = {"stepdefinitions"}
)



public class RunnerBackground {
}
