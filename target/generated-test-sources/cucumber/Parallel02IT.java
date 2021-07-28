import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
strict = true,
features = {"C:/Users/dita.sari/IdeaProjects/SctGlobal/src/test/resources/features/loginSct/loginSct.feature"},
plugin = {"json:C:/Users/dita.sari/IdeaProjects/SctGlobal/target/cucumber-parallel/2.json"},
monochrome = false,
tags = {"~@sequence"},
glue = {"tests"})
public class Parallel02IT {
}