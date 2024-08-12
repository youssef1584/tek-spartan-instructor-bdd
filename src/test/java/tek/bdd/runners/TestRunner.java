package tek.bdd.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        features = "C:\\Users\\youss\\IdeaProjects\\tek-spartan-instructor-bdd\\src\\test\\resources\\features\\SetupTest.feature",// Directory for feature file
        glue = "tek.bdd.steps" // package for all the steps
)


public class TestRunner {









}
