package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetUpTestSteps extends SeleniumUtility {

    @Given("open browser and navigate to retail app")
    public void openBrowserAndNavigate(){
        setupBrowser();


    }
    @Then("validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo(){
        String topLeftCornerText = getElementText(By.className("top-nav__logo"));

        Assert.assertEquals("TEKSCHOOL" , topLeftCornerText);

        //System.out.println(text);
    }

    @Then("close the browser")
        public void closeBrowser(){
            quitBrowser();
        }



}
