package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue="stepdefs")
public  class RunnerTestNGTest extends AbstractTestNGCucumberTests {

}
