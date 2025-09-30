package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/testdesign"},
        glue = {"stepdefinations","hooks"},
        plugin = {"pretty",
                "html:target/reports/testresult.html",
                "json:target/reports/jsonresult.json",
                "junit:target/reports/junitresult.xml"},
        tags = "@amazon01"

)

public class Runner {
}
