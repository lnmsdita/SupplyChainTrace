package tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/training",
        plugin = {"json:target/cucumber-parallel/tm4j_result.json"})

public class runnerTestSuite {

}
