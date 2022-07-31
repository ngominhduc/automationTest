package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/LoginDemo.feature", glue={"StepDefinitions"}, monochrome = true,
        plugin = {"pretty","junit:target/jUnitReports/report.xml", "json:target/JSONReports/report.json", "html:target/HtmlReports"})
public class TestRunner {

}
