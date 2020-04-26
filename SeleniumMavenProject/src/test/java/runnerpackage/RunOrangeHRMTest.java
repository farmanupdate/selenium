package runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FrameworkFolder/Demo1.feature", glue= "", plugin = {"html:Results","pretty"}, monochrome = true )

public class RunOrangeHRMTest 
{

	

}
