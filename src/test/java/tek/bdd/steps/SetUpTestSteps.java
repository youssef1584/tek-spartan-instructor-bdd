package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetUpTestSteps extends SeleniumUtility {






    @Then("validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo() {
        String topLeftCornerText = getElementText(By.className("top-nav__logo"));

        Assert.assertEquals("TEKSCHOOL", topLeftCornerText);


    }


    @Then("validate Sign in button is Enabled")
    public void validate_sign_in_button_is_enabled() {
       boolean isSignInButtonEnabled = isElementEnabled(By.xpath("//*[@id=\"signinLink\"]"));
       Assert.assertTrue(isSignInButtonEnabled);



    }




}