import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jubin on 5/27/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty","html:target/cucumber"})
public class CucumberRunner {
}