import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
strict = true,
features = {"C:/Users/dita.sari/IdeaProjects/SctGlobal/src/test/resources/features/training/training.feature"},
plugin = {"json:C:/Users/dita.sari/IdeaProjects/SctGlobal/target/cucumber-parallel/4.json"},
monochrome = false,
tags = {"~@sequence"},
glue = {"tests"})
public class Parallel04IT {
}