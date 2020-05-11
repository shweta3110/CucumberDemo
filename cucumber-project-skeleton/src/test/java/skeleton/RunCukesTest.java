package skeleton;

//import org.junit.runner.RunWith;

//import cucumber.api.junit.Cucumber;

//import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = { "@casestudy1,@casestudy2,@casestudy3" }, plugin = { "pretty",
		"json:C:/Test_Report/cucumber.json" })
public class RunCukesTest {
	
}

