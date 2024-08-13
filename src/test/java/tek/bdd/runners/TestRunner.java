package tek.bdd.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        features = "C:\\Users\\youss\\IdeaProjects\\tek-spartan-instructor-bdd\\src\\test\\resources\\features\\SecurityTest.feature",// Directory for feature file
        glue = "tek.bdd.steps", // package for all the steps

        dryRun = false
)


public class TestRunner {









}
