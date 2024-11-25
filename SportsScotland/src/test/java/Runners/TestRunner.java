package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/features/Main.feature",
glue={"Steps","Hooks"},
publish=true,
//tags="@NumaTesting",
plugin= {"pretty","html:target/reports/CucumberReports.html"}
)


public class TestRunner {

}