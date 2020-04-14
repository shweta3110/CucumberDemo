package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:skeleton" }, glue = { "classpath:skeleton" }, plugin = { "pretty",
		"json:C:/Test_Report/cucumber.json" }, tags = { "@DemoWebShop" })
public class RunCukesTest {
}
