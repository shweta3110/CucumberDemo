package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,  plugin={ "pretty", "html:cucumber-html-report" }, tags= { "@SanityTest" })
public class RunCukesTest {
}
