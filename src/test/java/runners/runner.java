package runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;


@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/userregister.feature",
        glue = "stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class runner {
}