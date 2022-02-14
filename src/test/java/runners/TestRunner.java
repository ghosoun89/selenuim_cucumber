package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "steps",plugin = {"pretty", "html:target/reports/report.html", "json:target/reports/report.json"})
// plugin  => "pretty"to print the result in console
//monochrome = true to print the result ini the console in pretty way
//tags = "@Sanity",
//, dryRun = true
public class TestRunner {
}
